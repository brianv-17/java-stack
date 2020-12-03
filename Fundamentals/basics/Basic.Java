import java.util.Arrays;
public class BasicsJava{
    public int[] printAllNumbers(){
        int[] nums;
        nums = new int[255];
        for(int i = 0; i < 255; i++){
            nums[i] = i +1;
        }
        return nums;
    }
    // Write a method that prints all the odd numbers from 1 to 255.
    public void oddNumbers(){
        
        for(int i = 1; i <=255; i++){
            if(i%2!=0){
                System.out.println(i) ;
            }
        }
    }
    public void sumNumbers(){
        int sum = 0;
        for(int i = 0; i <= 255; i++){
            sum = sum + i;
            String num = " " + i + "," + sum;
            System.out.println(num);
        }
    }
    public void iterateArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public void arrMax(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print(max);
    }
    public void arrAverage(int[] arr){
        int avg = 0;
        int len = arr.length;
        for(int i = 0; i < arr.length; i++){
                avg  = avg + arr[i];
        }

        System.out.println(avg/len);
    }
    public int[] arrOddNums(){
        int[] nums = new int[128];
        for(int i = 1, j = 0; i <=255; i+=2,j++){
            nums[j] = i;

        }
        return nums;    
    }
    public int[] squareValues(int[] arr){
        for(int i = 0; i <arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
        return arr;
    }
    public int[] negativeNum(int[] arr){
        for(int i = 0; i <arr.length; i++){
            if(arr[i]<0){
                arr[i] = 0;
            }
        }
        return arr;
    }
    public int[] minMaxAvg(int[] arr){
        int[] arr2 = new int[3];
        int max = arr[0];
        int min = arr[0];
        int avg = 0;
        int len = arr.length;
        for(int i = 0; i <arr.length; i++){
            avg = arr[i] + avg;
            if (arr[i]> max ){
                max = arr[i];
            }
            if(arr[i]< min){
                min=arr[i];
            }

        }
        arr2[0] = max;
        arr2[1] = min;
        arr2[2] = avg/len;
        return arr2;
    }
    public int[] shiftValues(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        return arr;
    }
    public void greaterThan(int[] arr, int y){
        int counter = 0;
        for(int i = 0; i < arr.length; i++){
            if(y < arr[i]){
                counter++;
            }
        }
        System.out.print(counter);
    }
}