package oopDataReader;

import java.io.*;
import java.util.Scanner;

public class DataFileReaderPractice {



    public void dataReader1() throws FileNotFoundException {
        String fileName = "C:\\Users\\arafa\\eclipse-workspace\\Java_Notes_And_Practice\\src\\oopDataReader\\sample2.txt";
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }

    public void dataReader2() throws IOException {

        String filePath = "C:\\Users\\arafa\\eclipse-workspace\\Java_Notes_And_Practice\\src\\oopDataReader\\sample2.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(filePath);
            br = new BufferedReader(fr);
            String data;
            while( (data = br.readLine() ) !=null){
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            fr.close();
            br.close();
        }

    }


}
