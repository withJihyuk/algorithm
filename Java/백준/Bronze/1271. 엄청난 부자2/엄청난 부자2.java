import java.math.BigInteger;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger comment1;
        BigInteger comment2;



            comment1 = sc.nextBigInteger();
            comment2 = sc.nextBigInteger();


                System.out.println(comment1.divide(comment2));
                System.out.println(comment1.remainder(comment2));

        
    }
}