import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    Logger logger = Logger.getLogger(Numbers.class);


    public String checkSameSymbolsInNumber(int threeSignificantNumber) {
        String sameNambers;
        List<String> listSeparatedNumbers = separateNambersAndWriteDownToListWithTypeString(threeSignificantNumber);
        List<Integer> integerListOfSeparatedNumbers = convertStringListToInteger(listSeparatedNumbers);

        if (integerListOfSeparatedNumbers.get(0) == integerListOfSeparatedNumbers.get(1) &&
                integerListOfSeparatedNumbers.get(1) == integerListOfSeparatedNumbers.get(2) &&
                integerListOfSeparatedNumbers.get(0) == integerListOfSeparatedNumbers.get(2)) {
            sameNambers = " 3 numbers are equal";
        } else if (integerListOfSeparatedNumbers.get(0) == integerListOfSeparatedNumbers.get(1) ||
                integerListOfSeparatedNumbers.get(0) == integerListOfSeparatedNumbers.get(2) ||
                integerListOfSeparatedNumbers.get(1) == integerListOfSeparatedNumbers.get(2)) {

            sameNambers = "two numbers are equal";
        } else {
            sameNambers = "There aren't same numbers";
        }
        return sameNambers;
    }

    private List<String> separateNambersAndWriteDownToListWithTypeString(int threeSignificantNumber) {


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



    public static void main(String[] args) {

    /*  String s="123";
        System.out.println(s.substring(0,1));
        System.out.println(s.substring(1,2));
        System.out.print(s.substring(2,3));*/


        //System.out.println(new Numbers().check(new Numbers().checkSameSymbolsInNumber(111)));
    }
}