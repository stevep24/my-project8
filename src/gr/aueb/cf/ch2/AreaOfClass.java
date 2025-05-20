package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Υπλογιζει το εμβαδο ενός κύκλου συμφωνα με τον τυπο
 * πr^2 , οπου π=3,14 , r  ειναι η ακτινα.
 */
public class AreaOfClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius;
        double circleArea = 0.0;

        System.out.println("Παρακαλω εισαγετε την ακτινα του κυκλου");
        radius = input.nextInt();
        circleArea = Math.PI * Math.pow(radius,2);

        System.out.printf("The erea of the circle with radius: %d is %.2f ", radius, circleArea);


    }
}
