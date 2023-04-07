import java.time.LocalDateTime;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String mainloop="0",mainloopcheck;

        while(!mainloop.equals("1"))
        {
            System.out.println("Enter 2 to make new registration \nEnter 3 to check how many cars have been registered till yet \nEnter 4 to access parking space \nEnter 5 to print all registerd cars \nEnter 6 to know which cars have been parked till now");
            String ControleInput = sc.next();
            int x;
            ReadFile3.readFromFile();
            //checking how many vaccant registrations are available
            if(ReadFile3.list3.size()>=250)
            {
                System.out.println("car registrations have been closed becaue parking slots have been full occupied"+ReadFile3.list3.size());
                break;
            }
            else
            {
                x=250-ReadFile3.list3.size();
            }



//control input 2 for new registrations

            if (ControleInput.equals("2"))
            {

                NewRegistration ob1;

                int loop = 0;
                String loopcheck;
                while (loop != 1)
                {
                    if(x>0)
                    {
                        x-=1;
                    }
                    else
                    {
                        System.out.println("registrations full");
                        break;
                    }

                    sc.nextLine();
                    String OwnerName = null, RegNo = null;
                    int rc1,rc2,rc3,rc4,rc5,rc6,rc7,rc8,rc9,rc10;
                    int namecheck=0;
                    while(namecheck!=1) {
                        System.out.println("Enter your Name: ");
                        OwnerName = sc.nextLine();
                        if(OwnerName.equals("exit"))
                        {
                            break;
                        }
                        if(OwnerName.length()==0)
                        {
                            System.out.println("please enter a valid name or enter exit to go to main menu");
                            continue;
                        }
                        else
                        {
                            namecheck=1;
                        }
                    }
                    if(OwnerName.equals("exit"))
                    {
                        break;
                    }
                    int controleregno=0;
                    while(controleregno!=1)
                    {
                        System.out.println("enter your cars Registration number: ");
                        RegNo = sc.nextLine();
                        if (RegNo.equals("exit"))
                        {

                            break;

                        }

                        if(RegNo.length()==10)
                        {

                            rc1 = RegNo.charAt(0);
                            rc2 = RegNo.charAt(1);
                            rc3 = RegNo.charAt(2);
                            rc4 = RegNo.charAt(3);
                            rc5 = RegNo.charAt(4);
                            rc6 = RegNo.charAt(5);
                            rc7 = RegNo.charAt(6);
                            rc8 = RegNo.charAt(7);
                            rc9 = RegNo.charAt(8);
                            rc10 = RegNo.charAt(9);
                            if ((rc1 < 64 || rc1>90) || (rc2 < 64 || rc2>90) || (rc3 < 48 || rc3 > 58) || (rc4 < 48 || rc4 > 58) || (rc5 < 64 || rc5 > 90) || (rc6 < 64 || rc6 > 90) || (rc7 < 48 || rc7 > 58) || (rc8 < 48 || rc8 > 58) || (rc9 < 48 || rc9 > 58) || (rc10 < 48 || rc10 > 58))
                            {

                                System.out.println("\nRegistration number that you have entered is not a valid one please try again or enter exit in the place of registration number\n");
                                System.out.println("Example:AB12CD3456");
                                continue;
                            }

                        else
                        {
                            controleregno=1;
                        }
                    }
                        else
                        {

                            System.out.println("\nRegistration number that you have entered is not a valid one please try again\n");
                            System.out.println("Example:AB12CD3456");
                            continue;
                        }

                        }
                    if(RegNo.equals("exit"))
                    {

                        break;
                    }
                    LocalDateTime time_of_registration = LocalDateTime.now();
                    ob1 = new NewRegistration(OwnerName, RegNo, time_of_registration);
                    System.out.println("You have successfully registered with our car parking system\n");
                    System.out.println("Do you have any further registrations?\n if yes enter any value \nif no enter 1");
                    loopcheck = sc.next();
                    if (loopcheck.equals("1"))
                    {
                        loop += 1;

                    }
                    ob1.add();


                }

                NewRegistration.writeToFile();
                //NewRegistration.DataofRegisterdCars.clear();


            }


//Control input 3 for how many cars have been parked till yet
            if (ControleInput.equals("3"))
            {
                ReadFile.readFromFile();
                System.out.println("no of cars registered till now : " + ReadFile.list.size());
            }

//Control input 4 to access cara parking space
            if (ControleInput.equals("4"))
            {
                ReadFile2.readFromFile();
                sc.nextLine();
                ForParking ob2;
                RegisterdOrNot.parked();
                String CheckRegNo=null, OwnerName;
                int controleregno=0;
                int rc1,rc2,rc3,rc4,rc5,rc6,rc7,rc8,rc9,rc10;
                while(controleregno!=1) {
                    System.out.println("Enter Your car Regno to access parking space");
                    CheckRegNo = sc.nextLine();
                    if (CheckRegNo.equals("exit"))
                    {

                        break;

                    }

                    if(CheckRegNo.length()==10)
                    {

                        rc1 = CheckRegNo.charAt(0);
                        rc2 = CheckRegNo.charAt(1);
                        rc3 = CheckRegNo.charAt(2);
                        rc4 = CheckRegNo.charAt(3);
                        rc5 = CheckRegNo.charAt(4);
                        rc6 = CheckRegNo.charAt(5);
                        rc7 = CheckRegNo.charAt(6);
                        rc8 = CheckRegNo.charAt(7);
                        rc9 = CheckRegNo.charAt(8);
                        rc10 =CheckRegNo.charAt(9);
                        if (rc1 < 64 || rc2 < 64 || (rc3 < 48 && rc3 > 58) || (rc4 < 48 && rc4 > 58) || rc5 < 64 || rc6 < 64 || (rc7 < 48 && rc7 > 58) || (rc8 < 48 && rc8 > 58) || (rc9 < 48 && rc9 > 58) || (rc10 < 48 && rc10 > 58))
                        {

                            System.out.println("\nRegistration number that you have entered is not a valid one please try again or enter exit in the place of registration number\n");
                            System.out.println("Example:AB12CD3456");
                            continue;
                        }

                        else
                        {
                            controleregno=1;
                        }
                    }
                    else
                    {

                        System.out.println("\nRegistration number that you have entered is not a valid one please try again\n");
                        System.out.println("Example:AB12CD3456");
                        continue;
                    }

                }
                if(CheckRegNo.equals("exit"))
                {

                    continue;
                }

                if(ReadFile2.list12.contains(CheckRegNo))
                {
                    System.out.println("your car is already parked in the parking area at parking slot "+((ReadFile2.list12.indexOf(CheckRegNo)/3)+1));
                    System.out.println("Returning back to main menue\n\n");
                    continue;
                }

                if (RegisterdOrNot.carregisterd.contains(CheckRegNo))
                {
                    int index = RegisterdOrNot.carregisterd.indexOf(CheckRegNo);
                    int indexincr = index - 1;

                    OwnerName = RegisterdOrNot.carregisterd.get(indexincr).toString();
                    System.out.println("you are allowed to park\n");
                    System.out.println("\nDo you want to park your car?\nif yes press any value \nif not enter 1");
                    String parkcheck=sc.next();
                    if(parkcheck.equals("1"))
                    {
                        System.out.println("Returning back to main menue\n\n");
                        continue;
                    }
                    else
                    {
                        LocalDateTime time_of_Parked = LocalDateTime.now();
                        ob2 = new ForParking(OwnerName, CheckRegNo, time_of_Parked);
                        System.out.println("You have successfully parked your car in the parking area");

                    }
                }
                else
                {
                    System.out.println("you are not registered in our system, please register first");
                    System.out.println("Returning back to main menue\n\n");
                    continue;
                }
                ForParking.writeToFile2();
            }


//Control input 5 to print all registered cars
            if(ControleInput.equals("5"))
            {
                ReadFile3.readFromFile();
                PrintAllRegisterdCars.Print();

            }

//Console input 6 to print all parked cars
            if(ControleInput.equals("6"))
            {
                ReadFile2.readFromFile();
                PrintAllParkedCars.Print();

            }
            else if(!ControleInput.equals("2") && !ControleInput.equals("3") && !ControleInput.equals("4") && !ControleInput.equals("5") && !ControleInput.equals("6"))
            {
                System.out.println("\nPlease Enter a valid input");
                System.out.println("\nReturning back to main menue \n\n");
                continue;
            }

            System.out.println("\n\nenter any value to go to main menu\nenter 1 to exit car parking system\n");
//            if(!ControleInput.equals("2")) {
//                sc.next();
//            }
            mainloopcheck=sc.next();
            System.out.println("\n\n");
            if(mainloopcheck.equals("1"))
            {
                mainloop="1";
            }

        }
    }
}
