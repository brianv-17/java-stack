import java.util.Arrays;
public class BasicJavaTest {
    public static void main(String[] args){
        BasicsJava arr = new BasicsJava();
        // for(Integer s : arr.printAllNumbers()){
        //     System.out.print(s);
        // }
        int[] printAllNumbers = arr.printAllNumbers();
        System.out.println(Arrays.toString(printAllNumbers));
        // odds
        arr.oddNumbers();
        // sum
        arr.sumNumbers();
        // iterate
        int[] iterate = {-1,-4,-5,-6,-7,-8};
        int[] aver = {4,6,4,-6};
        arr.iterateArr(iterate);

        arr.arrMax(iterate);
        arr.arrAverage(aver);

        // for(Integer s : arr.arrOddNums()){
        //         System.out.println(s);
        // }
        int[] oddNums = arr.arrOddNums();
        System.out.println(Arrays.toString(oddNums));
        // for(Integer s : arr.squareValues(aver)){
        //         System.out.println(Arrays.toString(s));
        // }
        int[] newArr = arr.squareValues(aver);
        System.out.println(Arrays.toString(newArr));
        // for(Integer s : arr.negativeNum(aver)){
        //     System.out.print(s);
        // }
        int[] negArr = {-2,4,-5,7-9,23};
        int[] negativeNums = arr.negativeNum(negArr);
        System.out.println(Arrays.toString(negativeNums));
        // for(Integer s : arr.minMaxAvg(aver)){
        //     System.out.print(s);
        // }
        int[] minMaxAvgArr = {1,3,4,5,6,7};
        int[] minMaxAvg = arr.minMaxAvg(minMaxAvgArr);
        System.out.println(Arrays.toString(minMaxAvg));
        // for(Integer s : arr.shiftValues(aver)){
        //     System.out.print(s);
        // }
        int[] shiftValues = arr.shiftValues(aver);
        System.out.print(Arrays.toString(shiftValues));
        arr.greaterThan(aver,5);
    }

}