package hm.Aufgabe6;

/**
 * @author Stefan Lutsch
 */
public class GeradeZahlen {

    //Lösung mit Modulu-Operator(%) auch möglich!!
    public void countEvenNumbers(int n){
        for (int i=0;i<=n;i=i+2){
            System.out.println(i);
        }
    }
    public void countUnevenNumbers(int n){
        for (int i=1;i<=n;i=i+2){
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        GeradeZahlen gz = new GeradeZahlen();
        gz.countEvenNumbers(10);
        gz.countUnevenNumbers(10);
    }
}
