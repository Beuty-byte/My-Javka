package theSimplestClassesAndObjects.thirdAnswer;

public class Student {
    private String lastName;
    private String initials;
    private int groupNumber;
    private int[] academicPerformance;

    public Student(String lastName, String initials, int groupNumber, int[] academicPerformance) {
        this.lastName = lastName;
        this.initials = initials;
        this.groupNumber = groupNumber;
        this.academicPerformance = academicPerformance;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int[] getAcademicPerformance() {
        return academicPerformance;
    }


}
