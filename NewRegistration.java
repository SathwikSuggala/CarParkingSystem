import java.time.LocalDateTime;
import java.util.*;
import java.time.LocalTime;
public class NewRegistration {

    static ArrayList<NewRegistration>DataofRegisterdCars=new ArrayList<>(100);
    Scanner sc=new Scanner(System.in);
    String OwnerName,RegNo;
    LocalDateTime time_of_registration;
    NewRegistration(String OwnerName,String RegNo,LocalDateTime time_of_registration)
    {
        this.OwnerName=OwnerName;
        this.RegNo=RegNo;
        this.time_of_registration=time_of_registration;
        DataofRegisterdCars.add(this);


    }

    @Override
    public String toString()
    {
        String a="Owner Name : "+OwnerName+"\n"+"Car Registration Number : "+RegNo+"\n"+"Time of registration : "+time_of_registration;
        return a;
    }

}
