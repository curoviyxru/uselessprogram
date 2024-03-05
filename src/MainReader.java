import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MainReader {
    public static void main(String[] args) throws IOException, InterruptedException {
        new File("/opt/useless/").mkdirs();

        while (true) {
            if (!new File("/opt/useless/info").exists()) {
                System.out.println("Useless file doesn't exist");
                Thread.sleep(60000);
                continue;
            }

            FileInputStream fis = new FileInputStream("/opt/useless/info");
            System.out.println("File read: " + new String(fis.readAllBytes(), StandardCharsets.UTF_8));
            fis.close();
            Thread.sleep(60000);
        }
    }
}
