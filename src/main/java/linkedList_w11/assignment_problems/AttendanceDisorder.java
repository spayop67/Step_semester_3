package linkedList_w11.assignment_problems;

public class AttendanceDisorder {
    static long countInversions(int[] roll) {
        int[] copy = roll.clone();
        int[] temp = new int[copy.length];
        return sortAndCount(copy, temp, 0, copy.length - 1);
    }
    private static long sortAndCount(int[] arr, int[] temp, int left, int right) {
        if (left >= right) {
            return 0;
        }
        int mid = left + (right - left) / 2;
        long count = 0;
        count += sortAndCount(arr, temp, left, mid);
        count += sortAndCount(arr, temp, mid + 1, right);
        count += mergeAndCount(arr, temp, left, mid, right);
        return count;
    }
    private static long mergeAndCount(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;
        long count = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i + 1);
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (int x = left; x <= right; x++) {
            arr[x] = temp[x];
        }
        return count;
    }
}