package Latihan_Defensive_Programming.Multiple_Catch_Blocks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcepTest {
    public static void main(String args[]) {
        try {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" + e);
        }
        System.out.println("Out of the block");

        try {
            File fileName = new File("Text.txt");
            FileInputStream file = new FileInputStream(fileName);
            byte x = (byte) file.read();
        } catch (FileNotFoundException  i) {
            i.printStackTrace();
        } catch (IOException f) {
            f.printStackTrace();
        }
    }
}
