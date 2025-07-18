import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class countdownTimer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("ENTER NUMBER OF SECONDS TO COUNTDOWN FROM: ");

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = scanner.nextInt();

            @Override
            public void run() {

                System.out.println(count);
                count--;
                if(count < 0){
                    System.out.println("HAPPY NEW YEAR!");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 0, 1000);  //(task, delay, period)

    }
}
