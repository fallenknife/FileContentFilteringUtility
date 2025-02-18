package task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileReadingHandler {


    public static ArrayList<ArrayList<String>> filesToStringArray(ArrayList<String> filenames) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();

        for (int i = 0; i < filenames.size(); i++) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filenames.get(i)))) {
                String line;
                int j = 0;
                ArrayList<String> file = new ArrayList<>();
                while ((line = reader.readLine()) != null) {
                    file.add(j++, line);
                }
                result.add(i, file);
            } catch (Exception e) {
                System.err.println("Error occurred: " + e.getMessage());

            }
        }

        return result;
    }
}
