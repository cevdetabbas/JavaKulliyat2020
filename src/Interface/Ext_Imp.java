package Interface;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

interface I1    {    void method1();}

interface I2 extends I1   {    void method2();}

abstract class AC implements I2   {abstract void method3();}


public class Ext_Imp extends AC
{
    public void method1() {}
    public void method2() {}
    void method3() {}
}

abstract class Ext_Imp2 extends AC    //  burda override a gerek yok cunku abstract class. ama yapabilirsinde
{       public void metho2(){}       }

class testRun extends Ext_Imp2  //  simdi bu normal class oldugu icin ve abstract class i extend ettiginden
{public void method1() {} public void method2(){}void method3() {}} //  butun methodlari override etmek zorunda

//  when you use extends and implements together extends comes first.
//  interface can not implement another interface but extends
//  abstract class can implement interface sonucta o da bi class.
//  you can not create object from an abstract class. but you can create constructor.
//  for interface no constructor no object.
interface P
{

}
interface Q
{

}
abstract class R
{

}
class EXTandIMP extends R implements P,Q
{

}

//  Default method is designed for only interfaces
//  execution of the default method depends on creating a sub class and implementing in it mesela
interface A
{
    default void MM1(){System.out.println("default method body");}
}
class CC implements A    //  ancak bir class ta interface i implement ettikten sonra obje olusturup ordan
{                        //  methodu cagirabiliriz.
    public static void main(String[] args) {
        CC obj = new CC();
        obj.MM1();
    }
}