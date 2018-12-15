import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayTest {

   private Array arr;

    @BeforeMethod
    public void setUp() {
        arr = new Array();
    }
    @Test
    public void testTharElementsInArrayShift() {
        int [] testArray = {1, 2, 3, 4, 5};
        int [] arrayWithSwiwt  = {3, 4,5,1,2};
      Assert.assertEquals(arr.shiftElementsInArray(3,testArray),arrayWithSwiwt);
    }
    @Test
    public void testThatAmountofShiftCantBeNegativeAndArrayStayChangless() {
        int [] testArray = {1, 2, 3, 4, 5};
        int [] arrayWithSwiwt  = {1, 2, 3, 4, 5};
        Assert.assertEquals(arr.shiftElementsInArray(-3,testArray),arrayWithSwiwt);
    }
    @Test
    public void testThatSwiwtOnZeroAmountOfSwiwtDoesntChangeArray() {
        int [] testArray = {1, 2, 3, 4, 5};
        int [] arrayWithSwiwt  = {1, 2, 3, 4, 5};
        Assert.assertEquals(arr.shiftElementsInArray(0,testArray),arrayWithSwiwt);
    }

}