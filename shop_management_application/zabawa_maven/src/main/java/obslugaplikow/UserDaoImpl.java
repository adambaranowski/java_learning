package obslugaplikow;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl {

    public static void removeUserById(Long Id) throws IOException {

        FileReader fileReader = new FileReader("src/main/java/obslugaplikow/users.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<String[]> fileInList = new ArrayList<String[]>();

        String line = bufferedReader.readLine();

        while(line != null){
            fileInList.add(line.split("#"));
            line = bufferedReader.readLine();
        }

        outer:
        for (String[] lineTable: fileInList
             ) {
            for (String value: lineTable
                 ) {
                if(value.equals(Id.toString())){
                    fileInList.remove(lineTable);
                    break outer;
                }

            }

        }

        FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/obslugaplikow/users.txt", false);
        PrintWriter printWriter = new PrintWriter(fileOutputStream);

        int x = 1;
        for (String[] lineTable: fileInList
             ) {

            printWriter.print(
                    "User{id=#" + lineTable[1] +
                            "#, login=#" + lineTable[3] +
                            "#, password=#" + lineTable[5] +
                            "#}"
            );
            if(x<fileInList.size()){
                printWriter.println();
            }
            x++;
        }

        printWriter.close();
        fileOutputStream.close();


    }

    public static void saveUser(User user) throws IOException{

        FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/obslugaplikow/users.txt", true);
        PrintWriter printWriter = new PrintWriter(fileOutputStream);

        printWriter.println();
        printWriter.print(user.toString());

        printWriter.close();
        fileOutputStream.close();




    }

    public static void saveUsers(List<User> users)throws IOException{

        FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/obslugaplikow/users.txt", true);
        PrintWriter printWriter = new PrintWriter(fileOutputStream);

        for (User user: users
             ) {
            printWriter.println();
            printWriter.print(user.toString());

        }

        printWriter.close();
        fileOutputStream.close();


    }

    public static void removeUserByLogin(String login) throws IOException{

        FileReader fileReader = new FileReader("src/main/java/obslugaplikow/users.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<String[]> fileInList = new ArrayList<String[]>();

        String line = bufferedReader.readLine();


        while(line!=null){
            fileInList.add(line.split("#"));
            line=bufferedReader.readLine();
        }


        outer:
        for (String[] lineTable: fileInList
             ) {
            for (String value: lineTable
                 ) {
                if(value.equals(login)){
                    fileInList.remove(lineTable);
                    break outer;
                }

            }

        }

        FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/obslugaplikow/users.txt", false);
        PrintWriter printWriter = new PrintWriter(fileOutputStream);

        int x = 1;
        for (String[] lineTable: fileInList
             ) {
            printWriter.print(
                    "User{id=#" + lineTable[1] +
                            "#, login=#" + lineTable[3] +
                            "#, password=#" + lineTable[5] +
                            "#}"
            );
            if(x < fileInList.size()){
                printWriter.println();
            }

        }

        printWriter.close();
        fileOutputStream.close();


    }

    public static User getUserById(Long Id)throws IOException{

        FileReader fileReader = new FileReader("src/main/java/obslugaplikow/users.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<String[]> fileInList = new ArrayList<String[]>();

        String line = bufferedReader.readLine();
        while (line != null){
            fileInList.add(line.split("#"));
            line = bufferedReader.readLine();

        }

        outer:
        for (String[] lineTable: fileInList
             ) {
            for (String value: lineTable
                 ) {
                if(value.equals(Id.toString())){
                    bufferedReader.close();
                    fileReader.close();

                    return new User(Long.parseLong(lineTable[1]), lineTable[3], lineTable[5]);
                }

            }

        }
        bufferedReader.close();
        fileReader.close();
        return null;
    }

    public static User getUserByLogin(String login) throws  IOException{
        FileReader fileReader = new FileReader("src/main/java/obslugaplikow/users.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<String[]> fileInList = new ArrayList<String[]>();
        String line = bufferedReader.readLine();

        while(line != null){
            fileInList.add(line.split("#"));
            line = bufferedReader.readLine();
        }

        for (String[] lineTable: fileInList
             ) {
            for (String value: lineTable
                 ) {
                if(value.equals(login)){
                    bufferedReader.close();
                    fileReader.close();
                    return new User(Long.parseLong(lineTable[1]), lineTable[3], lineTable[5]);

                }
            }

        }
        bufferedReader.close();
        fileReader.close();
        return null;
    }

    public static List<User> getAllUsers() throws IOException{

        FileReader fileReader = new FileReader("src/main/java/obslugaplikow/users.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<String[]> fileInList  = new ArrayList<String[]>();

        String line = bufferedReader.readLine();
        while (line != null){
            fileInList.add(line.split("#"));
            line = bufferedReader.readLine();

        }

        List<User> Users = new ArrayList<User>();

        for (String[] lineTable: fileInList
             ) {
            Users.add(new User(Long.parseLong(lineTable[1]), lineTable[3], lineTable[5]));
        }

        return Users;
    }

    public static void main(String[] args)throws IOException{
        //removeUserById((long)1111);

        ///User user = new User(4567, "puciakus", "xyz");
        ///saveUser(user);

        //List<User> users = new ArrayList<User>();
        ///users.add(new User(6666, "puciakul", "xyz"));
        ///users.add(new User(6667, "puciakum", "xyz"));

        //saveUsers(users);

        //removeUserByLogin("puciakul");

        System.out.println(getUserById((long)1114).toString());
        System.out.println(getUserByLogin("jan").toString());

        System.out.println();

        for (User user: getAllUsers()
             ) {
            System.out.println(user.toString());

        }



    }

}
