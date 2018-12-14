import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Sentence {




    private void getTheLongestWorldInSentenceWithLength(String Str) {

        int maxCharacters = 0;
        String world="";
        String sentenceAfterCuttingOddSpaces = cutOddSpacesInSentence(Str);
        List<String> listOfWorlds = getWorldsFromSentence(sentenceAfterCuttingOddSpaces);
        for (int i = 0; i < listOfWorlds.size(); i++) {

            if (listOfWorlds.get(i).length() > maxCharacters) {
                maxCharacters = listOfWorlds.get(i).length() ;
                world =listOfWorlds.get(i);
            }
        }
        System.out.println(maxCharacters+" "+world);

    }

    private String cutOddSpacesInSentence(String str) {

        return str.trim().replaceAll("\\s{2,}", " ");
    }

    public List<String> getWorldsFromSentence(String Str) {
        List<Integer> arrayOfIndexes = getIndexesOfSpacesInSentence(Str);
        List<String> listOfWorldsFromSentence = new ArrayList<String>();
        for (int i = 0; i < arrayOfIndexes.size() - 1; i++) {
            int beginIndex = arrayOfIndexes.get(i);
            int endIndex = arrayOfIndexes.get(i + 1);
            listOfWorldsFromSentence.add(Str.substring(beginIndex+1, endIndex));
        }
        return listOfWorldsFromSentence;
    }

    private List<Integer> getIndexesOfSpacesInSentence(String sentenceWithSpaces) {

        int UNICODEOFSPACE = 32;
        List<Integer> arrayIndexesOfSpaces = new ArrayList<Integer>();
        for (int i = 0; i <= sentenceWithSpaces.length() - 1; i++) {
            if (sentenceWithSpaces.charAt(i) == UNICODEOFSPACE) {
                arrayIndexesOfSpaces.add(i);
            }
        }
        arrayIndexesOfSpaces.add(0, -1);
        arrayIndexesOfSpaces.add(sentenceWithSpaces.length());
        return arrayIndexesOfSpaces;
    }


    public static void main(String[] args) {
        new Sentence().getTheLongestWorldInSentenceWithLength("   test1   test12   test123   Test1234   1est1235 ");
        // Sentence sentence = new Sentence();
          /*  String s=" test1 test12 test123";

            System.out.println(s.indexOf(" "));*/
        ///System.out.println(new Sentence().cutOddSpacesInSentence("   test1      test12    test123    Test1234  "));

    }


}


