
package MyMathPackage;

public class MyMathHelper {
    
    public static final double PI=Math.PI;
    public static final double E=Math.E;
    
    public static double CircleArea(double radius)
    {
        double area=PI*radius*radius;
        return area;
    }
    
    public static double CircleCircumference(double radius)
    {
        double area=2*PI*radius;
        return area;
    }
    
    public static int Max(int a, int b)
    {
        return (a>b)?a:b;
    }
    
    public static double Max(double a, double b)
    {
        return (a>b)?a:b;
    }
    
    public static int Min(int a, int b)
    {
        return (a<b)?a:b;
    }
    
    public static double Min(double a, double b)
    {
        return (a<b)?a:b;
    }
    
}
