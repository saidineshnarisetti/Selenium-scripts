package com.apps.testpackage;
import java.io.FileWriter;
import java.io.IOException;

public class Writetextfile {

	public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("/Users/saidinesh/workspace/JavaProject/Inputdata/JavaBooks.txt", true);
            writer.write("Hello World");
            writer.write("\r\n");   // write new line
            writer.write("Good Bye!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }

}
