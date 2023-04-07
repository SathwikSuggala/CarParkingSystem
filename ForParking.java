import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;

public class ForParking {

    static ArrayList<ForParking>DataofCarsparked=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    String OwnerName,RegNo;
    LocalDateTime time_of_Parked;
    ForParking(String OwnerName,String RegNo,LocalDateTime time_of_Parked)
    {
        this.OwnerName=OwnerName;
        this.RegNo=RegNo;
        this.time_of_Parked =time_of_Parked;
        DataofCarsparked.add(this);
    }

    public static void writeToFile2() {
        try {
            FileWriter d2 = new FileWriter("cars parked.txt", true);


            for (ForParking a : DataofCarsparked) {
                d2.write(a.OwnerName + "\n" + a.RegNo + "\n" + a.time_of_Parked + "\n");
            }

            //System.out.println("Successfully written");


            d2.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



    @Override
    public String toString()
    {
        String a1="Owner Name : "+OwnerName+"\n"+"Car Registration Number : "+RegNo+"\n"+"Time of registration : "+ time_of_Parked;
        return a1;
    }

}












//for (String str : arrayList) {
//    fw.write(str);
//}