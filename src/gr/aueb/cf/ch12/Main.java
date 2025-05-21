package gr.aueb.cf.ch12;

public class Main {

    public static void main(String[] args) {

        Student alice = new Student();                                  //id->10.firstname->null,lastname->null
        Student bob = new Student(2,"Bob", "D.");  //id->2 , firstname -> Bob, lastname-> D.

        alice.setId(10);                //set id
        alice.setFirstname("Alice");    //set firstname
        alice.setLastname("w.");        //set lastname

        System.out.println("ID: " + alice.getId());                  // get id
        System.out.println("Firstname: " + alice.getFirstname());    // get firstname
        System.out.println("Lastname: " + alice.getLastname());      // get lastname
    }
}
