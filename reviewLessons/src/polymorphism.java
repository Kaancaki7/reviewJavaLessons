public class polymorphism {

    public static void main(String[] args){

        SuperCar superCar = new SuperCar();
        Bike bike = new Bike();
        Boat boat = new Boat();

        superCar.go();
        bike.go();
        boat.go();

        System.out.println("************************************");
        //polymorphism kısmı
        Vehicle[] vehicles = {superCar, bike, boat};

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}
