/*
.print the first and the second value
  . Change the application so that it finds the average of two double values.
  . remind you that you are using Sccanner as the input
*/

import java.util.Scanner;

public class Askingquestions
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        int num1, num2;

        System.out.print( "First temperature? " );
        num1 = keyboard.nextInt();

        System.out.print( "Second temperature? " );
        num2 = keyboard.nextInt();


       System.out.println("The average value is" + (num1 + num2)/2 );




    }
}