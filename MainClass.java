import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class MainClass {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to go to next option");
        //int ControleInput=sc.nextInt();

// 2 for new registration
        //3 for how many cars registered for parking


        NewRegistration ob1;
        //if(ControleInput==2)
        {
            String OwnerName, RegNo;
            System.out.println("Enter your Name: ");
            OwnerName = sc.nextLine();
            System.out.println("enter your cars Registration number: ");
            RegNo = sc.nextLine();
            LocalDateTime time_of_registration = LocalDateTime.now();
            ob1 = new NewRegistration(OwnerName, RegNo, time_of_registration);

        }
        NewRegistration.writeToFile();

        //if(ControleInput==3)
        {
            ReadFile.readFromFile();
            System.out.println("no of cars registered till now : "+ReadFile.list.size());
        }

    }
}
