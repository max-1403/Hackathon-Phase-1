package hackathon;
import java.util.Scanner;
public class Status{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of waste collected in kilograms: ");
        double wasteCollectedKg = scanner.nextDouble();

        if (wasteCollectedKg >= 100.0) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }

        scanner.close();
    }
}
