import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Arraz {


    //Finding Sum
    public int sumValuesOfArray(int[] intArr){
        int sum = 0;
        for (int i = 0; i < intArr.length ; i++) {
            sum += intArr[i];
        }
        return sum;
    }

    public double sumDoublesOfArray (Double[] doubleArr){
        double sum = 0.0;
        for (Double doub:doubleArr){
            sum +=doub;
        }
        return sum;
    }


    //Finding Average
    public int averageOfArray(int[] intArr){
        int sum = sumValuesOfArray(intArr);
        return sum/intArr.length;
    }

    public double doubleAverageOfArray(Double[] doubArr){
        double sum = sumDoublesOfArray(doubArr);
        return sum/doubArr.length;
        }

    //ContainsValue

    public boolean containsValue(int[] intArr, int value){
        for (int i = 0; i < intArr.length; i++) {
            if(intArr[i] == value){
                return true;
            }
        }
        return false;
    }

    //Reverse int[]

    public int[] reverseArray(int[] intArr){
        for (int i = intArr.length; i >=0; i--) {
            int temp = intArr[i];
            intArr[i] = intArr[intArr.length -1 - i];
            intArr[intArr.length -1 -i] = temp;
        }
        return intArr;
    }

    //OddEven

    public OddEven oddEven(int[] intArr){
        List<Integer> odds = new ArrayList<Integer>();
        List<Integer> evens = new ArrayList<Integer>();
        for (int i:intArr){
            if(i%2 == 0){
                evens.add(i);
            }else{
                odds.add(i);
        }}
        Integer[] oddArr = odds.toArray(new Integer[odds.size()]);
        Integer[] evensArr = evens.toArray(new Integer[evens.size()]);

       return new OddEven(oddArr,evensArr);
    }

    //IndexOf []

    public int findIndexOf(int[] intArr, int value) {
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    //Copy Array

    public Integer[] copyArrayByIterator(Integer[] intArr){
            Iterator <Integer> integerIterator = Arrays.asList(intArr).iterator();
            Integer[] intArrayCopy = new Integer[intArr.length];
            int counter = 0;

            while (integerIterator.hasNext()){
                intArrayCopy[counter] = integerIterator.next();
                counter++;
            }
            return intArrayCopy;
        }

    public int[] copyArrayByLoop(int[] intArr) {
        int[] intArrCopy = new int[intArr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArrCopy[i] = intArr[i];
        }
        return intArrCopy;
    }

    //Remove Element []

    public int[] removeElementFromArray(int[] intArr, int value) {
        int[] newArr = new int[intArr.length - 1];
        int counter = 0;
        for (int i : intArr) {
            if (i != value) {
                newArr[counter] = i;
                counter++;
            }
        }
        return newArr;
    }

    //Insert []

    public int[] insertIntoArrayAt(int[] intArr, int value, int index) {
        int[] newArr = new int[intArr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = intArr[i];
            } else if (i == index) {
                newArr[i] = value;
            } else {
                newArr[i] = intArr[i - 1];
            }
        }
        return newArr;
    }

    //MinMax

    public MaxMin findMaxMinOfArray(int[] intArr) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        for(int i : intArr){
            if(i > max){
                max = i;
            }else {
                min = i;
            }
        }
        return new MaxMin(max,min);
    }

    public Integer[] removeDupesFromArray(Integer[] intArr) {
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (Integer i:intArr) {
            if(! integerArrayList.contains(i)){
                integerArrayList.add(i);
            }
        }
        return integerArrayList.toArray(new Integer[0]);
    }

    public double find2ndLargestValueFromArray(Double[] doubArr) {
        Arrays.sort(doubArr);
        return doubArr[doubArr.length -2];
    }

    ArrayList<Integer> makeMeAnArrayListFromArray(Integer[] intArr){
        return new ArrayList<Integer>(Arrays.asList(intArr));
    }

    Integer[] makeMeAnArrayFromArrayList(ArrayList <Integer> integerArrayList){
        return integerArrayList.toArray(new Integer[0]);
    }
    public boolean check2ArraysForEqual(int[] intArr1, int[] intArr2) {
        return Arrays.equals(intArr1,intArr2);
    }

//    public int averageArrayWithoutMaxMin(int[] intArr) {
//        MaxMin maxMin = findMaxMinOfArray(intArr);
//
//        int[] intArrUnmaxed = removeElementFromArray(intArr,maxMin.getMax());
//        int[] intArrayUnmaxmined = removeElementFromArray(intArrUnmaxed, maxMin.getMin());
//
//        System.out.println(sumValuesOfArray(intArrayUnmaxmined));
//    }

    public boolean arrayHas65And77(int[] intArr) {
        return containsValue(intArr,65) && containsValue(intArr,77);
    }

    public boolean theTotalOfTensIs30(int[] intArr) {
        int sum = 0;
        for (int i:intArr){
            if(i == 10){
                sum += i;
            }
        }
        return sum ==30;
    }

    public int[] findSmallestAndSecondSmallest(int[] intArr) {
        Arrays.sort(intArr);
        return new int[]{intArr[0],intArr[1]};
    }

    public int[] makeMeAReverseCopyPlease(int[] intArr) {
        return Arrays.copyOf(reverseArray(intArr),intArr.length);
    }

    public int[] removeLastItemAndCopy(int[] intArr) {
        return Arrays.copyOf(intArr,intArr.length -1);
    }

    public int[] removeFirstItemAndCopy(int[] intArr) {
        return Arrays.copyOfRange(intArr,1,intArr.length);
    }

    public int[] insertAtStartAndCopy(int[] intArr, int value) {
        return insertIntoArrayAt(intArr,value, 0);
    }

    public int[] insertAtEndAndCopy(int[] intArr, int value) {
        return insertIntoArrayAt(intArr,value,intArr.length);
    }

    public int[] sortArrayIntoEvensThenOdds(int[] intArr) {
        int[] sortedArr = new int[intArr.length];
        int counter =0;
        for (int i:intArr){
            if (i%2==0) {
                sortedArr[counter] = i;
                counter++;
        }}
        for (int i:intArr) {
            if (i % 2 !=0) {
                sortedArr[counter] = i;
                counter++;
            }}
        return sortedArr;
    }
}
