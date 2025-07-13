public class Car {

    String make =   "Volkswagen";
    String model = "Polo";
    int year = 2011;
    double price = 670000;
    boolean isRunning = true;

    void start(){
        isRunning = true;
        System.out.println("you start engine.");
    }

    void stop(){
        isRunning = false;
        System.out.println("you stop the engine");
    }

    void drive(){
        System.out.println("you drive the " + model);
    }

    void brake(){
        System.out.println("you brake the " + model);
    }
}
