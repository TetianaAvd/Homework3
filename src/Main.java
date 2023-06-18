import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("student’s grade: ");
    int grade = scanner.nextInt();

        if(grade >= 90){
            System.out.println("B");
        } else if(grade >= 60){
            System.out.println("E");
        }
    }
}