public class methods {

    public static void main(String[] args){

        String name = "Icardi";
        int age = 31;

        happyBirthday(name,age);
        System.out.println("-------------------------------------");
        System.out.println(square(4.5));
        System.out.println("-------------------------------------");
        System.out.println(cube(3));
        System.out.println("-------------------------------------");
        System.out.println(getFullName("Mauro", "Icardi"));
        System.out.println("-------------------------------------");

        if(ageCheck(age)){
            System.out.println("you may sign up!");
        }
        else{
            System.out.println("you must be 18+ sign up");
        }


    }

    static void happyBirthday(String name, int age){
        System.out.println("happy birthday to you");
        System.out.printf("happy birthday dear you %s\n", name);
        System.out.printf("you are %d years old\n",age);
        System.out.println("happy birthday to you\n");
    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }

}
