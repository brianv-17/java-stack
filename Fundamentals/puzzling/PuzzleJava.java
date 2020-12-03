import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
public class PuzzleJava{
    public void sumGreater(int[] arr){
        int sum = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for( int i = 0; i < arr.length; i++){
            sum = sum + i;
            if(arr[i]>10){
                numbers.add(arr[i]);
            }
        }
        System.out.println(sum);
        System.out.println(numbers);
    }
    public void shuffleString(String[] str){
        ArrayList<String> string = new ArrayList<String>();
        for(int i = 0; i < str.length; i++){
            string.add(str[i]);
        }
        Collections.shuffle(string);
        System.out.println(string);
    }
    public void abcShuffle(String[] abc){
        ArrayList<String> newAbc = new ArrayList<String>();
        String[] ab = {"a","e","i","o","u"};
        for(int i = 0; i < abc.length; i++){
            newAbc.add(abc[i]);
        }
        Collections.shuffle(newAbc);
        String firstString = newAbc.get(0);
        String lastString = newAbc.get(25);
        for(int j = 0; j <ab.length;j++){
        if(firstString == ab[j]){
            firstString = "This is a vowel";
        }
        }
        System.out.println(firstString);
        System.out.println(lastString);
    }
    public void randomNum(){
        int[] arr = new int[10];
        Random random = new Random();
        for(int i = 0; i < 10; i++){
        arr[i] = random.nextInt(100 -  55) +55;
        }
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> newRandom = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            newRandom.add(arr[i]);
        }
        Collections.sort(newRandom);
        System.out.println(newRandom);
        
        for(int i = 0; i < arr.length; i++){
            newRandom.add(arr[i]);
        }
        int max = newRandom.get(0);
        int min = newRandom.get(9);
        System.out.println(max);
        System.out.println(min);
    }
    public void randomString(String[] str){
        String newStr = " ";
        String newStr2 = " ";
        Random random = new Random();
        String[] newArr = new String[10];
        for(int i = 0; i < 5; i++){
            int ran = random.nextInt(str.length);
            newStr += str[ran];
        }
        System.out.println(newStr);
        for(int j = 0; j < 10; j++){
            for(int a = 0; a < 5; a++){
                int ran = random.nextInt(str.length);
                newStr2 += str[ran];
            }
            newArr[j]=newStr2;
            newStr2 = "";
        }
        System.out.println(Arrays.toString(newArr));

    }
}