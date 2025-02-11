import java.util.*;
public class prime {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Hey Poona Akash Enter the value: ");

    int n=sc.nextInt();
        int count=0;
        if(n==0||n==1){
            System.out.println("Not a prime");
        }//10   2-->9....... it must be div by 1 and itself 1000%2==
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("HEy P.Akash its a prime");
        }
        else{
            System.out.println("HEy P.Akash its a composite");
        }
    }
}
