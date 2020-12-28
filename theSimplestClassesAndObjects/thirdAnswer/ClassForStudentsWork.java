package theSimplestClassesAndObjects.thirdAnswer;

public class ClassForStudentsWork {
    public static void outBestStudent(Student[] students){
        for (int i = 0; i < students.length; i++) {
            if(bestAcademicPerformance(students[i])){
                System.out.println(students[i].getLastName()+" "+students[i].getGroupNumber());
            }
        }
    }

    private static boolean bestAcademicPerformance(Student student){
        for (int i = 0; i < student.getAcademicPerformance().length; i++) {
            if(student.getAcademicPerformance()[i]<9){
                return false;
            }
        }
        return true;
    }
}
