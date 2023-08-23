package ss16_io_text_file.bai_tap.bai1;

import java.io.*;

public class CoppyFile {
    public static void main(String[] args) {
        String sourceFilePath = "D:\\C0623G1_Ho_Ngoc_An_Module_2\\module2\\module2\\src\\ss16_io_text_file\\bai_tap\\bai1\\source";
        String targetFilePath = "D:\\C0623G1_Ho_Ngoc_An_Module_2\\module2\\module2\\src\\ss16_io_text_file\\bai_tap\\bai1\\target";
        try {

            FileReader sourceFileReader = new FileReader(sourceFilePath);
            StringBuilder content = new StringBuilder();
            int character;
            while ((character = sourceFileReader.read()) != -1) {
                content.append((char) character);
            }
            sourceFileReader.close();

            FileWriter targetFileWriter = new FileWriter(targetFilePath);
            targetFileWriter.write(content.toString());
            targetFileWriter.close();

            System.out.println("Đã sao chép thành công");
        } catch (IOException e) {
            System.err.println("Lỗi: " + e.getMessage());
        }
    }
}

