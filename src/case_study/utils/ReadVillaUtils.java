package case_study.utils;

import case_study.model.Villa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadVillaUtils {
    private static List<String> readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<String> strings = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            strings.add(line);
        }
        bufferedReader.close();

        return strings;
    }

    public static Map<Villa, Integer> reaVillaFile(String path) {
        List<String> strings = null;
        try {
            strings = readFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
        String[] info;
        assert strings != null;
        for (String line : strings) {
            info = line.split(",");
            Villa villa = new Villa(info[0],
                    info[1],
                    Double.parseDouble(info[2]),
                    Double.parseDouble(info[3]),
                    Integer.parseInt(info[4]),
                    info[5],
                    info[6],
                    Double.parseDouble(info[7]),
                    Integer.parseInt(info[8]));
            villaIntegerMap.put(villa, Integer.parseInt(info[9]));
        }

        return villaIntegerMap;
    }
}
