package hm.Aufgabe1;

import java.util.Scanner;

/**
 * @author Stefan Lutsch
 */
public class Kino {
    public static void main(String[] args) {
        System.out.println("Wie alt bist du?");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if(age <= 12){
            System.out.println("Tut mir leid du darfst dem Film leider noch nicht anschauen");
        }else{
            System.out.println("Herzlich Wilkommen, Dein Ticket kostet 7€ bitte! Viel Spaß bei dem Film.");
        }

    }
}
