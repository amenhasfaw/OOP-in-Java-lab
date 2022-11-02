import java.util.Scanner;


abstract class Shape
{
    final double PI=3.14; //constant
    String shapeName;
    abstract void area(); //abstract method
    public String toString()    //tostring method to return calling classname
    {
        return this.getClass().getName();
    }
}


class Sphere extends Shape
{
    double rad;
    Sphere(double r)   //constructor to set radius
    {
        rad=r;
    }
    void area()
    {
        System.out.println("Area = "+(4*PI*rad*rad));  //area of sphere formula
    }
}


class Rectangle extends Shape
{
    double len, width;

    Rectangle(double l,double w)
    {
        len=l;
        width=w;
    }
    void area()
    {
        System.out.println("Area = "+(len*width));
    }
}


class Triangle extends Shape
{
    double base, height;

    Triangle(double b,double h)
    {
        base=b;
        height=h;
    }
    void area()
    {
        System.out.println("Area = "+(0.5*base*height));
    }
}


public class exp4 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius of a circle");
        double r=s.nextInt(); //taking radius input
        Sphere sp=new Sphere(r);   //sphere object creation
        System.out.println(sp.toString());     //respective class object calls tostring()
        sp.area();   //calling respective class area method
        System.out.println("Enter the len and wid: ");
        double l=s.nextInt();
        double w=s.nextInt();
        Rectangle rc=new Rectangle(l,w);
        System.out.println(rc.toString());
        rc.area();
        System.out.println("Enter the base and height: ");
        double b=s.nextInt();
        double h=s.nextInt();
        Triangle ta=new Triangle(b,h);
        System.out.println(ta.toString());
        ta.area();
    }
}
