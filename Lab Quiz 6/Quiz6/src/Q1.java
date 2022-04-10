//////////////////////////////////////////////////
//
// Name: Burak
// Surname: Karataş
// Id:64200045
// Grade: 2nd Grade CoE
//
//////////////////////////////////////////////////

import java.util.*;

public class Q1 {

    // Person class for taking inheritance
    public static class Person {

        int id, phone;
        String name, email, address;

    }

    // Employee class that takes inheritance from Person class
    static class Employee extends Person {

        int salary;

    }

    // Manager class that takes inheritance from Employee class
    static class Manager extends Employee {

        String managed_department;

    }

    // Function for getting and printing info of person
    public static void get_print_InfoPerson(){

        // Scanner for taking inputs
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        // Creating object
        Person prs = new Person();

        // Taking inputs from user
        System.out.println("\n ------------------------------------------------------------------ ");
        System.out.println("\nEnter your name: ");
        prs.name = sc.nextLine();
        System.out.println("\nEnter your id: ");
        prs.id = in.nextInt();
        System.out.println("\nEnter your email:");
        prs.email = sc.nextLine();
        System.out.println("\nEnter your phone:");
        prs.phone = in.nextInt();
        System.out.println("\nEnter your address:");
        prs.address = sc.nextLine();
        System.out.println("\n ------------------------------------------------------------------ ");

        // Printing info
        System.out.println("\n ------------------------------------------------------------------ ");
        System.out.println("\n PERSON INFO ");
        System.out.println("\n Person name:" + " " + prs.name );
        System.out.println("\n Person id:" + " " + prs.id );
        System.out.println("\n Person email:" + " " + prs.email );
        System.out.println("\n Person phone:" + " " + prs.phone );
        System.out.println("\n Person address:" + " " + prs.address );
        System.out.println("\n ------------------------------------------------------------------ ");
    }

    // Function for getting and printing info of employee
    public static void get_print_InfoEmployee(){

        // Scanner for taking inputs
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        // Creating object
        Employee emp = new Employee();

        // Taking inputs from user
        System.out.println("\n ------------------------------------------------------------------ ");
        System.out.println("\nEnter your name: ");
        emp.name = sc.nextLine();
        System.out.println("\nEnter your id: ");
        emp.id = in.nextInt();
        System.out.println("\nEnter your email:");
        emp.email = sc.nextLine();
        System.out.println("\nEnter your address:");
        emp.address = sc.nextLine();
        System.out.println("\nEnter your salary:");
        emp.salary = in.nextInt();
        System.out.println("\n ------------------------------------------------------------------ ");

        // Printing info
        System.out.println("\n ------------------------------------------------------------------ ");
        System.out.println("\n EMPLOYEE INFO ");
        System.out.println("\n Person name:" + " " + emp.name );
        System.out.println("\n Person id:" + " " + emp.id );
        System.out.println("\n Person email:" + " " + emp.email );
        System.out.println("\n Person address:" + " " + emp.address );
        System.out.println("\n Person salary:" + " " + emp.salary );
        System.out.println("\n ------------------------------------------------------------------ ");
    }

    // Function for getting and printing info of manager
    public static void get_print_InfoManager(){

        // Scanner for taking inputs
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        // Creating object
        Manager mngr = new Manager();

        // Taking inputs from user
        System.out.println("\n ------------------------------------------------------------------ ");
        System.out.println("\nEnter your name: ");
        mngr.name = sc.nextLine();
        System.out.println("\nEnter your id: ");
        mngr.id = in.nextInt();
        System.out.println("\nEnter your email:");
        mngr.email = sc.nextLine();
        System.out.println("\nEnter your address:");
        mngr.address = sc.nextLine();
        System.out.println("\nEnter your salary:");
        mngr.salary = in.nextInt();
        System.out.println("\nEnter your managed department:");
        mngr.managed_department = sc.nextLine();
        System.out.println("\n ------------------------------------------------------------------ ");

        // Printing info
        System.out.println("\n ------------------------------------------------------------------ ");
        System.out.println("\n MANAGER INFO ");
        System.out.println("\n Person name:" + " " + mngr.name );
        System.out.println("\n Person id:" + " " + mngr.id );
        System.out.println("\n Person email:" + " " + mngr.email );
        System.out.println("\n Person phone:" + " " + mngr.phone );
        System.out.println("\n Person address:" + " " + mngr.address );
        System.out.println("\n Person salary:" + " " + mngr.salary );
        System.out.println("\n Person managed department:" + " " + mngr.managed_department );
        System.out.println("\n ------------------------------------------------------------------ ");
    }

    // Main function for initializing functions
    public static void main(String[] args){

        get_print_InfoPerson();
        get_print_InfoEmployee();
        get_print_InfoManager();

    }
}

