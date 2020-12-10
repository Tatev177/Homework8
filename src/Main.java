import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        String[] read = FileService.read("src\\humans.txt");
        System.out.println(Arrays.toString(read));

        String s = Arrays.toString(read).substring(1, Arrays.toString(read).length()-1);
        System.out.println(s);

        String[] row = s.split(" ");
        StudentsService ss = new StudentsService();
        Students[] student = new Students[row.length];

        int newLength = ss.fillStudents(student,row);


        System.out.println("************************************");
        System.out.println("Task 1: Print full names of students");
        StudentsService.fullNames(student, newLength);
        System.out.println("*******************************");
        System.out.println("Task 2: Print all male students");
        StudentsService.maleStudents(student,newLength);
        System.out.println("***************************************************************");
        System.out.println("Task 3: Print female student who has the mark greater then 50.4");
        StudentsService.femaleStudentsMark(student, newLength);
        System.out.println("********************************************************************");
        System.out.println("Task 4: Print all female student information having the minimal mark");
        StudentsService.minMark(student, newLength);
        System.out.println("************************************************");
        System.out.println("Task 5: Print biggest female student information");
        StudentsService.biggestMaleStudent(student, newLength);
        System.out.println("*************************************");
        System.out.println("Task 6: Print students sorted by mark");
        System.out.println("can't solve this problem");

        System.out.println("************************************************");
        System.out.println("Task 7: Print female students sorted by year");
        System.out.println("the same problem as in task 6");
    }
}
