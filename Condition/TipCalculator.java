package Condition;

public class TipCalculator {
    public static void main(String[] args) {
        double billAmount=50.22;
        int service=5;
        double TipPercen=10;
        if(service == 1){
            TipPercen = 5;
        }
        else if(service == 2){
            TipPercen = 10;
        }
        else if(service == 3){
           TipPercen = 15;
        }
        else if(service == 4){
            TipPercen = 20;
        }
        else if(service == 5){
            TipPercen = 25;
        }
        else{
            System.out.println("Cx not giving the rating");
        }
        double tipAmount = billAmount * TipPercen /100;
        double TotalAmount=tipAmount + billAmount;

        System.out.println("TipAmount:"+tipAmount + "%");
        System.out.println("TipAmount:"+tipAmount);
        System.out.println("Total:"+TotalAmount);
    }
}
