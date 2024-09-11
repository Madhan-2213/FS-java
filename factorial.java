import java.util.Scanner;
    class calc{
    void fact(int n){
        int fact=1;
        for(int i = 1;i<=n;i++){
            
            fact = fact*i;
        }
        System.out.print(fact);    }
}


public class Main{
    public static void main(String[] args){
    new calc().fact(5);
}}
