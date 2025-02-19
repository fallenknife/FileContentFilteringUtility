package task;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class util {
    static String[] options = new String[]{"-o", "-n", "-p", "-a", "-s", "-f"};
    static String outputPath = "";
    static String namePrefix = "";
    static boolean appendMode = false;
    static boolean shortStatistics = false;
    static boolean fullStatistics = false;

    static List<String> stringList = new Stack<>();
    static List<Long> integerList = new Stack<>();
    static List<Double> floatList = new Stack<>();

    public static void main(String[] args) {
        ArrayList<String> inputFiles = Parser.parseArguments(args);
        if (inputFiles.isEmpty()) {
            System.out.println("Define at least one file");
            return;
        }

        ArrayList<ArrayList<String>> lines = FileReadingHandler.filesToStringArray(inputFiles);

        if (lines.isEmpty()) return;

        DataFilter.filtrate(lines);

        Statistics.showStatistics();
        WriteDataToFile.writeToFiles();

    }

    static <T> void printData(List<T> data) {

        for (T datum : data) {
            System.out.println(datum);
        }


    }
}