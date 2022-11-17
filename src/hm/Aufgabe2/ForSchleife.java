package hm.Aufgabe2;

import java.util.Scanner;

public class ForSchleife {

    private static int random = (int) (Math.random() * 10);

    public static void main(String[] args) {

       /* for(int i=5; i<=15;i=i+2){
            System.out.println("Ausgabe "+i);
        }*/

        Scanner in = new Scanner(System.in);
        for (int i =0; i<3; i++){
            System.out.println("Bitte geben Sie eine Zahl ein!");
            int guess=in.nextInt();
            if(guess == random){
                System.out.println("Juhu Die Zahl ist richtig");
                break;
            }else{
                System.out.println("Leider falsch. Bitte neu raten");
            }

        }
    }
}
