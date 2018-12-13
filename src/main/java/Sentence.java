import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Sentence {

    public void f(String Str) {

        LinkedHashMap<Integer, String> integerStringLinkedHashMap = new LinkedHashMap<Integer, String>();
        List<String> listOfWorlds = getWorldsFromSentence(Str);

        for (int i = 0; i < listOfWorlds.size() - 1; i++) {
            integerStringLinkedHashMap.put(listOfWorlds.get(i).length(), listOfWorlds.get(i));
        }


    }

    public List<String> getWorldsFromSentence(String Str) {
        List<Integer> arrayOfIndexes = getIndexesOfSpacesInSentence(Str);
        List<String> listOfWorldsFromSentece = new ArrayList<String>();
        for (int i = 0; i < arrayOfIndexes.size() - 1; i++) {
            int beginIndex = arrayOfIndexes.get(i);
            int endIndex = arrayOfIndexes.get(i + 1);
            listOfWorldsFromSentece.add(Str.substring(beginIndex, endIndex));
        }
        return listOfWorldsFromSentece;
    }

    private List<Integer> getIndexesOfSpacesInSentence(String senteceWithSpaces) {

        int UNICODEOFSPACE = 32;
        List<Integer> arrayIndexesOfSpaces = new ArrayList<Integer>();
        for (int i = 0; i <= senteceWithSpaces.length() - 1; i++) {
            if (senteceWithSpaces.charAt(i) == UNICODEOFSPACE) {
                arrayIndexesOfSpaces.add(i);
            }
        }
        arrayIndexesOfSpaces.add(senteceWithSpaces.length());
        if (arrayIndexesOfSpaces.get(0) != 0) {
            arrayIndexesOfSpaces.add(0, 0);
        }

        return arrayIndexesOfSpaces;
    }


    public static void main(String[] args) {
        new Sentence().f("test1 test12 test123 Test1234");
        // Sentence sentence = new Sentence();
          /*  String s=" test1 test12 test123";

            System.out.println(s.indexOf(" "));*/


    }


}


