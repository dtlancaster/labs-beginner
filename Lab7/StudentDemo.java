import java.util.Scanner;

/**
 * Write a description of class StudentDemo here.
 * 
 * @author Dylan Lancaster
 * @version 10/23/2019
 */
public class StudentDemo
{
    /**
     * Main method.
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        System.out.print("Please enter the number of "
                        + "credits you have earned: ");
        int credits = sc.nextInt();

        System.out.print("Please enter your average grade: ");
        double averageGrade = sc.nextDouble();

        System.out.print("Please enter the number of "
                        + "credits required for your major: ");
        int requiredCredits = sc.nextInt();
        
        Student student = new Student(name, credits, averageGrade);

        System.out.println("\nHello " + student.getStudentName() + ".");
        System.out.println("The letter grade corresponding to "
                            + "your average grade is "
                            + student.letterGrade() + ".");
        System.out.println("This grade is "
                            + student.hasPassed(student.letterGrade()) + ".");
        System.out.printf("The number of grade credits you have "
                            + "earned is %.2f.\n\n",
                            student.gradeCredits(requiredCredits));
    }
}
