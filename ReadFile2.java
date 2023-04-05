import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile2 {

    static ArrayList<NewRegistration> list1 = new ArrayList<>();
    static ArrayList list12 = new ArrayList();
    static NewRegistration line1;

    public static void readFromFile()
    {
        list1.clear();
        File fr = new File("cars parked.txt");
        try {
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()) {
                String name = sc.nextLine();
                String regNo = sc.nextLine();
                LocalDateTime o = LocalDateTime.parse(sc.nextLine());
                list12.add(name);
                list12.add(regNo);
                list12.add(o);
                line1 = new NewRegistration(name, regNo, o);
                list1.add(line1);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
