import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class hangmanGame {

    public static void main(String[] args) {

        //JAVA HANGMAN GAME

        //words.txt dosyasından kelimeleri alma işlemi yaptık burada
        String filePath = "C:\\Users\\kaanke\\IdeaProjects\\reviewLessons\\src\\words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                words.add(line.trim());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("could not find file");
        }
        catch(IOException e){
            System.out.println("something went wrong");
        }

        //text dosyasından çıkardığımız kelimeler arasından rasgele bir kelime seçimi yaptırdık
        Random random = new Random();

        String word = words.get(random.nextInt(words.size()));
        //Buradan itibaren de oyunumuzun kodlarını yazdık.
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for(int i = 0; i < word.length(); i++){
            wordState.add('_');
        }

        System.out.println("****************************");
        System.out.println("welcome to java hangman game");
        System.out.println("****************************");

       while (wrongGuesses < 6){

           System.out.println(getHangmanArt(wrongGuesses));

           System.out.print("Word: ");

           for(char c : wordState){
               System.out.print(c + " ");
           }
           System.out.println();

           System.out.print("Guess a letter: ");
           char guess = scanner.next().toLowerCase().charAt(0);

           if(word.indexOf(guess) >= 0){
               System.out.println("Correct guess\n");

               for(int i = 0; i < word.length(); i++){
                   if(word.charAt(i) == guess){
                       wordState.set(i , guess);
                   }
               }

               if(!wordState.contains('_')){
                   System.out.println(getHangmanArt(wrongGuesses));
                   System.out.println("YOU WIN!");
                   System.out.println("the word was: " + word);
                   break;
               }
           }
           else{
               wrongGuesses++;
               System.out.println("wrong guess\n");
           }
       }

       if(wrongGuesses >= 6){
           System.out.println(getHangmanArt(wrongGuesses));
           System.out.println("GAME OVER!");
           System.out.println("the word was: " + word);
       }

        scanner.close();
    }

    static String getHangmanArt(int wrongGuesses){

        return switch(wrongGuesses){
            case 0 -> """
                    
                    
                    
                      """;
            case 1 -> """
                       o
                    
                    
                      """;
            case 2 -> """
                       o
                       |                   
                    
                      """;
            case 3 -> """
                       o
                      /|                   
                    
                      """;
            case 4 -> """
                       o
                      /|\\                   
                    
                      """;
            case 5 -> """
                       o
                      /|\\                   
                      /
                      """;
            case 6 -> """
                       o
                      /|\\                   
                      / \\
                      """;
            default -> "";

        };
    }
}

