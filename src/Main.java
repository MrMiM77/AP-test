import java.util.Scanner;

public class Main {
    public static void printArgs(String[] args)
    {
        for(int i=0;i<args.length;i++)
            System.out.println(args[i]);

    }
    public static void printMul()
    {
        for(int i=1;i<11;i++) {
            for (int j = 1; j < 11; j++)
                System.out.print(j* i‌ + "\t");

            System.out.println();
        }
    }
    public static boolean checkFactorsOfTwoNumber(int a , int b)
    {
        for(int i=2;i<=a && i<=b ;i++)
            if(a%i == 0 && b%i == 0)
                return true;
        return false;
    }
    public static void main(String[] args) {
        printArgs(args);
        printMul();
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(checkFactorsOfTwoNumber(a , b));
    }
}
