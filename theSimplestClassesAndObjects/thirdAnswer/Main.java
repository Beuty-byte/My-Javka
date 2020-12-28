package theSimplestClassesAndObjects.thirdAnswer;

public class Main {
    public static void main(String[] args) {
        int[] student1Appraisals = {5,7,9,9,7};
        int[] student2Appraisals = {5,7,9,9,7};
        int[] student3Appraisals = {5,7,9,9,7};
        int[] student4Appraisals = {5,7,9,9,7};
        int[] student5Appraisals = {5,7,9,9,7};
        int[] student6Appraisals = {5,7,9,9,7};
        int[] student7Appraisals = {9,9,9,9,9};
        int[] student8Appraisals = {10,10,9,9,10};
        int[] student9Appraisals = {10,10,10,10,10};
        int[] student10Appraisals = {5,7,9,9,7};

        Student student1 = new Student("Karpov","B.S",3,student1Appraisals);
        Student student2 = new Student("Bozhenov","B.S",3,student2Appraisals);
        Student student3 = new Student("Kiselova","B.S",3,student3Appraisals);
        Student student4 = new Student("Nevzorov","B.S",3,student4Appraisals);
        Student student5 = new Student("Bronxu","B.S",3,student5Appraisals);
        Student student6 = new Student("Chehov","B.S",3,student6Appraisals);
        Student student7 = new Student("Enshtein","B.S",3,student7Appraisals);
        Student student8 = new Student("Gureev","B.S",3,student8Appraisals);
        Student student9 = new Student("Barkov","B.S",3,student9Appraisals);
        Student student10 = new Student("Entotov","B.S",3,student10Appraisals);

        Student[] students = {student1,student2,student3,student4,student5,student6,student7,student8,student9,student10};


        ClassForStudentsWork.outBestStudent(students);
    }


}
