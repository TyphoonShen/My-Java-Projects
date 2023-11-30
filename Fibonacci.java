import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList myList = new ArrayList();

        int n1 = 0, n2 = 1, n3, i;

        System.out.println("Repeat?");
        i = scan.nextInt();

        System.out.print(n1 + " " + n2);
        myList.add(n1);
        myList.add(n2);
        while (i > 0) {
            
            n3 = n1 + n2;

            myList.add(n3);
            
            System.out.print(" " + n3);

            n1 = n2;
            n2 = n3;

            i--;

        }
        System.out.println("\nAs a List;");
        System.out.println(myList);

    }
}