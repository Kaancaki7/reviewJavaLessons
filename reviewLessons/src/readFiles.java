import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFiles {

    public static void main(String[] args) {

        //BufferedReader --> FileReader: best for reading text files line-by-line

        //FileInputStream --> best for binary files(e.g. , images , autofiles)

        //RandomAccesFile --> best for red/write spesific portions of a large files

        String filePath = "C:\\Users\\kaanke\\Desktop\\test.txt";


        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){

            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("could not locate file");
        }
        catch (IOException e){
            System.out.println("something went wrong");
        }



    }
}
