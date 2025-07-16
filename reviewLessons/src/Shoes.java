public class Shoes {

    private final String model;
    private String color;
    private double price;

    Shoes(String model, String color, double price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }

    String getColor(){
        return this.color;
    }

    double getPrice(){
        return this.price;
    }

    void setColor(String color){
        this.color = color;
    }

    void setPrice(double price){
        if(price < 0){
            System.out.println("price can't be less than zero");
        }
        else{
            this.price = price;
        }
    }
}
