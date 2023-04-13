public class PrintAllParkedCars {
    public static void Print()
    {
        for(int i=0;i<ReadFile2.list1.size();i++)
        {
            System.out.println("\n\nParking Slot : "+(i+1)+"\n"+ReadFile2.list1.get(i)+"\n");
        }
    }
}
