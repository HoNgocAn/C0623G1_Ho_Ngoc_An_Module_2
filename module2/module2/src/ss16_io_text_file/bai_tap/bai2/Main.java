package ss16_io_text_file.bai_tap.bai2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//            Cách 1
        String csvFile = "D:\\C0623G1_Ho_Ngoc_An_Module_2\\module2\\module2\\src\\ss16_io_text_file\\bai_tap\\bai2\\Countries.csv";
        File file = new File(csvFile);
        String line = "";
        try(BufferedReader br = new BufferedReader(new FileReader(csvFile)))
        {
            line = br.readLine();
            while ((line = br.readLine()) != null && !line.isEmpty())
            {
                String Arr[] = line.split(",");
                System.out.println(Arr[0] + Arr[1]);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

//            Cách 2
//        File f = new File("D:\\C0623G1_Ho_Ngoc_An_Module_2\\module2\\module2\\src\\ss16_io_text_file\\bai_tap\\bai2\\Countries.csv");
//        try {
//            BufferedReader br = Files.newBufferedReader(f.toPath(),StandardCharsets.UTF_8);
//            String line = null;
//            while (true){
//                line = br.readLine();
//                if (line == null){
//                    break;
//                }else{
//                    System.out.println(line);
//                }
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }
}
