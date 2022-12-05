import Calculator.*;
import java.util.Scanner;

public class exp9 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("1.Addition" + "\n" + "2.Subtraction" + "\n" + "3.Multiplication" + "\n" + "4.Division"
                    + "\n" + "5.Exit");
            System.out.println("Enter the choice");
            try (Scanner in = new Scanner(System.in)) {
                int n = in.nextInt();
                if (n == 5) {
                    System.exit(0);
                }
                System.out.println("enter the number");
                int a = in.nextInt();
                int b = in.nextInt();
                switch (n) {
                    case 1:
                        addition ad = new addition();
                        int k = ad.add(a, b);
                        System.out.println(a + "+" + b + "=" + k);
                        break;
                    case 2:
                        subtraction sb = new subtraction();
                        int l = sb.sub(a, b);
                        System.out.println(a + "-" + b + "=" + l);
                        break;
                    case 3:
                        multiplication mu = new multiplication();
                        int m = mu.mul(a, b);
                        System.out.println(a + "*" + b + "=" + m);
                        break;
                    case 4:
                        division dv = new division();
                        int h = dv.div(a, b);
                        System.out.println(a + "/" + b + "=" + h);
                        break;
                }
            }
        }
    }
}
