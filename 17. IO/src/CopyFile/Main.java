package CopyFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
public class Main {
    public static void copyFileUsingJava8File(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFilesUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            File file;
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);

            byte[] bytes = new byte[1024];
            int length;
            while ((length = is.read(bytes)) > 0){
                os.write(bytes, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap ten nguon: ");
        String sourcePath = input.nextLine();
        System.out.print("Nhap ten dich: ");
        String destPath = input.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            copyFileUsingJava8File(sourceFile, destFile);
            System.out.println("Copy thanh cong");
        } catch (IOException e) {
            System.out.print("Can't copy that file");
            System.out.print(e.getMessage());
        }
    }
}
