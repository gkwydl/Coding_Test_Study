import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []num=new int[n];
        int sum=0;

        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int v=sc.nextInt();
        for(int i=0;i<num.length;i++){
            if(v==num[i]) {
                sum += 1;
            }
        }
        System.out.print(sum);
    }
}