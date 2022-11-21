package hm.Aufgabe4;

import java.util.Scanner;

/**
 * @author Stefan Lutsch
 */public class Lohnsteuerverein {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie ihr Gehalt ein.");
        int salary = scan.nextInt();

        if(salary>=60000){
            System.out.println("Kostet 400€");
        }else if(salary>=50000){
            System.out.println("Kostet 300€");
        }
    }
}
