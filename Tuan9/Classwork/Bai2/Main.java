import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String data="";
        try {
            File file = new File("input.txt");
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                data += input.nextLine();
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
        data=data.toUpperCase();
        try {
            FileWriter file = new FileWriter("output.txt");
            file.write(data);
            file.close();
            System.out.println("Done!!");
        }catch (IOException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}