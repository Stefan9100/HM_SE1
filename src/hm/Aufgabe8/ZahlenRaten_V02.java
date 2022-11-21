package hm.Aufgabe8;

import hm.Aufgabe7.ZahlenRaten_V01;
import java.util.Scanner;

/**
 * @author Stefan Lutsch
 */
public class ZahlenRaten_V02 {
    private static int random = (int) (Math.random() * 10);

    public static void main(String[] args) {
        ZahlenRaten_V01 zahlenRaten_v01 = new ZahlenRaten_V01();
        zahlenRaten_v01.zahlenRaten();

    }

    public void zahlenRaten() {
        Scanner in = new Scanner(System.in);
        //Schleife, die sich 3 mal wiederholt oder bei richtigem Raten durch das Break beendet wird!
        for  (int i = 0; i<3; i++) {
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
            if (i ==2){
                System.out.println("Sie haben das Spiel leider verloren!");
            }

        }
    }
}

