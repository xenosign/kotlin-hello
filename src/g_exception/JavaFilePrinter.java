package g_exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JavaFilePrinter  {
    public static void main(String[] args) throws IOException {
        readFile();
    }

    public static void readFile() throws IOException {
        File currentFile = new File(".");
        File file = new File(currentFile.getAbsolutePath() + "/a.txt");
        BufferedReader reader = new BufferedReader(new FileReader((file)));
        System.out.println(reader.readLine());
        reader.close();
    }
}
