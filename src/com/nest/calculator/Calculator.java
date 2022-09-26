package com.nest.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a,b,c,d;

        while (true)
        {
            System.out.println("select an option");
            System.out.println("1. + ");
            System.out.println("2. /");
            System.out.println("3. -");
            System.out.println("4. x");
            System.out.println("5. Exit \n");


            Scanner scanner=new Scanner(System.in);
            d=scanner.nextInt();
            System.out.println("Enter two number");
            a=scanner.nextInt();
            b=scanner.nextInt();

            switch(d)
            {
                case 1:
                   c=a+b;
                    System.out.println(c);
                    break;
                case 2:c=a/b;
                    System.out.println(c);
                    break;
                case 3:c=a-b;
                    System.out.println(c);
                    break;
                case 4:c=a*b;
                    System.out.println(c);
                    break;
                case 5:
                    System.exit(0);
            }

        }
    }
}
