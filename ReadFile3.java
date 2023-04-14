import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile3 {

    static ArrayList<NewRegistration> list3 = new ArrayList<>();
    static NewRegistration line3;

    public static void readFromFile()
    {
        list3.clear();
        File fr = new File("registered cars.txt");
        try {
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()) {
                String name = sc.nextLine();
                String regNo = sc.nextLine();
                LocalDateTime o = LocalDateTime.parse(sc.nextLine());

                line3 = new NewRegistration(name, regNo, o);
                list3.add(line3);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
