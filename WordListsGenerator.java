
import java.util.*;
import java.io.*;

public class WordListsGenerator{

    // Instance variables
    private Scanner scanDoc;
    private ArrayList<String> dictionary;
    
    
    // Constructor
    public WordListsGenerator(String fileName) throws FileNotFoundException{

        scanDoc = new Scanner(new File(fileName));
        dictionary = new ArrayList<String>();
        
        while(scanDoc.hasNext()){
            
            dictionary.add(scanDoc.next());
            
        }

        scanDoc.close();
        
    }

    
    // lengthN method
    public ArrayList<String> lengthN(int n){
        
        if(n <= 0){
            
            throw new IllegalArgumentException();
            
        }
        
        String testWord; 
        ArrayList<String> wordsOfLengthN = new ArrayList<String>();
        
        for(int i = 0; i < dictionary.size(); i++){
            
            testWord = dictionary.get(i);
            
            if(testWord.length() == n){
                
                wordsOfLengthN.add(testWord);
                
            }
            
        }
        
        return wordsOfLengthN;
    
    }


    // endsWith method
    public ArrayList<String> endsWith(char lastLetter, int n){

        if(n <= 0 || !(Character.isLetter(lastLetter))){
            
            throw new IllegalArgumentException();
            
        }
        
        lastLetter = Character.toLowerCase(lastLetter);
        String testWord;
        ArrayList<String> wordsEnding = new ArrayList<String>();
        
        for(int i = 0; i < dictionary.size(); i++){
            
            testWord = dictionary.get(i);
            
            if(testWord.length() == n &&
              testWord.charAt(testWord.length() - 1) == lastLetter){
                
                wordsEnding.add(testWord);
                
            }
            
        }
        
        return wordsEnding;

    }


    // containsLetter method
    public ArrayList<String> containsLetter(char included, int index, int n){

        if(!(Character.isLetter(included)) ||
          n <= 0 || index < 0){
            
            throw new IllegalArgumentException();
            
        }
        
        if(index >= n){
            
            throw new IndexOutOfBoundsException();
            
        }
        
        included = Character.toLowerCase(included);
        String testWord;
        ArrayList<String> wordsContaining = new ArrayList<String>();
        
        for(int i = 0; i < dictionary.size(); i++){
            
            testWord = dictionary.get(i);
            
            if(testWord.length() == n &&
              testWord.charAt(index) == included){
                
                wordsContaining.add(testWord);
                
            }
            
        }

        return wordsContaining;

    }

    
    // multiLetter method
    public ArrayList<String> multiLetter(int m, char included){

        if(m < 0 || !(Character.isLetter(included))){
            
            throw new IllegalArgumentException();
            
        }
        
        included = Character.toLowerCase(included);
        String testWord;
        int match = 0;
        ArrayList<String> wordsMulti = new ArrayList<String>();
        
        for(int i = 0; i < dictionary.size(); i++){
            
            match = 0;
            testWord = dictionary.get(i);
            
            for(int j = 0; j < testWord.length(); j++){
                
                if(testWord.charAt(j) == included){
                    
                    match++;
                    
                }
                
            }
            
            if(match >= m){
                
                wordsMulti.add(testWord);
                
            }
            
        }
        
        return wordsMulti;

    }
    
    
} // end of class








