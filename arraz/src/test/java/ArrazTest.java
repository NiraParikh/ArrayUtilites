import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrazTest {

    private int[] spiffyHandyIntArray = new int[] {4,5,102,6,-7,12,-32,92,8};
    private Double[] spiffyHandyDoubleArray = new Double[] {1.0, 0.5, 3.6, 38.4, 17.3, 62.0, 9.0, 3.375, Double.valueOf(0), 3.14159};
    private Arraz arr = new Arraz();


    @Test
    public void sumValuesOfArray() {
        int actual = arr.sumValuesOfArray(spiffyHandyIntArray);
        int expected = 190;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sumValuesOfArray2() {
        int actual = arr.sumValuesOfArray(spiffyHandyIntArray);
        int expected = 191;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sumDoublessOfArray() {
        Double actual = arr.sumDoublesOfArray(spiffyHandyDoubleArray);
        double expected = 138.31659;

        assertEquals(expected, actual, 100);
    }

    @Test
    public void sumDoublessOfArray2() {
        double actual = arr.sumDoublesOfArray(spiffyHandyDoubleArray);
        double expected = 139.0;

        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void averageOfArray() {
        int actual = arr.averageOfArray(spiffyHandyIntArray);
        int expected = 190/spiffyHandyIntArray.length;

        assertEquals(expected, actual);
    }

    @Test
    public void averageOfArray2() {
        int actual = arr.averageOfArray(spiffyHandyIntArray);
        int expected = 190/spiffyHandyDoubleArray.length;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void doubleAverageOfArray() {
        double actual = arr.doubleAverageOfArray(spiffyHandyDoubleArray);
        double expected = 138.31659/spiffyHandyDoubleArray.length;

        assertEquals(expected,actual,100);
    }

    @Test
    public void doubleAverageOfArray2() {
        double actual = arr.doubleAverageOfArray(spiffyHandyDoubleArray);
        double expected = 137/spiffyHandyDoubleArray.length;

        assertEquals(expected,actual,100);
    }

    @Test
    public void containsValue() {
        assertTrue(arr.containsValue(spiffyHandyIntArray, 4));
    }

    @Test
    public void containsValue2() {
        assertFalse(arr.containsValue(spiffyHandyIntArray, 69));
    }

    @Test
    public void reverseArray() {
        int[] expected = new int[] {8,92,-32,12,-7,6,102,5,4};
        int[] actual = arr.reverseArray(spiffyHandyIntArray);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseArray2() {
        int[] actual = arr.reverseArray(spiffyHandyIntArray);

        assertSame(spiffyHandyIntArray,actual);
    }

    @Test
    public void oddEven() {
        OddEven expected = new OddEven(new Integer[]{5,-7},new Integer[]{4,102,6,12,-32,92,8});
        OddEven actual = arr.oddEven(spiffyHandyIntArray);


        Assert.assertEquals(expected.getEvens(), actual.getEvens());
        Assert.assertEquals(expected.getOdds(), actual.getOdds());
    }

    @Test
    public void oddEven2() {
        OddEven expected = new OddEven(new Integer[]{6,102,4,8,92,-32,12}, new Integer[]{-7,5});
        OddEven actual = arr.oddEven(spiffyHandyIntArray);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findIndexOf() {
        int expected = 2;
        int actual = arr.findIndexOf(spiffyHandyIntArray, 102);

        assertEquals(expected, actual);
    }

    @Test
    public void findIndexOf2() {
        int expected = 3;
        int actual = arr.findIndexOf(spiffyHandyIntArray, 102);

        Assert.assertFalse(false);
    }

//    @Test
//    public void copyArrayByIterator() {
//        Integer[] actual = arr.copyArrayByIterator(spiffyHandyIntegerArray);
//        Integer[] expected = spiffyHandyIntegerArray;
//
//        Assert.assertEquals(expected,actual);
//    }
//
//    @Test
//    public void copyArrayByIterator2() {
//        Integer[] actual = arr.copyArrayByIterator(spiffyHandyIntegerArray);
//
//        assertNotNull(actual);
//    }

    @Test
    public void copyArrayByLoop() {
        int[] actual = arr.copyArrayByLoop(spiffyHandyIntArray);
        int[] expected = spiffyHandyIntArray;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void copyArrayByLoop2() {
        int[] actual = arr.copyArrayByLoop(spiffyHandyIntArray);

        assertNotNull(actual);
    }

    @Test
    public void removeElementFromArray() {
        int[] actual = arr.removeElementFromArray(spiffyHandyIntArray, 102);
        int[] expected = new int[] {4, 5, 6, -7, 12, -32, 92, 8};

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeElementFromArray2() {
        int[] actual = arr.removeElementFromArray(spiffyHandyIntArray, -32);
        int[] expected = new int[] {4, 5, 102, 6, -7, 12, 92, 8};

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void insertIntoArrayAt() {
        int[] actual = arr.insertIntoArrayAt(spiffyHandyIntArray, 102, 3);
        int[] expected = new int[] {4, 5, 102, 102, 6, -7, 12, -32, 92, 8};

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void insertIntoArrayAt2() {
        int[] actual = arr.insertIntoArrayAt(spiffyHandyIntArray, 102, 6);
        int[] expected = new int[] {4, 5, 102, 6, -7, 12, 102, -32, 92, 8};

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findMaxMinOfArray() {
        MaxMin expected = new MaxMin();
        expected.setMax(102);
        expected.setMin(-32);
        MaxMin actual = arr.findMaxMinOfArray(spiffyHandyIntArray);

        assertEquals(expected.getMax(),actual.getMax());
        assertEquals(expected.getMin(),actual.getMin());

    }

    @Test
    public void findMaxMinOfArray2() {
        MaxMin actual = arr.findMaxMinOfArray(spiffyHandyIntArray);
        assertNotNull(actual);
    }

    @Test
    public void removeDupesFromArray() {
        Integer[] given = new Integer[] {4,4,5,102,6,6,-7,-7,12,-32,92,8,8};

        Integer[] actual = arr.removeDupesFromArray(given);
        Integer[] expected = new Integer[] {4,5,102,6,-7,12,-32,92,8};

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeDupesFromArray2() {
        Integer[] given = new Integer[] {4,4,5,102,6,6,-7,-7,12,-32,92,8,8};
        Integer[] actual = arr.removeDupesFromArray(given);

        Assert.assertFalse(Arrays.equals(given,actual));
    }

    @Test
    public void find2ndLargestValueFromArray() {
        double actual = arr.find2ndLargestValueFromArray(spiffyHandyDoubleArray);
        double expected = 38.4;

        assertEquals(expected, actual, 0.0);
    }

//    @Test
//    public void find2ndLargestValueFromArray2() {
//        double actual = arr.find2ndLargestValueFromArray(spiffyHandyDoubleArray);
//        double expected = 62.0;
//
//        assertNotEquals(expected, actual, 0.0);
//    }
//
//    @Test
//    public void makeMeAnArrayListFromArray() {
//        ArrayList<Integer> actual = arr.makeMeAnArrayListFromArray(spiffyHandyIntegerArray);
//        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(4,5,102,6,-7,12,-32,92,8));
//
//        assertEquals(expected,actual);
//    }
//
//    @Test
//    public void makeMeAnArrayListFromArray2() {
//        ArrayList<Integer> actual = arr.makeMeAnArrayListFromArray(spiffyHandyIntegerArray);
//
//        assertNotNull(actual);
//    }

    @Test
    public void makeMeAnArrayFromArrayList() {
        Integer[] actual = arr.makeMeAnArrayFromArrayList(new ArrayList<>(Arrays.asList(4,5,102,6,-7,12,-32,92,8)));
        Integer[] expected = new Integer[] {4,5,102,6,-7,12,-32,92,8};

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void makeMeAnArrayFromArrayList2() {
        Integer[] actual = arr.makeMeAnArrayFromArrayList(new ArrayList<>(Arrays.asList(4,5,102,6,-7,12,-32,92,8)));

        assertNotNull(actual);
    }

    @Test
    public void check2ArraysForEqual() {
        int[] int1 = new int[] {4,5,102,6,-7,12,-32,92,8};
        int[] int2 = new int[] {4,5,102,6,-7,12,-32,92,8};

        assertTrue(arr.check2ArraysForEqual(int1,int2));
    }

    @Test
    public void check2ArraysForEqual2() {
        int[] int1 = new int[] {5,102,6,-7,12,-32,92,8};
        int[] int2 = new int[] {4,5,102,6,-7,12,-32,92};

        assertFalse(arr.check2ArraysForEqual(int1,int2));
    }

//    @Test
//    public void averageArrayWithoutMaxMin() {
//        int actual = arr.averageArrayWithoutMaxMin(spiffyHandyIntArray);
//        int expected = 120/(spiffyHandyIntArray.length-2);
//
//        assertEquals(expected,actual);
//    }
//
//    @Test
//    public void averageArrayWithoutMaxMin2() {
//        int actual = arr.averageArrayWithoutMaxMin(spiffyHandyIntArray);
//        int expected = 120/spiffyHandyIntArray.length;
//
//        assertTrue(expected!=actual);
//    }

    @Test
    public void arrayHas65And77() {
        assertFalse(arr.arrayHas65And77(spiffyHandyIntArray));
    }

    @Test
    public void arrayHas65And77b() {
        assertTrue(arr.arrayHas65And77(new int[] {65, 77}));
    }

    @Test
    public void theTotalofTensIs30() {
        assertFalse(arr.theTotalOfTensIs30(new int[] {10,10,10,10}));
    }

    @Test
    public void theTotalofTensIs30b() {
        assertTrue(arr.theTotalOfTensIs30(new int[] {10,10,10}));

    }

    @Test
    public void findSmallestAndSecondSmallest() {
        int[] actual = arr.findSmallestAndSecondSmallest(spiffyHandyIntArray);
        int[] expected = new int[] {-32,-7};

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findSmallestAndSecondSmallest2() {
        int[] actual = arr.findSmallestAndSecondSmallest(spiffyHandyIntArray);

        assertEquals(2, actual.length);
    }

    @Test
    public void makeMeAReverseCopyPlease() {
        int[] expected = new int[] {8,92,-32,12,-7,6,102,5,4};
        int[] actual = arr.makeMeAReverseCopyPlease(spiffyHandyIntArray);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeMeAReverseCopyPlease2() {
        int[] actual = arr.makeMeAReverseCopyPlease(spiffyHandyIntArray);

        assertNotSame(spiffyHandyIntArray,actual);
    }

    @Test
    public void removeLastItemAndCopy() {
        int[] expected = new int[] {4,5,102,6,-7,12,-32,92};
        int[] actual = arr.removeLastItemAndCopy(spiffyHandyIntArray);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeLastItemAndCopy2() {
        int[] actual = arr.removeLastItemAndCopy(spiffyHandyIntArray);

        assertNotSame(spiffyHandyIntArray, actual);
    }

    @Test
    public void removeFirstItemAndCopy() {
        int[] expected = new int[] {5,102,6,-7,12,-32,92,8};
        int[] actual = arr.removeFirstItemAndCopy(spiffyHandyIntArray);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeFirstItemAndCopy2() {
        int[] actual = arr.removeFirstItemAndCopy(spiffyHandyIntArray);

        assertNotSame(spiffyHandyIntArray, actual);
    }

    @Test
    public void insertAtStartAndCopy() {
        int[] expected = new int[] {1, 4,5,102,6,-7,12,-32,92,8};
        int[] actual = arr.insertAtStartAndCopy(spiffyHandyIntArray, 1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void insertAtStartAndCopy2() {
        int[] actual = arr.insertAtStartAndCopy(spiffyHandyIntArray, 1);

        assertNotSame(spiffyHandyIntArray, actual);
    }

    @Test
    public void insertAtEndAndCopy() {
        int[] expected = new int[] {4,5,102,6,-7,12,-32,92,8, 1};
        int[] actual = arr.insertAtEndAndCopy(spiffyHandyIntArray, 1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void insertAtEndAndCopy2() {
        int[] actual = arr.insertAtEndAndCopy(spiffyHandyIntArray, 1);

        assertNotSame(spiffyHandyIntArray, actual);
    }

    @Test
    public void sortArrayIntoEvensThenOdds() {
        int[] expected = new int[] {4,102,6,12,-32,92,8,5,-7};
        int[] actual = arr.sortArrayIntoEvensThenOdds(spiffyHandyIntArray);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sortArrayIntoEvensThenOdds2() {
        int[] expected = new int[] {4,5,102,6,-7,12,-32,92,8};
        int[] actual = arr.sortArrayIntoEvensThenOdds(spiffyHandyIntArray);

        assertFalse(Arrays.equals(expected, actual));
    }

}
