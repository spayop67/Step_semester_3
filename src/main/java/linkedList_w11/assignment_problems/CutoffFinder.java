package linkedList_w11.assignment_problems;

public class CutoffFinder {
    static int kthHighest(int[] marks, int k) {
        int[] arr = marks.clone();
        int target = arr.length - k;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int pivotIndex = partition(arr, left, right);
            if (pivotIndex == target) {
                return arr[pivotIndex];
            } else if (pivotIndex < target) {
                left = pivotIndex + 1;
            } else {
                right = pivotIndex - 1;
            }
        }
        return -1;
    }
    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[right];
        arr[right] = temp;
        return i;
    }
}