package Looping.ForLoop;

public class FizzBuzzCiunter {
    public static void main(String[] args) {
        int n =10;
        if(n < 1){
            System.out.println("Invalid number");
        }
        else{
            int Fizz =0;
            int Buzz =0;
            int FizzBuzz=0;
            for (int i=1; i<=n;i++){
                if (i%3==0 && i%5==0){
                    FizzBuzz++;
                }
                else if(i%5==0){
                    Buzz++;
                }
                else if(i%3==0){
                    Fizz++;
                }
               
            }
             System.out.println("Fizz ="+Fizz);
                System.out.println("Buzz ="+Buzz);
                System.out.println("FizzBuzz ="+FizzBuzz);

        }
    }
}
