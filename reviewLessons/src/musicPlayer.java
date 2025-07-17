import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class musicPlayer {

    public static void main(String[] args) {

        //HOW TO PLAY AUDIO WITH JAVA (.waw , .au, .aiff)

        String filePath = "src\\Cash - Mark Karan, Scott Guberman, Angeline Saris, Jeremy Hoenig.wav";
        File file = new File(filePath);

        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while(!response.equals("Q")){

                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("enter your choice: ");

                response = scanner.next().toUpperCase();

                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("invalid choice!");
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println("could not locate file");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("audio file is no supported");
        }
        catch(LineUnavailableException e){
            System.out.println("unable to access audio resource");
        }
        catch(IOException e){
            System.out.println("something went wrong");
        }
        finally {
            System.out.println("Bye!");
        }
    }
}
