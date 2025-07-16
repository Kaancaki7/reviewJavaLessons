import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class writeFiles {

    public static void main(String[] args) {


        //FileWriter --> good for small or medium sized text files

        //BufferedWriter --> better performance for large amounts of text

        //PrintWriter --> best of structured data, like reports or logs

        //FileOutputStream --> best for binary files (e.g. , images , audio files)


        String textContext = """
                I love Galatasaray
                I love Icardi
                I love Sane
                """;

        try (FileWriter writer = new FileWriter("test.txt")){
            writer.write(textContext);
            System.out.println("file has been written");
        }
        catch (FileNotFoundException e){
            System.out.println("could not locate file location");
        }
        catch (IOException e){
            System.out.println("could not write file");
        }

    }
}
