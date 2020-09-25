/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github.mrzakiakkari;

/**
 *
 * @author Zaki
 */
public class Arraysexercise5
{
	 static int prices[][] = {{120, 56, 55, 67,19,8},
                            {17, 8, 4, 0, 0, 0},
                            {99, 80, 89, 48, 24, 8},
                            {115, 111, 78, 80, 45, 50}, 
	                        {101, 102, 100, 89, 75, 65},
	                        {67, 89, 81, 60, 55, 29}};

    static String cars[] = {"Opel", "Volvo", "Nessan", "Ford", "Toyota", "Honda"};
    static String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};

    static int numberOfcars, numberOfMonths;
    static String output;

    //define the main method
    public static void main(String args[]) {

       //figure out how many students you are dealing with
        numberOfcars = cars.length;

        //figure out how many students you are dealing with
        numberOfMonths = months.length;

        output = "The Results Are: \n\n";

        //call method buildString
        buildString();

        // call methods minimum and maximum
        output += "\n\n" + minimum() + "\n" + maximum() + "\n";

        // call method average to calculate each student's average
        for (int counter = 0; counter < prices.length; counter++) {
            output += "\nAverage for " + cars[counter] + " is " + average(prices[counter]);

        }//end for

        output += "\n";
        System.out.println(output);
        System.exit(0);

    } //end doubleArrayApplication constructor

    // find minimum grade
    public static String minimum() {

        // assume first element of grages array is smallest
        int lowPrice = prices[0][0];
        String op = "The worst selling car was  " + cars[0] + " its price was " + months[0] + ": " + prices[0][0];

        // loop through rows of prices array
        for (int row = 0; row < numberOfcars; row++) // loop through columns of current row
        {
            for (int column = 0; column < numberOfMonths; column++) // Test if current grade is less than lowPrice.
            // If so, assign current grade to lowPrice.
            {
                if (prices[row][column] < lowPrice) {
                    lowPrice = prices[row][column];
                    op = "The worst selling car was  " + cars[row] + " its price was " + months[column] + ": " + prices[row][column];
                }
            }
        }

        return op;  // return string outlining the student with the worst grade

    }//end minimum

    // find maximum grade
    public static String maximum() {
        // assume first element of grages array is largest
        int highPrice = prices[0][0];
        String op = "The best car is " + cars[0] + " its price was " + months[0] + ": " + prices[0][0];

        // loop through rows of prices array
        for (int row = 0; row < numberOfcars; row++) // loop through columns of current row
        {
            for (int column = 0; column < numberOfMonths; column++) // Test if current grade is greater than highPrice.
            // If so, assign current grade to highPrice.
            {
                if (prices[row][column] > highPrice) {
                    highPrice = prices[row][column];
                    op = "The best car is " + cars[row] + " its price was " + months[column] + ": " + prices[row][column];

                }
            }
        }

        return op;  // return string outlining the student with the best prices
    }//end maximum

    // determine average grade for each student
    public static double average(int setOfPrices[]) {
        int total = 0;  // initialize total

        // sum prices for one student
        for (int count = 0; count < setOfPrices.length; count++) {
            total += setOfPrices[count];
        }

        // return average of prices
        return (double) total / setOfPrices.length;
    }//end average

    // build output string
    public static void buildString() {

        // create column heads
        for (int counter = 0; counter < numberOfMonths; counter++) {
            output += "\t" + months[counter];
        }

        // create rows/columns of text representing array prices
        for (int row = 0; row < prices.length; row++) {
            output += "\n" + cars[row];

            for (int column = 0; column < numberOfMonths; column++) {
                output += "\t" + prices[row][column];
            }
		}
	}
}
