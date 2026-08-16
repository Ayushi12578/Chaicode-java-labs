package Looping.ForLoop;

public class PrimeChecker {
    public static void main(String[] args) {
       int number=7;
       
         if(number < 2){
            System.out.println("Number is not prime");
       }
       
       else{
        boolean isprime = true;
        for (int i = 2; i < number;i++){
        if(number % i == 0){
            isprime = false;
            break;
        }
    }
     if (isprime){
        System.out.println("Number is Prime");
       }
       else{
        System.out.println("Number is not prime");
       }
    
    }
    }
     
}


