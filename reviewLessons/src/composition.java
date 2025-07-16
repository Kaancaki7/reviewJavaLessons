public class composition {

    public static void main(String[] args){

        OffroadCar offroadCar = new OffroadCar("hummer",2025, "4x4");

        System.out.println(offroadCar.model);
        System.out.println(offroadCar.year);
        System.out.println(offroadCar.engine.type);

        offroadCar.start();
    }
}
