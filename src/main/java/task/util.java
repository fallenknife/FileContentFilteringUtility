package task;

import java.util.ArrayList;
import java.util.Stack;

public class util {
    static String outputPath = "";
    static String namePrefix = "";
    static boolean appendMode = false;
    static boolean shortStatistics = false;
    static boolean fullStatistics = false;

    static Stack<String> stringList = new Stack<>();
    static Stack<Long> integerList = new Stack<>();
    static Stack<Double> floatList = new Stack<>();

    public static void main(String[] args) {
        ArrayList<String> inputFiles = Parser.parseArguments(args);
        if (inputFiles.isEmpty()) {
            System.out.println("Define at least one file");
            return;
        }

        ArrayList<ArrayList<String>> lines = FileReadingHandler.filesToStringArray(inputFiles);

        if (lines.isEmpty()) return;

        DataFilter.filtrate(lines);


////         prints the lines of an array
//        int i = 0;
//        for (ArrayList<String> a : lines) {
//            int j = 0;
//            for (String element : a) {
//                System.out.println("elem #" + i + j + " is " + element);
//                j++;
//            }
//            i++;
//
//        }


//        printData(integerList);
//        printData(floatList);
//        printData(stringList);

        Statistics.showStatistics();
    }

//    static <T> void printData(Stack<T> data) {
//        System.out.println("Data Type" + data.getClass());
//        while (!data.isEmpty()) {
//            System.out.println(data.pop());
//        }
//
//    }
}