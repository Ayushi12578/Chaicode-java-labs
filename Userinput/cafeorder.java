package Userinput;

import java.util.Scanner;

public class cafeorder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double total=0.0;
        while(true){
            System.out.println("ENter price or DONE");
            String line = sc.nextLine();
            if(line.equals("DONE")){
                break;
            }
           if(line.isEmpty()){
            continue;
           }
           double rate = Double.parseDouble(line);
           if(rate<0){
            continue;
           }
           total=total+rate;
           
          
        }
        System.out.println("Total ="+total);
        sc.close();
    }
}
