
   
package exercise2;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number from 0 to 999: ");
        int n = input.nextInt();
        int a = n/100;
        int b = n/10%10;
        int c = n%10;
        int sum = a + b + c;
        System.out.println("Sum of digits: " + sum);
        
    }

}