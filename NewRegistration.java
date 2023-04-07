import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.*;
import java.time.LocalTime;
public class NewRegistration {

    static ArrayList<NewRegistration>DataofRegisterdCars=new ArrayList<>();

    Scanner sc=new Scanner(System.in);
    String OwnerName,RegNo;
    LocalDateTime time_of_registration;
    NewRegistration(String OwnerName,String RegNo,LocalDateTime time_of_registration)
    {
        this.OwnerName=OwnerName;
        this.RegNo=RegNo;
        this.time_of_registration=time_of_registration;

    }
    public void add()
    {

        DataofRegisterdCars.add(this);
    }

    public static void writeToFile()
    {

        try {
            FileWriter d=new FileWriter("registered cars.txt",true);


            for (NewRegistration a: DataofRegisterdCars)
            {
                d.write(a.OwnerName + "\n" + a.RegNo + "\n" + a.time_of_registration + "\n");
            }

            //System.out.println("Successfully written");


            d.close();
            NewRegistration.DataofRegisterdCars.clear();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString()
    {
        String a="Owner Name : "+OwnerName+"\n"+"Car Registration Number : "+RegNo+"\n"+"Time of registration : "+time_of_registration;
        return a;
    }

}












//for (String str : arrayList) {
//    fw.write(str);
//}