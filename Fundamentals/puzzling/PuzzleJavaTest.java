public class PuzzleJavaTest{
    public static void main(String[] args){
        PuzzleJava pJ = new PuzzleJava();
        int[] numbers = {3,5,1,2,7,9,8,13,25,32};
        String[] names = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        String[] abc = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        pJ.sumGreater(numbers);
        pJ.shuffleString(names);
        pJ.abcShuffle(abc);
        pJ.randomNum();
        pJ.randomString(abc);
    }
}