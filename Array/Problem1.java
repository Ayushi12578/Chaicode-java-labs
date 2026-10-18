package Array;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name count:");
        int Count=sc.nextInt();
        String Name[]= new String[Count];// create array
        for(int i=0;i<Count;i++){
            Name[i]=sc.next();
            // if we using nextline only one input take if we use next the it 
            //send me to next line
        }
        for(int i=0;i<Name.length;i++){
            // System.out.println(Name[i]);
            System.out.println("Name"+(i+1)+" is :"+Name[i]);
        }
        sc.close();
    }
}
