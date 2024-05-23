package static2.ex;

public class MathArrayUtils {
    private int[] array;

    private MathArrayUtils(){

    }

    public static int sum(int[] array){
        int sum = 0;
        for(int i : array){
            sum+=i;
        }
        return sum;
    }
    public static double average(int[] array){
        return (double) sum(array) /array.length;
    }
    public static int min(int[] array){
        int temp = array[0];
        for(int i : array){
            if (temp > array[i - 1]){
                temp = array[i];
            }
        }
        return temp;
    }
    public static int max(int[] array){
        int temp = array[0];
        for(int i : array){
            if(temp < array[i - 1]){
                temp = array[i];
            }
        }
        return temp;
    }
}
