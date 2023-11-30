import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input X: ");
        int inputX = scan.nextInt();

        System.out.print("Input Y: ");
        int inputY = scan.nextInt();
        
        int x;
        int y;

        for (x = 1 ; x <= inputX ; x++) {
            System.out.println();
            for (y = 1 ; y <= inputY ; y++) {
                System.out.println(x + " x " + y + " = " + (x * y));
            }
        }
    }
}