package javaexample35classinanotherpackage;



import MyMathPackage.*; // import all the classes in the package MyMathPackage
import MyMathPackage.MyMathHelper; // import only the class MyMathHelper 
                                   //in the package MyMathPackage

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExample35ClassInAnotherPackage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first integer: ");
        int a = GetInteger(input);
        System.out.print("Enter your second integer: ");
        int b = GetInteger(input);
        System.out.println("Max is: " + MyMathHelper.Max(a, b));
        System.out.println("Min is: " + MyMathHelper.Min(a, b));
        System.out.println();

        System.out.print("Enter your first double: ");
        double x = GetDouble(input);
        System.out.print("Enter your second double: ");
        double y = GetDouble(input);
        // here class MyMathHelper name is used by another way (packageName.className.methodName)
        System.out.println("Max is: " + MyMathPackage.MyMathHelper.Max(x, y));
        System.out.println("Min is: " + MyMathPackage.MyMathHelper.Min(x, y));
        System.out.println("First circle area: " + MyMathPackage.MyMathHelper.CircleArea(x));
        System.out.println("First circle circumference: " + MyMathPackage.MyMathHelper.CircleCircumference(y));
        System.out.println("E is: " + MyMathPackage.MyMathHelper.E);
        System.out.println("PI is: " + MyMathPackage.MyMathHelper.PI);

    }// end main()

    private static int GetInteger(Scanner in) {
        int res = 0;
        try {
            res = in.nextInt();
            if (res <= 0) {
                throw new InputMismatchException();
            }
            in.nextLine();
            return res;
        } catch (Exception e) {
            in.nextLine();
            System.out.println(e.toString());
            return GetInteger(in);
        }
    }

    private static double GetDouble(Scanner in) {
        double res = 0;
        try {
            res = in.nextDouble();
            if (res <= 0) {
                throw new InputMismatchException();
            }
            in.nextLine();
            return res;
        } catch (Exception e) {
            in.nextLine();
            System.out.println(e.toString());
            return GetDouble(in);
        }
    }

}
