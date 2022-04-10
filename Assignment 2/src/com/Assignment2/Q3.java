///////////////////////////////////////////////////////
//
//    Name: Burak Karataş
//
//    ID: 64200045
//
//    Faculty: Computer Engineering
//
///////////////////////////////////////////////////////

package com.Assignment2;

public class Q3 {
    public static void main(String[] args) {

        // First person1 instance based on the PersonAddress class
        PersonAdress person1 = new PersonAdress();
        person1.setpersonName("Burak");
        person1.setpersonLastName("Karataş");
        person1.setpersonMail("burakkaratas2001@gmail.com");
        person1.setpersonNumber("+5418084741");
        System.out.println("User details are as following:\n" +
                person1.getpersonName() + " " +
                person1.getpersonLastName() + " " +
                person1.getpersonMail() + " " +
                person1.getpersonNumber() + "\n");

        // Person2 second new instance is created to compare at the end based on the solely names
        PersonAdress person2 = new PersonAdress();
        person2.setpersonName("Nazif");
        person2.setpersonLastName("Karataş");
        person2.setpersonMail("example@gmail.com");
        person2.setpersonNumber("+0555 555 55 55");
        System.out.println("User details are as following:\n" +
                person2.getpersonName() + " " +
                person2.getpersonLastName() + " " +
                person2.getpersonMail() + " " +
                person2.getpersonNumber() + "\n");

        // Checking whether the 2 given instances are equal based on the solely names
        System.out.println(person1.getpersonName() == person2.getpersonName());
        System.out.println(person1.getpersonLastName() == person2.getpersonLastName());
    }
}
