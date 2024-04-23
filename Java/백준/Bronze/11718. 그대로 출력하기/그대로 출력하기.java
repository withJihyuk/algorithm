import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] comment = new String[101];
        int count = 0;
        while(sc.hasNext()) {
            if(count > 100) {
                break;
            }
            comment[count] = sc.nextLine();
            if (comment[count].startsWith(" ") || comment[count].endsWith(" ")) {
                break;
            }
            System.out.println(comment[count]);
            count++;
        }
    }
}