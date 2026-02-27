import java.util.*;

public class DataSorter {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== Data Sorter Menu =====");
            System.out.println("1. Enter Numbers Manually");
            System.out.println("2. Generate Random Numbers");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manualInput();
                    break;
                case 2:
                    randomInput();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    static void manualInput() {
        System.out.print("How many numbers do you want to enter? ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Numbers entered successfully!");
    }

    static void randomInput() {
        System.out.print("How many random numbers to generate? ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(1000);
        }

        System.out.println("Random numbers generated successfully!");
    }
}