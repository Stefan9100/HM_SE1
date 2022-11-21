package hm.Aufgabe2;

import java.util.Scanner;

/**
 * @author Stefan Lutsch
 */
public class Noten {
    public static void main(String[] args) {
        System.out.println("Welche Note hast du?");
        Scanner scan = new Scanner(System.in);
        int note = scan.nextInt();

        //Lösung mit if-else Abfragen
        if (note ==1){
            System.out.println("sehr gut");
        } else if (note ==2) {
            System.out.println("gut");
        } else if (note==3) {
            System.out.println("befriedigend");
        } else if (note==4) {
            System.out.println("ausreichend");
        }else {
            System.out.println("Katastrophe");
        }

        //Lösung mit switch case Abfrage
        /*
        switch (note){
            case 1:
                System.out.println("sehr gut");
                break;
            case 2:
                System.out.println("gut");
                break;
            case 3:
                System.out.println("befriedigend");
                break;
            case 4 :
                System.out.println("ausreichend");
            default:
                System.out.println("Katastrophe");
        }
         */
    }
}
