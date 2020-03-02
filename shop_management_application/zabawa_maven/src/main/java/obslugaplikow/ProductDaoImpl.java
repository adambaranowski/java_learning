package obslugaplikow;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class ProductDaoImpl {

    public static void removeProductById(Long productId) throws IOException {
        FileReader fileReader = new FileReader("src/main/java/obslugaplikow/produkty.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<String[]> fileInList = new ArrayList<String[]>();
        String line = bufferedReader.readLine();

        while (line != null) {
            fileInList.add(line.split("#"));
            line = bufferedReader.readLine();
        }

        outer:
        for (String[] lineTable : fileInList
        ) {
            for (String value : lineTable
            ) {
                if (value.equals(productId.toString())) {
                    fileInList.remove(lineTable);
                    break outer;
                }
            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/obslugaplikow/produkty.txt", false);
        PrintWriter printWriter = new PrintWriter(fileOutputStream);

        int x = 1;
        for (String[] lineTable : fileInList
        ) {
            printWriter.print("Product{" +
                    "id=#" + lineTable[1] +
                    "#, productName=#" + lineTable[3] +
                    "#, price=#" + lineTable[5] +
                    "#, weight=#" + lineTable[7] +
                    "#, color=#" + lineTable[9] +
                    "#, productCount=#" + lineTable[11] + "#}");
            if(x<fileInList.size()){
                printWriter.println();
            }
            x++;
        }
        printWriter.close();
        fileOutputStream.close();
    }

    public static void removeProductByName(String productName)throws IOException{
        FileReader fileReader = new FileReader("src/main/java/obslugaplikow/produkty.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<String[] > fileInList= new ArrayList<String[] >();
        String line = bufferedReader.readLine();

        while (line!=null){
            fileInList.add(line.split("#"));
            line=bufferedReader.readLine();
        }

        outer: for (String[] lineTable: fileInList
        ) {
            for (String value: lineTable
            ) {
                if(value.equals(productName)){
                    fileInList.remove(lineTable);
                    break outer;
                }

            }

        }

        FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/obslugaplikow/produkty.txt", false);
        PrintWriter printWriter = new PrintWriter(fileOutputStream);

        int x = 1;
        for (String[] lineTable : fileInList
        ) {
            printWriter.print("Product{" +
                    "id=#" + lineTable[1] +
                    "#, productName=#" + lineTable[3] +
                    "#, price=#" + lineTable[5] +
                    "#, weight=#" + lineTable[7] +
                    "#, color=#" + lineTable[9] +
                    "#, productCount=#" + lineTable[11] + "#}");
            if(x<fileInList.size()){
                printWriter.println();
            }
            x++;
        }
        printWriter.close();
        fileOutputStream.close();
    }
    public static  List<Product> getAllProducts()throws IOException{
        FileReader fileReader = new FileReader("src/main/java/obslugaplikow/produkty.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<Product> products = new ArrayList<Product>();

        List<String[] > fileInList= new ArrayList<String[] >();
        String line = bufferedReader.readLine();

        while (line!=null){
            fileInList.add(line.split("#"));
            line=bufferedReader.readLine();
        }


        int x = 1;
        for (String[] lineTable : fileInList
        ) {
            /*
            System.out.println(Long.parseLong(lineTable[1]));
            System.out.println(lineTable[3]);
            System.out.println(Double.parseDouble(lineTable[5]));
            System.out.println(Double.parseDouble(lineTable[7]));
            System.out.println(lineTable[9]);
            System.out.println(Integer.parseInt(lineTable[11]));
           Product p = new Product(Long.parseLong(lineTable[1]), lineTable[3], Double.parseDouble(lineTable[5]), Double.parseDouble(lineTable[7]), lineTable[9], Integer.parseInt(lineTable[11]));
*/
           products.add(new Product(Long.parseLong(lineTable[1]), lineTable[3], Double.parseDouble(lineTable[5]), Double.parseDouble(lineTable[7]), lineTable[9], Integer.parseInt(lineTable[11])));

            x++;
        }


        bufferedReader.close();
        fileReader.close();
        return products;
    }

    public static void main(String[] args) throws IOException {
        removeProductById((long)1113);
        //removeProductByName("czapka");

        //List<Product> p = getAllProducts();

        for (Product p: getAllProducts()
             ) {
            System.out.println(p.toString());

        }

    }
}
