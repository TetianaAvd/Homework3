import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("student’s grade: ");
        int grade = scanner.nextInt();

        if (grade >= 91 && grade <= 100) {
            System.out.println("A");
        } else if (grade >= 81 && grade <= 90) {
            System.out.println("B");
        } else if (grade >= 71 && grade <= 80) {
            System.out.println("C");
        } else if (grade >= 61 && grade <= 70) {
            System.out.println("D");
        } else if (grade >= 0 && grade <= 60) {
            System.out.println("E");
        }
    }
}