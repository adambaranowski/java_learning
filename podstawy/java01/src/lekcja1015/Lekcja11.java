package lekcja1015;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lekcja11 {

    public static void main(String args[]) throws IOException {

        String filename = "plik.txt";
        FileWriter filewriter = null;

        try {
            filewriter = new FileWriter(filename);
            filewriter.write("text 1\n");
            filewriter.write("text 2\n");
            filewriter.write("text 3\n");
            filewriter.write("text 4\n");
            //filewriter.close();
            //filewriter.flush();
        } catch(IOException ex){
            System.out.println("problem z plikiem");
        }
        finally {
            if(filewriter == null){
                System.out.println("problem");
            }
            filewriter.close();
        }
        BufferedReader bf = null;

        try{
            bf = new BufferedReader(new FileReader((filename)));
            String linia = null;
            do{
                linia = bf.readLine();
                if(linia != null){
                    System.out.println(linia);
                }

            } while (linia != null);

        }catch (IOException ex){
            System.out.println("problem z plikiem");

        }finally {
            if(bf == null){
                System.out.println("blad");
            }
            bf.close();
        }
    }
}
