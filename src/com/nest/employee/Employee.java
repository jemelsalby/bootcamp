package com.nest.employee;
import java.util.ArrayList;
import java.util.Scanner;
public class Employee {
    public static void main(String[] args) {
        ArrayList<String> obj=new ArrayList<String>();
        String empName;
        int choice;
        while(true)
        {

            System.out.println("1. add Employee");
            System.out.println("2. view all Employee");
            System.out.println("3. exit");
            System.out.println("Please Select an Option");
            Scanner option = new Scanner(System.in);
            choice= option.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("add Employee select");
                    empName=option.next();
                    obj.add(empName);
                    break;
                case 2:
                    System.out.println(obj);
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}

