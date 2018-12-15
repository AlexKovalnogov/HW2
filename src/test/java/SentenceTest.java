
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SentenceTest {
    private Sentence sentence;

    @BeforeMethod
    public void setUp() {
        sentence = new Sentence();
    }

    @Test
    public void testThatFunctionGetShortestAndLongestWorldsInSentenceWithAmountOfSymbolsReturnsCorrectShortestAndLongestWorldsWithAmountOfCharacters() {
        Assert.assertEquals(sentence.getShortestAndLongestWorldsInSentenceWithAmountOfSymbols("test test1 test12"), "shortest 4 test and  Longest6 test12");
    }

    @Test
    public void testThatUserCanInputEmptyValue() {
        Assert.assertEquals(sentence.getShortestAndLongestWorldsInSentenceWithAmountOfSymbols(""), "String null or empty");
    }

    @Test
    public void testThatUserCanInputEmptyValueWithWhitespaces() {
        Assert.assertEquals(sentence.getShortestAndLongestWorldsInSentenceWithAmountOfSymbols("   "), "String null or empty");
    }

    @Test
    public void testThatFunctionProcesesNullReferenceOnStringObject() {
        Assert.assertEquals(sentence.getShortestAndLongestWorldsInSentenceWithAmountOfSymbols(null), "String null or empty");
    }

    @Test
    public void testThatUserCanInputManyWhiteSpacesBeforeAndAfterSentence() {
        Assert.assertEquals(sentence.getShortestAndLongestWorldsInSentenceWithAmountOfSymbols("       test test1 test12         "), "shortest 4 test and  Longest6 test12");
    }

    @Test
    public void testThatUserCanInputManyWhiteSpacesBetweenWorlds() {
        Assert.assertEquals(sentence.getShortestAndLongestWorldsInSentenceWithAmountOfSymbols("test  test1    test12  "), "shortest 4 test and  Longest6 test12");
    }

    @Test
    public void testThatUsersCanInputSeveralWorldsWithSameAmountOfSympolsAndInOutputWillDisplayFirstWorldFromShortestAmount() {
        Assert.assertEquals(sentence.getShortestAndLongestWorldsInSentenceWithAmountOfSymbols("test  1234    test12  "), "shortest 4 test and  Longest6 test12");
    }

    @Test
    public void testThatUsersCanInputSeveralWorldsWithSameAmountOfSympolsAndInOutputWillDisplayFirstWorldFromLongestAmount() {
        Assert.assertEquals(sentence.getShortestAndLongestWorldsInSentenceWithAmountOfSymbols("test  12345    test1  "), "shortest 4 test and  Longest5 12345");
    }

    @Test
    public void testThatLongestAndShortestWorldIsSameIFSentenceContainsOnlyOneWorld() {
        Assert.assertEquals(sentence.getShortestAndLongestWorldsInSentenceWithAmountOfSymbols(" test  "), "shortest 4 test and  Longest4 test");
    }
}