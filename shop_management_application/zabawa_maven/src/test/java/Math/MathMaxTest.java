package Math;



import org.junit.Assert;
import org.junit.Test;



public class MathMaxTest {
    @Test
    public void testFindMaxPositiveNumbers(){

        //is czyli jest coś dane np. liczby
        int [] numbers = {0, 12, 3, 4, 8, 9, 55, 12, 99, 101};
        //then wykonujemy sprawdzenie metody na podstawie danych z is
        final int result = Math.findMax(numbers);
        //equals  oczekujemy konkretnego wyniku operacji z then
        Assert.assertEquals(101, result);
    }

    @Test
    public void testFindMaxInNegativeNumber(){
        //is
        int [] numbers = {0, -12, -3, 4, 8, 9, -55, 15, -99};
        //then
        final int result = Math.findMax(numbers);

        //excepted
        Assert.assertEquals(15, result);
    }

    @Test
    public void testSum(){
        int [] numbers = {1, 2, 3};
        int result = Math.calculateSum(numbers);
        Assert.assertEquals(6, result);
    }

    @Test
    public void testAverage(){
        int [] numbers = {1, 2, 3};

        double average = Math.calculateAverage(numbers);

        Assert.assertEquals(2.0, average, 0.01);
    }

    @Test
    public void testMultiplication(){
        int [] numbers = {1, 2, 3, 4, 5};

        int result = Math.Multiplication(numbers);

        Assert.assertEquals(120, result);


    }

    @Test
    public void testStrong(){
        int number = 10;

        int result = Math.Strong(number);

        Assert.assertEquals(3628800, result);
    }



}
