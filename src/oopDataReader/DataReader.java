package oopDataReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DataReader {
//  FileReader class: makes it possible to read the contents of a file as a stream of characters.
// It works much like the FileInputStream except the FileInputStream reads bytes, whereas the FileReader reads characters.
//
//  BufferedReader class: Reads text from a character-input stream(FileReader), for the efficient
// reading of characters, arrays, and lines.

//Difference:
// FileReader is an unbuffered character stream. This means it translates bytes from their internal character set to the
// local character set one byte at a time.
// BufferedReader is a buffered stream. A FileReader can be wrapped in a BufferedReader for more efficient reading of a file.


    public static void main(String[] args) {

        FileReader fr = null;
        BufferedReader br = null;

        String fileName = "C:\\Users\\arafa\\eclipse-workspace\\Java_Notes_And_Practice\\src\\oopDataReader\\sample.txt";

        try{
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            String data;

            while( (data = br.readLine() ) != null){
                System.out.println(data);
            }



        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                fr.close();
                br.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }




    }

}
