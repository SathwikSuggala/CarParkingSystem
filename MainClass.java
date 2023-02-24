import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class MainClass {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to go to next option");
        int ControleInput=sc.nextInt();

// 2 for new registration
        //3 for how many cars registered


        if(ControleInput==2)
        {
            String OwnerName, RegNo;
            System.out.println("Enter your Name: ");
            OwnerName = sc.nextLine();
            System.out.println("enter your cars Registration number: ");
            RegNo = sc.nextLine();
            LocalDateTime time_of_registration = LocalDateTime.now();
            NewRegistration ob1 = new NewRegistration(OwnerName, RegNo, time_of_registration);
        }



    }
}
