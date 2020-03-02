package dao;

import api.ProductDao;
import entity.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
    private String fileName;



    public ProductDaoImpl(String fileName){
        this.fileName=fileName;
    }


    @Override
    public void saveProduct(Product product) throws IOException{

            FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
            PrintWriter printWriter = new PrintWriter(fileOutputStream);

            printWriter.println(product.toString());

            printWriter.close();
            fileOutputStream.close();

    }

    @Override
    public void saveProducts(List<Product> products) throws IOException{

        FileOutputStream fileOutputStream = new FileOutputStream(fileName, false);
        PrintWriter printWriter = new PrintWriter(fileOutputStream);

        for (Product p: products
             ) {
            printWriter.println(p.toString());

        }

        printWriter.close();
        fileOutputStream.close();
    }

    @Override
    public void removeProductById(Long productId)throws IOException{

        FileReader fileReader = new FileReader(fileName);
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
                if(value.equals(productId.toString())){
                    fileInList.remove(lineTable);
                    break outer;
                }

            }

        }

        FileOutputStream fileOutputStream = new FileOutputStream(fileName, false);

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

    @Override
   public  void removeProductByName(String productName)throws IOException{
        FileReader fileReader = new FileReader(fileName);
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

        FileOutputStream fileOutputStream = new FileOutputStream(fileName, false);
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

    @Override
    public List<Product> getAllProducts()throws IOException{
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<Product> products = new ArrayList<>();

        List<String[] > fileInList= new ArrayList<String[] >();
        String line = bufferedReader.readLine();

        while (line!=null){
            fileInList.add(line.split("#"));
            line=bufferedReader.readLine();
        }


        int x = 1;
        for (String[] lineTable : fileInList
        ) {

            products.add(new Product(Long.parseLong(lineTable[1]), lineTable[3], Double.parseDouble(lineTable[5]), Double.parseDouble(lineTable[7]), lineTable[9], Integer.parseInt(lineTable[11])));

            x++;
        }


        bufferedReader.close();
        fileReader.close();
        return products;
    }


    @Override
    public Product getProductById(Long productId)throws IOException{
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<String[] > fileInList= new ArrayList<String[] >();
        String line = bufferedReader.readLine();

        Product product = null;

        while (line!=null){
            fileInList.add(line.split("#"));
            line=bufferedReader.readLine();
        }

        outer: for (String[] lineTable: fileInList
        ) {
            for (String value: lineTable
            ) {
                if(value.equals(productId.toString())){
                    product = new Product(Long.parseLong(lineTable[1]), lineTable[3], Double.parseDouble(lineTable[5]), Double.parseDouble(lineTable[7]), lineTable[9], Integer.parseInt(lineTable[11]));

                    break outer;
                }

            }

        }

        return product;
    }

    @Override
    public Product getProductByName(String productName)throws IOException{
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<String[] > fileInList= new ArrayList<String[] >();
        String line = bufferedReader.readLine();

        Product product = null;

        while (line!=null){
            fileInList.add(line.split("#"));
            line=bufferedReader.readLine();
        }

        outer: for (String[] lineTable: fileInList
        ) {
            for (String value: lineTable
            ) {
                if(value.equals(productName)){
                    product = new Product(Long.parseLong(lineTable[1]), lineTable[3], Double.parseDouble(lineTable[5]), Double.parseDouble(lineTable[7]), lineTable[9], Integer.parseInt(lineTable[11]));

                    break outer;
                }
            }
        }

        return product;
    }


}
