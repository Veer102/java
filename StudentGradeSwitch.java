import java.util.Scanner;

public class StudentGradeSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Must be between 0 and 100.");
            return;
        }

        char grade;
        switch (marks / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            case 5:
                grade = 'E';
                break;
            default:
                grade = 'F';
                break;
        }

        System.out.println("Marks: " + marks + "/100");
        System.out.println("Grade: " + grade);
    }
}
