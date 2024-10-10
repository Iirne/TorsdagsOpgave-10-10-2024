import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    private ArrayList<String> coffeeMenu = new ArrayList<>();

    public void loadMenuData() {
        File file = new File("doc/coffees.txt");

        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNext()) {
                String scanline = scan.nextLine();
                coffeeMenu.add(scanline);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found" + e.getMessage());
        }
    }

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }
}
