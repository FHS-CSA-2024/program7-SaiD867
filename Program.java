//import stuff here
import java.util.Scanner;

//Your code here
public class calculaots{

    public static void main(String args[]){
    int schrute_bucks = 0;
    int kelvins = 0;
    int stanley_nickels = 0;
      Scanner value = new Scanner(System.in);
      System.out.println(" Enter schrute-bucks: " );
      schrute_bucks = value.nextInt();
    Scanner value1 = new Scanner(System.in);
      System.out.println(" Enter klevins: " );
      kelvins = value1.nextInt();
    Scanner value2 = new Scanner(System.in);
    System.out.println("Enter stanley-nickels: " );
    stanley_nickels = value2.nextInt();
    double total = schrute_bucks + (double) kelvins /20 + (double) stanley_nickels /240;
        total = (double) Math.round(total * 100) /100;

    System.out.println("Decimal schrute-bucks : " + total);
}
}

//Paste console output below:
/*
 Enter schrute-bucks: 
88
 Enter klevins:
88
Enter stanley-nickels:
86
Decimal schrute-bucks : 92.76
*/
