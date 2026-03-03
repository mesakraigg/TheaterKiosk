import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;

        System.out.print("Enter your age: ");

        if (in.hasNextInt()) {
            age = in.nextInt();

            if (age >= 21) {
                System.out.println("You get a paper wrist band.");
            }
        }
    }
}