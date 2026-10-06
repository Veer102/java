import java.util.Scanner;

// Base class for Student academics
class Student {
    int academic;

    void setAcademic(int m) {
        academic = m;
    }

    int getAcademic() {
        return academic;
    }
}

// Interface for fixed Sports Grace Marks
interface Sports {
    int GRACE = 25; // Fixed grace marks for National Games/Olympics participants

    int getSportsMarks();
}

// Derived class implementing Sports and extending Student
class Result extends Student implements Sports {
    boolean isAthlete;

    Result(boolean isAthlete) {
        this.isAthlete = isAthlete;
    }

    public int getSportsMarks() {
        return isAthlete ? GRACE : 0;
    }

    int total() {
        return getAcademic() + getSportsMarks();
    }
}

public class UniversitySportsGrace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter academic marks: ");
        int m = sc.nextInt();
        System.out.print("Participated in National Games/Olympics? (true/false): ");
        boolean p = sc.nextBoolean();

        Result res = new Result(p);

        // Invoking base class method using Base Class reference
        Student stRef = res;
        stRef.setAcademic(m);

        // Invoking interface method using Interface reference
        Sports spRef = res;

        System.out.println("\n--- Student Result Summary ---");
        System.out.println("Academic marks : " + stRef.getAcademic());
        System.out.println("Sports grace   : " + spRef.getSportsMarks());
        System.out.println("Total marks    : " + res.total());
    }
}
