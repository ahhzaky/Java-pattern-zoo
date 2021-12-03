import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * MainPatternZoo
 */
public class MainPatternZoo {

    private static int choice;

    public static void main(String args[]) throws NumberFormatException, IOException {

        // Initial Object
        Subject subject = new Subject();
        new DishGiven(subject);
        new DishNotGiven(subject);

        // Print Menu
        System.out.print("========= Kebun Binatang ============ \n");
        System.out.print("            1. Beri Makanan pada Binatang    \n");
        System.out.print("            2. Stock makanan habis       \n");
        System.out.print("Enter your choice: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        choice = Integer.parseInt(br.readLine());

        switch (choice) {
            case 1: {
                // Give meals
                Meals tg = new Meals();
                System.out.println("Binatang telah " + tg.giveFood() + " dan " + tg.giveDrink());
                System.out.print("Notify: ");
                subject.setState("yes");
            }
                break;
            case 2: {
                // Not Give meals
                Meals tg = new Meals();
                System.out.println("Binatang belum " + tg.giveFood() + " dan " + tg.giveDrink());
                System.out.print("Notify: ");
                subject.setState("Not");
            }
                break;
            default:
                break;
        }
    }
}