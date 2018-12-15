import java.util.Arrays;
import org.apache.log4j.Logger;

public class Array {
    public int[] numbers;
Logger logger= Logger.getLogger(Array.class);

    public int[] shiftElementsInArray(int amount, int[] array) {

       for(int i=0;i<amount;i++) {
            int buffer=array[i];
        array[i]=array[i+amount];
        array[i+amount]=buffer;
        }




     /*   for (int i = 0; i < amount; i++) {
            int temp = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j-1];
            }
            array[0] = temp;
        }*/
        return array;
    }


    public static void main(String[] args) {
        int my[] = {1, 2, 3, 4, 5};
        int[] my1 = new Array().shiftElementsInArray(3, my);
        System.out.println(Arrays.toString(my1));
    }
}
