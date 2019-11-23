package Math;

public class Math {
    public static int findMax(int [] numbers){
        int max = Integer.MIN_VALUE;

        for(int number : numbers){
            if(number > max){
                max = number;
            }
        }
        return max;
    }

    public static int calculateSum(int [] numbers){
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;

    }

    public static double calculateAverage(int [] numbers){

        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        double average = sum / numbers.length;
        return average;

    }

    public static int Multiplication(int[] numbers){
        int mlt = 1;
        for(int number : numbers){
            mlt *= number;

        }
        return mlt;
    }

    public static int Strong(int number){
        int ret = 1;
        for(int i =1; i<=number; i++){
            ret *= i;
        }
        return ret;
    }



}
