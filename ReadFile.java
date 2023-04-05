import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

    static ArrayList<NewRegistration> list = new ArrayList<>();
    static NewRegistration line;

    public static void readFromFile()
    {
        list.clear();
        File fr = new File("registered cars.txt");
        try {
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()) {
                String name = sc.nextLine();
                String regNo = sc.nextLine();
                LocalDateTime o = LocalDateTime.parse(sc.nextLine());

                line = new NewRegistration(name, regNo, o);
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
