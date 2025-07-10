public class overloadedMethods {

    public static void main(String[] args){

        System.out.println(add(1,2,3,4));
        System.out.println("-----------------------------------------------------------------------------------");

        String pizza = bakePizza("flat bread","cheedar", "pepperoni");
        System.out.println(pizza);
    }

    static double add(double a, double b){
        return a + b;
    }

    static double add(double a, double b, double c){
        return a + b + c;
    }

    static double add(double a, double b, double c, double d){
        return a + b + c + d;
    }

    static String bakePizza(String bread){
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese){
        return bread + " " + cheese + " pizza";
    }

    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";
    }
}
