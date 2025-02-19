package task;

import java.util.ArrayList;
import java.util.Arrays;

import static task.util.*;

public class Parser {
    static ArrayList<String> parseArguments(String[] args) {
        ArrayList<String> filenames = new ArrayList<>();
        for (int i = 0; i < args.length; ++i) {
            switch (args[i]) {
                case "-o":
                    if (i + 1 < args.length && !Arrays.asList(options).contains(args[i + 1])) {
                        outputPath = args[++i];
                    }
                    break;
                case "-p":
                    if (i + 1 < args.length && !Arrays.asList(options).contains(args[i + 1])) namePrefix = args[++i];
                    break;
                case "-a":
                    appendMode = true;
                    break;
                case "-s":
                    shortStatistics = true;
                    break;
                case "-f":
                    fullStatistics = true;
                    break;
                default:
                    filenames.add(args[i]);
            }
        }
        return filenames;
    }
}
