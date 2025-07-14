public class arrayOfObjects {

    public static void main(String[] args){

        Motocycle motocycle1 = new Motocycle("Yamaha","black");
        Motocycle motocycle2 = new Motocycle("BMW","blue");
        Motocycle motocycle3 = new Motocycle("Kawasaki","green");

        Motocycle[] motocycles = {motocycle1, motocycle2, motocycle3};

        for(int i = 0; i < motocycles.length; i++){
            motocycles[i].drive();
        }
    }
}
