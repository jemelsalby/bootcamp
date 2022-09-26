package com.nest.menudriven;

import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        int choice;
        while(true)
        {
            System.out.println("select an option");
            System.out.println("1. add student");
            System.out.println("2. Search student");
            System.out.println("3. Delete student");
            System.out.println("4. view All student");
            System.out.println("5. Exit \n");

            Scanner scanner=new Scanner(System.in);
            choice=scanner.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("add student selected");
                    break;
                case 2:
                    System.out.println("search student selected");
                    break;
                case 3:
                    System.out.println("Delete student selected");
                    break;
                case 4:
                    System.out.println("view all student selected");
                    break;
                case 5:
                    System.exit(0);
            }

        }
    }
}
