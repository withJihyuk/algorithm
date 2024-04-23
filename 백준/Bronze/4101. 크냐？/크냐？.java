    import java.util.Scanner;

    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int comment1 = 0;
            int comment2 = 0;

            while(sc.hasNextInt()) {
                comment1 = sc.nextInt();
                comment2 = sc.nextInt();

                if(comment1 == 0 && comment2 == 0) {
                    break;
                }

                if (comment1 > comment2) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }

        }
    }