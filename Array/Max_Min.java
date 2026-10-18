package Array;

public class Max_Min {
    public static void main(String[] args) {
        int Arra[]={12,36,5,0,2};
    int max=Integer.MIN_VALUE;//.MIN ->means Start from Samallest
    int min=Integer.MAX_VALUE;//.Max-> Means STart from largest
    for(int i=0;i<Arra.length;i++){
        if(Arra[i]<min){
            min=Arra[i];
        }
        if(Arra[i]>max){
            max=Arra[i];
        }
    }
    System.out.println(max);
    System.out.println(min);
    }
}
