import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumbersTest {

    private Numbers num;

    @BeforeMethod
    public void setUp() {
        num = new Numbers();
    }

    @Test
    public void testThatTreeSameNumbersWillRecognozeInThreeSignificantNumber() {
        assertEquals(num.checkSameSymbolsInNumber(111), " 3 numbers are equal");
    }

    @Test
    public void testThatTwoSameNumbersWillRecognozeInThreeSignificantNumberWherelocatoinSameNumbersOnTheLeftAndOnTheRight() {
        assertEquals(num.checkSameSymbolsInNumber(101), "two numbers are equal");
    }

    @Test
    public void testThatTwoSameNumbersWillRecognozeInThreeSignificantNumberWherelocatoinSameNumbersOnTheLeft() {
        assertEquals(num.checkSameSymbolsInNumber(110), "two numbers are equal");
    }

    @Test
    public void testThatOnlyThreeSignificantNumberCanBeRecognized() {
        assertEquals(num.checkSameSymbolsInNumber(11), "Number contains less or more that 3 numbers");
    }

    @Test
    public void testThatAllNumbersInThreeSignificantNumberAreDifferent() {
        assertEquals(num.checkSameSymbolsInNumber(123), "There aren't same numbers");
    }

    @Test
    public void testThatConverterReturnCorrectDecimalNumber() {
        int [] testArray={1,1,1,1};
        assertEquals(num.convertBinaryNumberToDecimal(testArray),15);
    }
    @Test
    public void testThatInputArrayCantContanWrongData() {
        int [] testArray={1,3,1,1};
        assertEquals(num.convertBinaryNumberToDecimal(testArray),0);
    }

    @Test
    public void testThatArrayCantContentZoresOnBegin() {
        int [] testArray={0,0,1,1};
        assertEquals(num.convertBinaryNumberToDecimal(testArray),3);
    }
    @Test
    public void testThatInitialArrayCanContainsMoreFourItems() {
        int [] testArray={0,0,0,1,1,1};
        assertEquals(num.convertBinaryNumberToDecimal(testArray),7);
    }
}