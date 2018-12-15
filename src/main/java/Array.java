import java.util.Arrays;

import org.apache.log4j.Logger;

public class Array implements iArray {

    private Logger logger = Logger.getLogger(Array.class);

    public int[] shiftElementsInArray(int amountOfSwifts, int[] array) {

if (isValidInputDataForArraySwift(amountOfSwifts)){
        for (int j = 0; j < amountOfSwifts; j++) {
            int  buffer = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = buffer;
        }
}
        return array;
    }

private boolean isValidInputDataForArraySwift(int amountOfSwift){

        if (amountOfSwift<0){
            return  false;
        }else return true;
}


    protected boolean isArrayContainsOnlyBinaryNumbers(int[] binaryArray) {
        boolean state = false;
        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == 1 || binaryArray[i] == 0) {
                state = true;
            } else {
                state = false;
                break;
            }
        }
        return state;
    }


    public static void main(String[] args) {
        int my[] = {1, 2, 3, 4, 5};
        int[] my1 = new Array().shiftElementsInArray(11, my);
        System.out.println(Arrays.toString(my1));
    }
}
