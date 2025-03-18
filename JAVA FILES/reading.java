import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class reading {
    public static void main(String[] args) {
        
    try (FileWriter writer = new FileWriter("hotdog.txt")) {
        writer.write("Hotdog\n");
        System.out.println("File written successfully");

        File file = new File("hotdog.txt");
        System.out.println("File created at: " + file.getAbsolutePath());

    } catch (IOException e) {
        System.out.println("An error occurred");
        e.printStackTrace();    
    }

    try (FileReader reader = new FileReader("hotdog.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
