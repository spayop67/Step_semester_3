package DS_w10.class_problems;

public class ClubMember {
    private String rollNumber;
    private String name;
    public ClubMember(String rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }
    public String getRollNumber() {
        return rollNumber;
    }
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClubMember)) return false;
        ClubMember other = (ClubMember) o;
        return rollNumber.equals(other.rollNumber);
    }
    @Override
    public int hashCode() {
        return rollNumber.hashCode();
    }
}