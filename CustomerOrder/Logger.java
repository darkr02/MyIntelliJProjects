package CustomerOrder;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Logger {

    public void logErrorEntry(String error)
    {
        Path path = Paths.get("D:\\Krishnendu\\error.txt");
        try {
            BufferedWriter bw = Files.newBufferedWriter(path);
            bw.write(error);
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
