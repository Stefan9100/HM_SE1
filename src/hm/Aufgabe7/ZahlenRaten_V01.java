package hm.Aufgabe7;

import java.util.Scanner;

/**
 * @author Stefan Lutsch
 */
public class ZahlenRaten_V01 {

    private static int random = (int) (Math.random() * 10);

    public static void main(String[] args) {
        ZahlenRaten_V01 zahlenRaten_v01 = new ZahlenRaten_V01();
        zahlenRaten_v01.zahlenRaten();

    }

    public void zahlenRaten() {
        Scanner in = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 10 ein!");
        int guess = in.nextInt();
        //Prüfung ob Zahl im richtigen Interval liegt
        while (guess < 1 || guess > 10) {
            System.out.println("Bitte Zahl zwischen 1 und 10");
            guess = in.nextInt();
        }
        if (guess == random) {
            System.out.println("Juhu Die Zahl ist richtig");
        } else {
            System.out.println("Leider falsch. Bitte neu raten");


        }
    }
}
