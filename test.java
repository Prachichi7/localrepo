import java.util.Scanner;
class tracker
{
    int salary;
    int date;
    String day;
    int grocery;
    float shopping;
    int transportate;
    Float miscellaneous;

    int grocbudget= 120;
    int shopbudget= 3000;
    int transbudget= 50;
    int miscbudget= 2000;
    public tracker()
    {
        //aise hi
    }
   void data(Scanner sc)
    {
        System.out.print("Enter your salary");
        salary= sc.nextInt();
        System.out.print("Enter today's date:");
        date =sc.nextInt();
        System.out.print("Enter the day:");
        sc.nextLine();
        day= sc.nextLine();
        System.out.print("Enter grocery:");
        grocery= sc.nextInt();
        System.out.print("Enter shopping:");
        shopping= sc.nextFloat();
        System.out.print("Enter today's transportation cost:");
        transportate= sc.nextInt();
        System.out.print("Enter other expenses:");
        miscellaneous= sc.nextFloat();
    }

    void takedata()
    {
        if(grocery > salary)
        {
             System.out.print("reduce your expenses");
        }
        else
        {
             System.out.print("save money");
        }
    }

    void all()
    {
        System.out.print("salary amount=" +salary);
        System.out.print("date today="+date);
        System.out.print("day today="+day);
        System.out.print("grocery purchased today="+grocery);
        System.out.print("shopping done today="+shopping);
        System.out.print("spend on transportation today="+transportate);
        System.out.print("other expenses today="+miscellaneous);   
    }
  void budget()
  {
    Float catbudget= 0.0f;
    if(grocery>grocbudget || shopping>shopbudget || transportate>transbudget || miscellaneous> miscbudget || salary > catbudget)
    {
         System.out.print("great going1 continue saving more");       
    }
    else{
        System.out.print("you will not save anything");
    }
  }
  
}

class expenset
{
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        tracker t = new tracker();

for (int i = 0; i < 7; i++) 
{
    t.data(scanner);
    t.takedata();
    t.all();
    t.budget();
}
scanner.close();
    }
}
