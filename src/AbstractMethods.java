import com.sun.corba.se.impl.encoding.CDROutputObject;

public class AbstractMethods
{
    //  ABSTRACTION
//  Abstraction is hiding the implementation details, concentrating on essentials things without worrying about the
//  details

//  yani aslinda bir template olacaksa bi class ona abstract class deniyo baska classlari buradan inherit ediyosun
//  methodlari her seferinde override etsen bile yinede buraaya once o methodlari yaziyosun
//  yapilisida soyle bi public class alusturuyosun bu super class oluyo daha sonra bu classin icine methodlari yaziyon
//  amma class in da abstract olmasi lazim ve yazdigimiz methodun bir body ye sahip olmamasi lazim.
//  soyleki
}
abstract class Shape //  final classes can not be an abstract class
{   //  in order to achieve abstract class you can either use abstract or interface wyas
    public abstract void Area(); //  methodlarda can not be final static or private cunku override edecez.
}
class Circle extends Shape
{
    public double radius;
    private final static double PI = 3.14;
    Circle(double radius)
    {
        this.radius=radius;
    }  //  abstract classes can not be final static or private.
    @Override //  any abstract method must be overritten in sub class
    public void Area()
    {
        double area = radius * radius * PI;
        System.out.println("Area is: "+area);

    }
}
class ShapeObjects
{
    public static void main(String[] args)
    {
        Circle obj1 = new Circle(2.3);
        obj1.Area();
    }
}
abstract class Car
{    public abstract void start();  }
class Toyota extends Car
{       public void start() {System.out.println("insert the key");}         }
class BMW extends Car
{       public void start() {System.out.println("Press the Button");}         }
class Caller
{public static void main(String[] args)
{Car obj1 = new Toyota();obj1.start();Car obj2 = new BMW();obj2.start();BMW obj3 = new BMW();obj3.start();}}