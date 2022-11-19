import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int enteredOne = scanner.nextInt();

        for (int i = 0; i<enteredOne;i++){

            try {
                long itTakesAll = scanner.nextLong();
                System.out.println(itTakesAll + " can be fitted in:");
                if(itTakesAll>=Byte.MIN_VALUE && itTakesAll <= Byte.MAX_VALUE)
                {
                    System.out.println("* byte");
                }
                if (itTakesAll>=Short.MIN_VALUE && itTakesAll <= Short.MAX_VALUE)
                {
                    System.out.println("* short");
                }
                if (itTakesAll>=Integer.MIN_VALUE && itTakesAll <= Integer.MAX_VALUE)
                {
                    System.out.println("* int");
                }
                if (itTakesAll>=Long.MIN_VALUE && itTakesAll <= Long.MAX_VALUE)
                {
                    System.out.println("* long");
                }
            }catch (Exception e){
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }

        }

    }
}
