public class varargs {

    public static void main(String[] args){

        System.out.println(add(1,2,3,4,5,6));

        System.out.println(average(1,2,3,4,5,6,7));
    }


    //normalde eskiden overload methodlarla yapıyorduk kaç tane değişken göndereceksek o kadarlık bir method yapıyorduk
    //burada numbers adlı bir dizi parametresi ayarlayarak istediğim kadar sayı gönderebilirim ve bunun için birsürü
    //overload merthod kullanmama gerek kalmaz.
    static int add(int... numbers){

        int sum = 0;

        for(int number : numbers){
            sum += number;
        }

        return sum;
    }

    static double average(double... numbers){

        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        for(double number : numbers){
            sum += number;
        }

        return sum / numbers.length;
    }
}
