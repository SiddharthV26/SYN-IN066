import java.util.*;
public class CheckPrimeOrNot{
    public static boolean isPrime(int n){
        if(n==0 || n==1){
            return false;
        }
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if(isPrime(n)){
            System.out.println("The given no "+n+" is Prime");
        }
        else{
            System.out.println("The given no "+n+" is Not Prime");
        }
    }
}