public class OffroadCar {

    String model;
    int year;
    Engine engine;

    OffroadCar(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    void start(){
        this.engine.start();
        System.out.println("the " + this.model + " running");
    }
}
