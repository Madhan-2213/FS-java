import java.util.Scanner;
class Main{
    public static void main(String[] args){
    Scanner se  = new Scanner(System.in);
     int n =se.nextInt();
     if(n>=72){
         n=  n%8;
        switch(n){
            case 1:
                System.out.println("lower");
                break;
            case 2:
                System.out.println("middle");
                break;
            case 3:
                System.out.println("upper");
                break;
            case 4:
                System.out.println("lower");
                break;
            case 5:
                System.out.println("upper");
                break;
            case 6:
                System.out.println("middle");
                break;
            default:
                System.out.println("Seats are not available");
                
            }
        }
     }
}
