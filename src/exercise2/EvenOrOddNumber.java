package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = input.nextInt();
        if(n%2==0)
        {System.out.println("Number is even ");}
        else
        {System.out.println("Number is odd ");}
    }
}