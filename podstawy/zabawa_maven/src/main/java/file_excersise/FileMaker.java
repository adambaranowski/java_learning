package file_excersise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileMaker {

    public static int[]  numbers = new int[1];
    public static String[] names = new String[1];
    public static void main(String[] args) throws IOException {

        //ZAD 1

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        String fileName1 = "liczby.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(fileName1, false);

        PrintWriter printWriter = new PrintWriter(fileOutputStream);
        for(int i = 0; i < numbers.length; i++ ){
            printWriter.write("Liczba nr 1 = " + numbers[i] + "\n");

        }
        printWriter.close();
        fileOutputStream.close(); //czy to też??

        /*Wlej we mnie codzienność, lecz o dobrej porze,
Nie chcę się bawić, gdyż to ja zabawiać każę,
Wielbi mnie dziecko, a starzec się lęka,
Widzi mnie każdy, wszak nikt nie pamięta.
Czym jestem?*/


        //ZAD 2

        Scanner scanner1 = new Scanner(System.in);

        for(int i = 0; i < names.length; i++){
            names[i] = scanner1.nextLine();
        }


        String filename2 = "imiona.txt";
        FileOutputStream fileOutputStream1 = new FileOutputStream(filename2);
        PrintWriter printWriter1 = new PrintWriter(fileOutputStream1);

        for(String s : names){
            printWriter1.write("Podano imię: " + s + "\n");
        }

        printWriter1.close();

        //ZAD 3

        String filename3 = "liczby2.txt";

        FileReader fileReader = new FileReader(filename3);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String readOneLine = bufferedReader.readLine();

        int numberOfNumbers = Integer.parseInt(readOneLine);

        //zapytać Pana Rapacza
        //int numberOfNumbers = Integer.parseInt(readOneLine);
        //Integer numberOfNumbers = Integer.parseInt(readOneLine); //parseint zwraca typ prymitywny
        //int numberOfNumers = Integer.valueOf(stringjakiśtam);
        //Integer numberOfnumbers = Integer.valueOd(stringjakiśtam);
        //Integer x = new Integer(4);


        int[] numbers = new int[numberOfNumbers];

        for(int i = 0;i<numberOfNumbers;i++){
            readOneLine = bufferedReader.readLine();
            numbers[i]=Integer.parseInt(readOneLine);
        }
        System.out.println(numbers[0] + numbers[1]+ numbers[2]);

        //ZAAD 4

        String filename4 = "imiona2.txt";

        FileReader fileReader1 = new FileReader(filename4);
        BufferedReader bufferedReader1 = new BufferedReader(fileReader1);

        List<String> nazwiska = new ArrayList<String>();


        while(bufferedReader1.readLine() != null){
            nazwiska.add(bufferedReader.readLine());
        }

        System.out.println(nazwiska.size());

        bufferedReader1.close(); ///które trzeba zamykać?
        fileReader1.close();// zapytać Pana Rapacza
        //ZAD 523
    }
}
