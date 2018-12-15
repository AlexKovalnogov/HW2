import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

public class Numbers extends Array {
    private Logger logger = Logger.getLogger(Numbers.class);

    public String checkSameSymbolsInNumber(int threeSignificantNumber) {
        String sameNambers;
        if (isNumberContainsThreevalue(threeSignificantNumber)) {
            List<String> listSeparatedNumbers = separateNumbersAndWriteDownToListWithTypeString(Math.abs(threeSignificantNumber));
            List<Integer> integerListOfSeparatedNumbers = convertStringListToInteger(listSeparatedNumbers);

            if (integerListOfSeparatedNumbers.get(0).equals(integerListOfSeparatedNumbers.get(1)) &&
                    integerListOfSeparatedNumbers.get(1).equals(integerListOfSeparatedNumbers.get(2)) &&
                    integerListOfSeparatedNumbers.get(0).equals(integerListOfSeparatedNumbers.get(2))) {
                sameNambers = " 3 numbers are equal";
            } else if (integerListOfSeparatedNumbers.get(0).equals(integerListOfSeparatedNumbers.get(1)) ||
                    integerListOfSeparatedNumbers.get(0).equals(integerListOfSeparatedNumbers.get(2)) ||
                    integerListOfSeparatedNumbers.get(1).equals(integerListOfSeparatedNumbers.get(2))) {
                sameNambers = "two numbers are equal";
            } else {
                sameNambers = "There aren't same numbers";
            }
            return sameNambers;
        } else
            return "Number contains less or more that 3 numbers";

    }

    private boolean isNumberContainsThreevalue(int inputNumber) {
        if (String.valueOf(inputNumber).length() == 3) {
            return true;
        } else return false;
    }


    private List<String> separateNumbersAndWriteDownToListWithTypeString(int threeSignificantNumber) {


        List<String> strings = new ArrayList<String>();
        for (int beginIndex = 0, endIndex = 1; endIndex <= 3; beginIndex++, endIndex++) {

            strings.add(((Integer.toString(threeSignificantNumber)).substring(beginIndex, endIndex)));
        }
        return strings;

    }

    private List<Integer> convertStringListToInteger(List<String> list) {
        List<Integer> integersArrayList = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {
            integersArrayList.add(Integer.parseInt(list.get(i)));
        }
        return integersArrayList;
    }


    public int convertBinaryNumberToDecimal(int[] binaryNumberInArray) {

        int BINARYCONSTANT = 2;
        int decimalValue = 0;

        if (isArrayContainsOnlyBinaryNumbers(binaryNumberInArray)) {
            int pow = binaryNumberInArray.length - 1;
            for (int i = 0; i < binaryNumberInArray.length; i++) {
                decimalValue = decimalValue + (int) (binaryNumberInArray[i] * Math.pow(BINARYCONSTANT, pow));
                pow--;
            }
            logger.info(decimalValue);

        } else {
            logger.info("Array contains wrong data");
        }
        return decimalValue;
    }

}
