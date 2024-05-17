import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExThree {
    public static void main(String[] args) {

        if (args.length != 1) { // calls method to print error message if there's no argument
            printError();
        }

        Path inFile = Path.of(args[0]); // makes a path to a file that is an argument in the terminal
        Path outFile = Path.of(args[0] + ".backwards.txt"); // makes a new text file

        if (!Files.isReadable(inFile)) { // if the file isn't readable print error message
            printError();
        }
        try {
            if (Files.size(inFile) > 1048576) { //checking if the file is exactly 1mb
                System.out.println("The file is too big!");
                System.exit(-1);
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        try (BufferedReader reader = Files.newBufferedReader(inFile);
        BufferedWriter writer = Files.newBufferedWriter(outFile)) { // try with resourses to make sure it will work.

            List<String> list = addFileToList(reader); // makes a list and calles the method that takes the file and converts it to a list

            for (String string : reverseList(list)) { // takes the list, reverse it and adds it to the new text file
                writer.write(string + "\n");
            }

        } catch (IOException ex) { // catch the IOExcetion and prints out error message
            System.out.println("Error while reading the file");
        }
    }

    public static void printError() { // method to print error message
        System.out.println("Couldn't read the file");
    }

    public static List<String> addFileToList(BufferedReader reader) throws IOException { // method that makes a list out of the text file
        List<String> list = new ArrayList<>(); // make a new list
        String line; // make a temp line
        while ((line = reader.readLine()) != null) { // loop that checks that there still is a line to read
            list.add(line);
        }
        return list;
    }

    public static List<String> reverseList(List<String> list) { // method to reverse the list, returns a list and takes in the textfile, throws IOExption as we handle it in main
        List<String> reverseList = new ArrayList<>(); 
        String temp; 
        for (String string : list) {
            StringBuilder builder = new StringBuilder(string);
            StringBuilder reverseBuilder = builder.reverse();
            temp = reverseBuilder.toString();
            reverseList.add(temp);
        }
        Collections.reverse(reverseList);
        return reverseList;
    }
}
