package casestudy.Utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
//    public static List<String> readFile(String pathFile){
//        List<String> data = new ArrayList<>();
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
//            String string;
//            while ((string = bufferedReader.readLine()) != null) {
//                data.add(string);
//            }
//            bufferedReader.close();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        return data;
//    }
//    public static void writeFile(String pathFile, List<String> stringList){
//        try {
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathFile));
//            for (String string: stringList) {
//                bufferedWriter.write(string);
//                bufferedWriter.newLine();
//            }
//            bufferedWriter.close();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//    }
    public static List<String> readFile(String path) {
        List<String> strings = new ArrayList<>();
        try{
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line=reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return strings;
    }

    // ghi file
    public static void writeFile(String path, List<String> strings) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (String str : strings) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

