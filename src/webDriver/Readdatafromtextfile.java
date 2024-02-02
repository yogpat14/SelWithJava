package webDriver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Readdatafromtextfile {

    public static void main(String[] args) throws IOException {
       
        ArrayList<String> data = new ArrayList<>();

        String filePath = "C:\\Users\\yoges\\OneDrive\\Desktop\\Selenium\\data.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) 
        {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                data.add(line);
            }
        }

        for (String line : data) 
        {
            System.out.println(line);
        }
    }
}