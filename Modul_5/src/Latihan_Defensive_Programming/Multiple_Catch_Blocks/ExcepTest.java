package Latihan_Defensive_Programming.Multiple_Catch_Blocks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcepTest {
    public static void main(String args[]) {
        try {
            file = new FileInputStream(fileName);
            x = (byte) file.read();
        } catch (IOException i) {
            i.printStackTrace();
            return -1;
        } catch (FileNotFoundException f) {
            f.printStackTrace();
            return -1;
        }
    }
}
