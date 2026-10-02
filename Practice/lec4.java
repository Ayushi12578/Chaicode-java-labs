package Practice;

import java.util.Scanner;

public class lec4 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          //if we use this condition the loop would we infinite
    // for(; ;){
    //     System.out.println("apna college");
    // }



    // print n even num
    // System.out.println("Enter number");
    // int n= sc.nextInt();
    // for(int i = 1; i<n;i++){
    //     if(i%2==0){
    //         System.out.println(i);
    //     }
    // }


//check mark

System.out.print("Enter your choice");
int choice=sc.nextInt();

do{
   if(choice==1){
     System.out.println("Enter student marks:");
    int mark=sc.nextInt();
    
    if(mark>=90){
        System.out.println("this is Good");
    }
    else if (mark>=60) {
        System.out.println("this is also Good");
    }
    else if (mark>=59) {
        System.out.println("this is Good as well");
    }
    else{
        System.out.println("fail");
    }
    
   }
    
}
while(choice!=0);
System.out.println("program stop"); 
sc.close();   
}


}
  

