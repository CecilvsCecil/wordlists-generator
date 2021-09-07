
import java.io.*;
import java.util.*;

public class WordListsGeneratorTest{
    
    public static void main(String[] args){
        
        System.out.println("------------------------------------------------");
        System.out.println("           Welcome to Wordlists Generator!      ");
        System.out.println("------------------------------------------------");
        
        Scanner input = new Scanner(System.in);
        
        try{
            
            // PrintWriters for the four output text files
            PrintWriter outputLengthN = new PrintWriter("lengthN.txt");
            PrintWriter outputEndsWith = new PrintWriter("endsWith.txt");
            PrintWriter outputContains = new PrintWriter("containsLetter.txt");
            PrintWriter outputMultiLetter = new PrintWriter("multiLetter.txt");
            
            WordListsGenerator scrabble = new WordListsGenerator("dictionary.txt");
        
            // lengthN test
            System.out.print("Enter word length for lengthN test: ");   
            int length1 = Integer.parseInt(input.nextLine());
        
            printToFile(scrabble.lengthN(length1), outputLengthN);
        
            
           // endsWith test
            System.out.print("\nEnter last letter for endsWith test: ");
            char lastLetter = getLetter(input);
            
            System.out.print("Enter word length for endsWith test: ");
            int length2 = Integer.parseInt(input.nextLine());
           
            printToFile(scrabble.endsWith(lastLetter,length2), outputEndsWith);
            
            
            // containsLetter test
            System.out.print("\nEnter letter for containsLetter test: ");           
            char givenLetter = getLetter(input);
        
            System.out.print("Enter index for containsLetter test: ");
            int index = Integer.parseInt(input.nextLine());
            
            System.out.print("Enter word length for containsLetter test: ");
            int length3 = Integer.parseInt(input.nextLine());
            
            printToFile(scrabble.containsLetter(givenLetter, index, length3),
                        outputContains);
        
            
            // multiLetter test
            System.out.print("\nEnter letter for multiLetter test: ");
            char letter = getLetter(input);
            
            System.out.print("Enter number of occurrences for " + 
                             "multiLetter test: ");
            int m = Integer.parseInt(input.nextLine());
            
            printToFile(scrabble.multiLetter(m, letter), outputMultiLetter);
      
        }
        
        catch(FileNotFoundException e1){
            
            System.out.println("File not found!");
            
        }
        
        catch(IllegalArgumentException e2){
            
            System.out.println("Please be sure to enter only a positive "
                              + "integer or a letter as required");
            
        }
        
        catch(IndexOutOfBoundsException e3){
            
            System.out.println("index must be a positive integer less than" +
                              " word length!");
            
        }
        
        catch(Exception e){
            
            System.out.println("Oops! Something went wrong, try again!");
            
        }
        
        input.close();
        
    }
    
    // Private helper method: prints words to file and closes PrintWriter
    private static void printToFile(ArrayList<String> list, PrintWriter pW){
        
        for(String word : list){
            
            pW.println(word);
            
        }
        
        pW.close();
        
    }

    // Private helper method: takes letter input
    private static char getLetter(Scanner in){
        
        String testLetter = in.nextLine();
            
        if(testLetter.length() != 1 ||
          !(Character.isLetter(testLetter.charAt(0)))){
                
           throw new IllegalArgumentException();
                
        }
        
        return testLetter.charAt(0);
        
    }
    
} // end of class