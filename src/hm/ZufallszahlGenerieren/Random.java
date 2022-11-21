package hm.ZufallszahlGenerieren;

/**
 * @author Stefan Lutsch
 */
public class Random {

    public static void main(String[] args) {
        //(int) = cast auf integer, da die Math.random Funktion normalerweise double Werte returned (Nicht runden z.B. 0,99999 wird als int zu 0!!)
        //Math.random() = Methode aus der in Java integrierten Math Klasse-> Gibt Zahl zwischen 0 und 0.9999999999... zurück
        // *"Zahl" vergrößert das Intervall der generierten Zahlen von 0 - ("Zahl"-1)
        // +"Zahl" verschiebt dass Intervall um den gewünschten Wert

        //Zahl zwischen 0 und 9
        int randomZahl = (int) (Math.random()*10);

        //Zahl zwischen 5 und 12
        int randomZahl2 = (int) (Math.random()*7)+5;

        //Zahl zwischen -1 und -10
        int randomZahl3 = (int) (Math.random()*-10)-1;


        System.out.println(randomZahl);
        System.out.println(randomZahl2);
        System.out.println(randomZahl3);
    }
}
