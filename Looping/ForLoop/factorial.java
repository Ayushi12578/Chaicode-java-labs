package Looping.ForLoop;

public class factorial {
    public static void main(String[] args) {
        int n =10;
        if(n < 0){
            System.out.println("Number is negative ");
        }
        else{
             int Fact=1;
            for (int i=1;i<=n;i++){
                Fact=Fact * i;
            }
            System.out.println("Factorial Of the Given Number is:"+ Fact);
        }
        
    }
}
