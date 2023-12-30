import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to SuperFast Rollercoaster!");
        System.out.print("Please enter your height in cm:");

        int height = scanner.nextInt();

        if (height > 130 && height < 210) {
            System.out.println("Go on enjoy");

        }
        else {

            System.out.println("Sorry you do not meet the height requirements...");
        }

    }
}