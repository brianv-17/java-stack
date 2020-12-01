public class FizzBuzz {
    public String fizzBuzz(int number) {
        int b = number;
        String a = "";
        if((number%5 ==0)&&(number%3==0)){
            return "FizzBuzz";
        }
        if(number%5 ==0){
            return "Buzz";
        }
        if(number%3==0){
            return "Fizz";
        }
        else 
            return a + b;
    }
}

