public class AbstractMethodsAndClasses
{

//  ABSTRACTION
//  Abstraction is hiding the implementation details, concentrating on essentials  without worrying about details
//  Abstract method is a method without body. A method meant to be override. not static private or final
//  Only instance method can be abstract cause they need to be overridden into inherited classes.
//  There are two ways to achieve abstraction --abstract class-- or --interface--
//  In super class you only need to write method names. in sub class you will specify the method body.
//  if the subclass is an abstract class that time you do not have to override methods.
//  Regular class can not have absract methods. But abstract class can have regular method.
//  You can not create an object from an abstract class.

//  yani aslinda bir template class ve icinde de template methodlar var. diger classlari buradan inherit ediyosun
//  methodlarin body lerini abstract classtaki abstrack method larin altinda degil
//  extend ettigin class larda inherited olarak aldigin methodlarin altina yaziyonsun
//  Zaten abstract class tan extended olan bi class create eder etmez override etmen gerek uyarisini veriyor.
//  abstract methodlari her seferinde override etmek zorundasin cuku onlar birer taslak digerlerine implement
//  edilmesi gerekiyor. Bu sebepten zaar private static veya final olamiyolar.
//  Abstrace class in icine normal method yazabilirsin sonucta inherit ettigin classlar bunu kullanabilir. Ama
//  bunun Abstraction la bi alakasi yok. herhangi bir class tan method devsirmeyle ayni sey.

//  Abstract class meant to be inherited.
//  Abstract method meant to be overridden.
//  All abstract methods have to be overridden in extended class.
//  Abstract method`s access modifier should be same with or more visible then extended class.
//  The only method in java without body is abstract methods.
//  if you dod not want a class extended by anohter class. just make it extended.

    abstract class Shape    //  abstract methodun olacagi class abstract class olmak zorunda.
    {
        abstract void Area();
        abstract void Around();
    }

    class Circle extends Shape  //  sub class which extends abstract class must override abstract methods in it
    {
        @Override
        void Area() {
            System.out.println("Area of Circle");
        }
        @Override
        void Around() {
            System.out.println("Around of Circle");
        }
    }
    //  nested abstrac class larda olusturulabilir soyleki

    abstract class Triangle extends Shape  //  abstract class diger bir abstracti extend ediyorsa methodlari
                                           //  override etmesi gerekmez
    {
        abstract void Area();
    }
    class DikUcgen extends Triangle  //  bu class once Triangle daki methodlari sonra onun extend ettigi
                                     //  shape class inin method larini alip override etmek zorunda.
    {

        @Override
        void Around() {

        }

        @Override
        void Area() {

        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//                          ABSTRACT CLASSES                //                  NORMAL CLASSES                        //
//  -  CAN HAVE                                             //  -  CAN NOT HAVE ABSTRACT METHOD
//  -  constructor, instance method static method           //
//  -  instalnce block static block, instance variable      //
//  -  static variable                                      //
//  -  AND ABSTRACT METHOD                                  //
//
//  -  CAN NOT CREATE AN OBJECT
//  -  CAN NOT BE PRIVATE
//  -  CAN NOT BE FINAL
//  -  CAN NOT BE STATIC
//
//
//
//
//
//
//




}

