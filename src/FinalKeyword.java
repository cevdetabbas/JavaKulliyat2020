public class FinalKeyword
{
    //  FINAL KEYWORD
//  constant and can not be changed.
//  Burdaki mesele aslinda eger bi variable i hic degismeyecek sekilde assign etmek istiyorsak final diye declare
//  ediyoruz.

//  final instance variables need to be initialized immediately.
    //final int a; // eger ki hemen initialize etmezsek sikinti olur
    final int a = 0;  //  bu sekilde hemen initialize etmek lazim.
//  ve fakat eger local variable ise orda sikinti yok once declare edip sonra baslatabiliriz.
    final static int c = 12;  //  static e de uygulanabiliyor
//  you can not generate setter for final static or instance variable but you can always use getter method

//  final keyword can be used with private access modifier for example
    final private String username = "root";
    final private String password = "toor";
//  but you can only use getter for these variables.



    public static void main(String[] args)
    {
        final int b ;
        b = 1;
        //b = 2; //  fakat her sekilde reassign edemiyoruz.
        int d = 3;

    }

    //  FINAL METHODS
//  implementation of the method can never be changes can not be override it. but you can overload it.
//  you can overload any method anyway.

    public final void method1()
    {
        System.out.println(100);
    }

    public final int method1(int a)
    {
        return 100;
    }

//  bide static method u final la overload edelim

    public final static void method2()
    {
        System.out.println(200);
    }

    public final static int method2(int b)
    {
        return 200;
    }

//  yalniz bir mevzuu var o da constructor i final yapamiyoruz
//  main methodu bile final yapabiliyoruz.
//  only instance method overriden


    //  FINAL CLASS
//  final classes are immutable class, can not be inherited can be a sub class but not super class.

    //  FINAL BLOCK
//  you can not give a final block it can be applicable by variable, method or class.


}
