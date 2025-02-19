package task;

import java.io.FileWriter;
import java.io.IOException;

import static task.util.*;

public class WriteDataToFile {
    public static void writeToFiles() {
        placeIntegers();
        placeFloats();
        placeStrings();
    }

    private static void placeIntegers() {
        String name = "integers.txt";
        if (!namePrefix.isEmpty()) {
            name = namePrefix + name;
        }

        if (!outputPath.isEmpty()) {
            name = (outputPath.endsWith("/") ? outputPath : outputPath + "/") + name;
        }

        try (FileWriter writer = new FileWriter(name, appendMode)) {
            for (Long i : integerList) {
                writer.write(Long.toString(i));
                writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Error occurred writing Integer: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void placeFloats() {
        String name = "floats.txt";
        if (!namePrefix.isEmpty()) {
            name = namePrefix + name;
        }

        if (!outputPath.isEmpty()) {
            name = (outputPath.endsWith("/") ? outputPath : outputPath + "/") + name;
        }

        try (FileWriter writer = new FileWriter(name, appendMode)) {
            for (Double i : floatList) {
                writer.write(Double.toString(i));
                writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Error occurred writing Float: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void placeStrings() {
        String name = "strings.txt";
        if (!namePrefix.isEmpty()) {
            name = namePrefix + name;
        }

        if (!outputPath.isEmpty()) {
            name = (outputPath.endsWith("/") ? outputPath : outputPath + "/") + name;
        }

        try (FileWriter writer = new FileWriter(name, appendMode)) {
            for (String i : stringList) {
                writer.write(i);
                writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Error occurred String: " + e.getMessage());
            e.printStackTrace();
        }

    }
}

