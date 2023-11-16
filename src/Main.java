import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    // change person name method


    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        // create a file
        File file = new File("products.txt");
        //create a new file if it doesn't exist
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                out.println("Error: " + e.getMessage());
            }
        }
        // file reader
        PrintWriter writer = new PrintWriter(file);
        Scanner fileReader = new Scanner(file);
        //while loop for simple user interface with input and switch options
        while (true) {
            out.println("1. Add product");
            out.println("2. Print products");
            out.println("3. Change product price");
            out.println("4. Change product quantity");
            out.println("5. Exit");
            out.print("Your choice: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                   //use scanner class to take input, and store it inside a file
                    out.print("Name: ");
                    String name = scanner.nextLine();
                    out.print("Price: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    out.print("Quantity: ");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    Product product = new Product(name, price, quantity);
                    writer.println(product.toString());
                    writer.flush();
                    break;
                case 2:
                    while(fileReader.hasNextLine()){
                        String line = fileReader.nextLine();
                        out.println(line);
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    out.println("Invalid choice");
                    break;
            }
        }
    }
}