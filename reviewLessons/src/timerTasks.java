import java.util.Timer;
import java.util.TimerTask;

public class timerTasks {

    public static void main(String[] args) {


        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = 3;

            @Override
            public void run() {
                System.out.println("hello!");
                count--;
                if(count <= 0){
                    System.out.println("TASK COMPLETE");
                    timer.cancel();
                }
            }
        };

        //timer.schedule(task, 3000); //mesajımızın 3sn delaylı gelmesini sağladı.
        //timer.schedule(task, 0, 1000);  //1 sn aralarla sürekli yazdırır.

        timer.schedule(task, 3000, 1000); //ilkini 3sn de basar diğerleri 1sn arayla basmaya devam eder

    }
}
