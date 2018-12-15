import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;


public class Sentence {

    private Logger logger = Logger.getLogger(Sentence.class);

    public String getShortestAndLongestWorldsInSentenceWithAmountOfSymbols(String sentence) {

        if (sentence != null && sentence.trim().length() != 0) {
            String shortestWorldWithLengthr = getTheShortestWorldInSentenceWithLength(sentence);
            String longestWorldWithLength = getTheLongestWorldInSentenceWithLength(sentence);
            return "shortest " + shortestWorldWithLengthr + " and " + " Longest" + longestWorldWithLength;
        } else
            return "String null or empty";

    }

    private String getTheShortestWorldInSentenceWithLength(String stringSentense) {

        int minCharacters;
        String shorterWorld;
        String sentenceAfterCuttingOddSpaces = cutOddSpacesInSentence(stringSentense);
        List<String> listOfWorlds = getWorldsFromSentence(sentenceAfterCuttingOddSpaces);
        minCharacters = listOfWorlds.get(0).length();
        shorterWorld = listOfWorlds.get(0);
        for (int i = 0; i < listOfWorlds.size(); i++) {
            if (listOfWorlds.get(i).length() < minCharacters) {
                minCharacters = listOfWorlds.get(i).length();
                shorterWorld = listOfWorlds.get(i);
            }
        }

        logger.info(minCharacters + " " + shorterWorld);
        return String.valueOf(minCharacters) + " " + shorterWorld;
    }


    private String getTheLongestWorldInSentenceWithLength(String str) {

        int maxCharacters;
        String longestWorld;
        String sentenceAfterCuttingOddSpaces = cutOddSpacesInSentence(str);
        List<String> listOfWorlds = getWorldsFromSentence(sentenceAfterCuttingOddSpaces);
        maxCharacters = listOfWorlds.get(0).length();
        longestWorld = listOfWorlds.get(0);
        for (int i = 0; i < listOfWorlds.size(); i++) {

            if (listOfWorlds.get(i).length() > maxCharacters) {
                maxCharacters = listOfWorlds.get(i).length();
                longestWorld = listOfWorlds.get(i);
            }
        }
        logger.info(maxCharacters + " " + longestWorld);
        return String.valueOf(maxCharacters) + " " + longestWorld;
    }

    private String cutOddSpacesInSentence(String str) {

        return str.trim().replaceAll("\\s{2,}", " ");
    }

    private List<String> getWorldsFromSentence(String str) {
        List<Integer> arrayOfIndexes = getIndexesOfSpacesInSentence(str);
        List<String> listOfWorldsFromSentence = new ArrayList<String>();
        for (int i = 0; i < arrayOfIndexes.size() - 1; i++) {
            int beginIndex = arrayOfIndexes.get(i);
            int endIndex = arrayOfIndexes.get(i + 1);
            listOfWorldsFromSentence.add(str.substring(beginIndex + 1, endIndex));
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

}