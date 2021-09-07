
The file `dictionary.txt` contains all of the words in the Official Scrabble Player's 
Dictionary, Second Edition. WordListsGenerator generates useful word lists from this file for scrabble players.

================================================================================
NOTE
================================================================================
This program relies on user input from the terminal.
Due to the fact that some of the methods may have multiple parameters,
exceptions MAY not be thrown until all your input parameters have been received
for a particular test so please be patient when testing.

================================================================================
WordListsGenerator Class
================================================================================
2 instance variables: a Scanner to read the words from dictionary.txt and an 
Arraylist of strings to store them. 

The constructor takes a String denoting the filename, uses it to create a file 
object and passes it into the scanner. Each word in the file is stored in the 
Arraylist. In short, the constructor initializes the instance variables.

4 other methods: lengthN returns an ArrayList of all length n words in the 
dictionary file. Throws an IllegalArgumentException if the length parameter is
0 or a negative integer.

endsWith returns an ArrayList of words of length n ending with the letter 
lastLetter provided. Throws an IllegalArgumentException if the length parameter is
0 or a negative integer and if lastLetter is not a letter. Uppercase letters are
converted into lowercase ones for convenience.

containsLetter returns an ArrayList of words of length n containing the letter
included at position index. Throws an IllegalArgumentException if the length 
parameter is 0 or a negative integer and if lastLetter is not a letter. 
Uppercase letters are converted to lowercase ones for convenience. An 
IndexOutOfBoundsException is thrown if the index is greater than word length.

multiLetter returns an ArrayList of words with at least m occurrences of the 
letter included. Throws an IllegalArgumentException if the m parameter is
a negative integer and if lastLetter is not a letter. Uppercase letters are
converted into lowercase ones for convenience.

================================================================================
WordListsGeneratorTest Class
================================================================================
Main method:
Four Printwriters are initialized to write output to four files corresponding to
the names of the methods being tested. 
For each test, the user is prompted for input via the terminal and the input is
processed (an exception is thrown if invalid or it is passed into the 
appropriate method if valid). The bulk of the code is enclosed in a try block to
catch exceptions FileNotFound, IllegalArgument and IndexOutOfBounds as well as 
the general Exception in case all else fails.
Private helper methods:
printToFile takes an arraylist and a printwriter as parameters and prints the 
contents of the list into the file specified by the printwriter line by line.
getLetter takes a Scanner as a parameter and uses it to process user input to
obtain the letter needed for the method.

================================================================================
Instructions
================================================================================
Only positive integers, that is 1 and greater are accepted as input for
word lengths. The index and number of occurrences inputs for the containsLetter
and multiLetter tests respectively must be 0 or greater. All in all, no negative
integers will be accepted.
Ensure that when prompted for a letter, you input just that--a letter and 
nothing else.

================================================================================
Enjoy!
================================================================================
