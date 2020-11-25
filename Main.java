import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  
  //VAR FOR ARRAY 
  Scanner input = new Scanner(System.in);
  String [] items = new String[5];
  int [] price = new int[5];
  int [] amount = new int[5];
  //IMPUT FOR FIRST ARRAY 
  for (int i=1; i<5; i++)
  {
    System.out.println("Enter Item #"+i);
    items[i]=input.nextLine();
    System.out.println("Enter price #"+i);
    price[i]= Integer.parseInt(input.nextLine());
    System.out.println("Enter amount of items #");
    amount[i]=Integer.parseInt(input.nextLine()); 
  }
 System.out.println("");
  for (int i=1; i<5; i++)
  {
    System.out.println("");
    System.out.println(items[i]);
    System.out.println("$"+price[i]);
    System.out.println(amount[i]+" items");
    System.out.println("Money made: $"+price[i]*amount[i]);
  }
  //IMPUT FOR SECOND ARRAY 
  }
}