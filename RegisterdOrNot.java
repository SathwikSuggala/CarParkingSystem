import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class RegisterdOrNot {
    static ArrayList carregisterd=new ArrayList();
    public static void parked()
    {

        File fr = new File("registered cars.txt");
        try {
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine())
            {
                String name = sc.nextLine();
                String regNo = sc.nextLine();
                LocalDateTime o = LocalDateTime.parse(sc.nextLine());
                String date=o.toString();

                carregisterd.add(name);
                carregisterd.add(regNo);
                carregisterd.add(date);
            }
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
