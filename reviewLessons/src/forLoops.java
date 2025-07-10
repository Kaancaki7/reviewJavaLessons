import java.util.Scanner;

public class forLoops {

    public static void main(String[] args) throws InterruptedException {

        //DİPNOT :
        //BREAK -->  break out of a loop(STOP)
        //CONTİNUE --> skip current iteration of a loop(SKIP)

        //while içindeki koşum doğru olana kadar sonsuz dönebilir fakat for döngülerinde döngümüzü istediğimiz miktarda döndürebiliriz.

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 1; i <= max; i++){
            System.out.println(i);
        }

        System.out.println("-------------------------------------------------------------------------------------");


        System.out.print("how many seconds to countdown from: ");
        int start = scanner.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("happy new year");

        scanner.close();
    }
}
