import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   //VAR FOR ARRAY 
  Scanner input = new Scanner(System.in);
  
  int x;
  System.out.println("How many items are there?");
  x = Integer.parseInt(input.nextLine());
  
  String [] items = new String[x+1];
  int [] price = new int[x+1];
  int [] amount = new int[x+1];
 
  //IMPUT FOR FIRST ARRAY 
  for (int i=1; i<x+1; i++)
  {
    System.out.println("Enter Item #"+i);
    items[i]=input.nextLine();
    System.out.println("Enter price #"+i);
    price[i]= Integer.parseInt(input.nextLine());
    System.out.println("Enter amount of items #");
    amount[i]=Integer.parseInt(input.nextLine()); 
  }
 System.out.println("");
  for (int i=1; i<x+1; i++)
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