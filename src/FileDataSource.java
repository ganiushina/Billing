import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;

import static java.nio.file.StandardOpenOption.CREATE_NEW;

public class FileDataSource {
    private String name;

    public FileDataSource(String name) {
        this.name = name;
        writeData();
    }


    public void writeData() {
        File file = new File(name);
        try (OutputStream outputStream = Files.newOutputStream(file.toPath(),
                CREATE_NEW)) {
            outputStream.write(123);
            outputStream.flush();
            System.out.println("done");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("%s exists: %s%n", file, file.exists());
    }


    public void readData() {
        char[] buffer = null;
        File file = new File(name);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(new String(buffer));
    }

}
