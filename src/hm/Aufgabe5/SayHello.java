package hm.Aufgabe5;

import java.util.Scanner;

public class SayHello {

    public void sayHello(int n, String name){
        for (int i =0; i<n; i++){
            System.out.println("Hallo "+name);
        }
    }

    public String sayHelloApp(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie den gewünschten Namen ein.");
        String insertedName = scan.nextLine();
        return insertedName;
    }

    public static void main(String[] args) {
        SayHello sh = new SayHello();
        sh.sayHello(10, sh.sayHelloApp());
    }
}
