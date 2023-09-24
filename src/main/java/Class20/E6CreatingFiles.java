package Class20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class E6CreatingFiles {
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("Test.txt");
        for (int i = 0; i < 10; i++) {
            f.write("Batch 17 is great");
        }

        f.close();
    }


}
