package github.mrzakiakkari;

import java.util.Scanner;

/**
 *
 * @author Zaki
 */
public class ChangeDispenser
{
  public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the price: ");
        double price = scan.nextDouble();
        

        double changeDue = price;

        int euros = (int)changeDue;
		 int change = (int)(Math.ceil(changeDue*100));
		 int twoeuro = Math.round((int)change/200);
               change=change%200;
    int euro = Math.round((int)change/100);
    change=change%100;
	int fiftycent = Math.round((int)change/50);
    change=change%50;
    int twentycent = Math.round((int)change/20);
    change=change%20;
    int tencent = Math.round((int)change/10);
    change=change%10;
    int fivecent = Math.round((int)change/5);
    change=change%5;
	 int twocent = Math.round((int)change/2);
    change=change%2;
    int onecent = Math.round((int)change/1);

    System.out.println("twoeuro: " + twoeuro);
	 System.out.println("euro: " + euro);
    System.out.println("fiftycent: " + fiftycent);
	System.out.println("twentycent: " + twentycent);
	System.out.println("tencent: " + tencent);
    System.out.println("fivecent: " + fivecent);
    System.out.println("twocent: " + twocent);
    System.out.println("onecent: " + onecent);

        System.out.println("Return"+ euros+ "euros");

        scan.close();
    }
}
