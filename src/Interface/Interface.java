package Interface;

public interface Interface
{
//  INTERFACES
//  interfaces are pure abstractions
//  blueprint of class. specifies the behaviors a class should implement
//  used for achieving abstraction
//  can be super type to a class
//  class to inherit from interface is by using implement keyword
//  there is only one access modifier allowed in interface which is public
//  why do we need it because one class can inherit from one class only but implement multiple interfaces.
//  only static and final variables allowed in interface. these are default even if you dont specify it.
//  that is why you can not reassign a variable because it is final. then static block is not allowed either
//  interface is not a class that is why you can not give an interface and you cannot create object
//  or instance variable or instance method or instance block.
//  abstract method and static methods are allowed. And default method is allowed default void methodName();{}
//  default method only can be created in interface and lambda expression.
//

//  INTERFACES
//  are pure abstraction. Means
//  all methods only can be public abstract and static
//  all variables only can be public static and final
//  why we need interface because we can extend only one class with abstraction but implement multiple interfaces
//  all methdos in the interface should be overridden in the implemented class. unless it is an abstract class.
//  CAN NOT HAVE constructor, instance variable, instance method, instance block, static block
//  CAN HAVE static and final variable by default. abstract methods, static methods, default methods
//  interfaces can extend each others
//  interface can not implement or extend classes

    public static final String a1="a";  //  eger lazimsa variable lar sadece public static final olabiliyor.
    String a2="a";  //  buda final static final by default you can call it throug class name in main method
                    //  or any other class. you can not create an instance variable

    public abstract void M1();  //  simdi bu abstract method buna public abstract yazmaya bile gerek yok
    public void M2();  // ayni sey
    void M3();  //  ayni sey

    static void m4(){}  //  simdi bu farkli bu static method onun icin govdesi olmasi lazim bide mainde cagirilabilir

    public static void main(String[] args) {
        m4();  // boyle yada baska class ta cagirilacaksa
        Interface.m4();  // seklinde cagirilabilir.
    }




}
