import java.io.*;
import java.nio.file.Files;

import static java.nio.file.StandardOpenOption.CREATE_NEW;

public class FileDataSource {
    private String name;

    public FileDataSource(String name) throws FileNotFoundException {
        this.name = name;
        writeData();
    }


    public void writeData() throws FileNotFoundException {

        FileOutputStream fos = new FileOutputStream(name);

        try (DataOutputStream dos = new DataOutputStream(fos)) {
            // записываем значения
            dos.writeUTF("ghfggjhjkkhjkhjkhjgh");
            dos.writeInt(30);
            dos.writeDouble(20.58);
            dos.writeBoolean(false);
            System.out.println("Запись в файл выполнена");
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
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
