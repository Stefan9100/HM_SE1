package hm.Aufgabe9;

import hm.Aufgabe7.ZahlenRaten_V01;
import java.util.Scanner;

/**
 * @author Stefan Lutsch
 */
public class ZahlenErraten_V03 {

    private static int random = (int) (Math.random() * 10);

    public static void main(String[] args) {
        ZahlenRaten_V01 zahlenRaten_v01 = new ZahlenRaten_V01();
        zahlenRaten_v01.zahlenRaten();

    }

    public void zahlenRaten() {
        Scanner in = new Scanner(System.in);
        //Schleife, die sich so lange wiederholt bis sie durch das break Statement beendet wird.
        while (true) {
            System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 10 ein!");
            int guess = in.nextInt();
            //Prüfung ob Zahl im richtigen Interval liegt
            while (guess < 1 || guess > 10) {
                System.out.println("Bitte Zahl zwischen 1 und 10");
                guess = in.nextInt();
            }
            if (guess == random) {
                System.out.println("Juhu Die Zahl ist richtig");
                break;
            } else {
                System.out.println("Leider falsch. Bitte neu raten");
            }

        }
    }
}
