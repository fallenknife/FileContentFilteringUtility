package task;

import java.util.ArrayList;

import static task.util.*;


public class DataFilter {
    public static void filtrate(ArrayList<ArrayList<String>> data) {
        int maxSize = getMaxArrayListSize(data);
        for (int i = 0; i < maxSize; i++) {
            for (ArrayList<String> file : data) {
                try {
                    separateData(file.get(i));
                } catch (IndexOutOfBoundsException ignored) {
                }
            }
        }


    }

    private static void separateData(String line) {
        try {
            integerList.add(Long.parseLong(line));
        } catch (NumberFormatException e1) {
            try {
                floatList.add(Double.parseDouble(line));
            } catch (NumberFormatException e2) {
                stringList.add(line);
            }
        }
    }

    private static int getMaxArrayListSize(ArrayList<ArrayList<String>> list) {
        int max = list.getFirst().size();
        for (ArrayList<String> s : list) {
            if (max < s.size()) {
                max = s.size();
            }
        }
        return max;
    }

}
