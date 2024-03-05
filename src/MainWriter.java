import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MainWriter {
    public static void main(String[] args) throws IOException, InterruptedException {
        new File("/opt/useless/").mkdirs();

        while (true) {
            FileOutputStream fos = new FileOutputStream("/opt/useless/info");
            long time = System.currentTimeMillis();
            fos.write(String.valueOf(time).getBytes(StandardCharsets.UTF_8));
            fos.close();
            System.out.println("File written: " + time);
            Thread.sleep(60000);
        }
    }
}