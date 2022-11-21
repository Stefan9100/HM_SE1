package hm.Aufgabe2;

/**
 * @author Stefan Lutsch
 */
public class Book {

    private String title; // Title als String
    private double price; // Gleitkommazahl (double)  als Preis

    public Book(String title){
        this.title = title;
    }

    public Book(double price){
        this.price = price;
    }

    public Book(String title,double price){
        this.title = title;
        this.price = price;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    //Version 1 ohne Parameter
    public void checkPrice(){
        if (price < 100){
            double newPrice = price + price*0.05;
            if (newPrice <=100){
                this.price = newPrice;
            }else{
                price =100;
            }
        }
    }

    //Version 2 mit Parameter
    public void checkPrice2(double percent, double x){
        if (price < x){
            double newPrice = price + price*percent;
            if (newPrice <=x){
                this.price = newPrice;
            }else{
                price =x;
            }
        }
    }





}
