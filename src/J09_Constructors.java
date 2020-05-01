public class J09_Constructors
{

//  CONSTRUCTORS
//  constructors are very special method using creating of object of the class
//  every class must have a constructor. If you dont give the constructor compiler gives default (no-arg) constructor
//  aslinda sekil yapmaya gerek yok constructor diye sinifin ismini tasiyan metoda diyolar
//  declerationda default constructor (without argument)
//  access-modifier classname(){statements}
//  declerationda constructor (with argument)
//  access-modifier classname(parameter/argument){statements}
//  constructors are used to create object of the class
//  it can not have return type or specifier only class name and parameter
//  constructor name must be same with the class name.
//  only a constructor can call anohter constructor
//////// simdi bu sey demek nihayetinde contructor bir method onu herhangi bir methodun altinda cagiramiyoz anca baska
//////// baska bir constructor olacak ki cagirabilsin onuda this() le cagirabilirsin
//  constructors execution depends on the creation of the object
//  creating an object is classname referenceName = new existingConstructor
//  3 types of method 1void 2return 3constructor
//  constructor does not return any value since they dont have return type
//  if you want more then one constructor you need to overload it.
//  when we create object from a class we must use existing oxnstructor.

    // DECLERATION OF DEFAULT CONSTRUCTOR
    // default cause it does not have argument
    public J09_Constructors()         // decleration i boyle amma cagiriken baska bir methodun icinden cagirmak lazim
    {                               // onuda main methodun icinden object create ederek cagirmak lazim
        System.out.println("This is a Default constructor");
    }

    //  DECLERATION OF CONSTRUCTOR WIHT ARGUMENT
    public J09_Constructors(String a)         // simdi bu yeni bi constructor argumanli hemide
    {                                       // bunu cagirmak icin bi tane daha object create etmek lazim
        System.out.println("This is a constructor with argument from String "+a);
    }

    public J09_Constructors(int a)
    {
        System.out.println("This is a constructor with argument from int "+a);
    }

    //  CALLING CONCTRUCTOR METHOD FROM ANOHTER METHOD
    public static void method1()
    {
        System.out.println("hello haci dayi");
        J09_Constructors obj1 = new J09_Constructors(7);
    }

    //  CONSTRUCTER CALL
//  only a constructor can call another constructor
//  constructors cannot be called by their name, we must use this() keyword to call current class` constructor
//  constructor call has to be the first statement in the constructore
//  one constructor can call only one constructor
//  constructor can not call itself
//  constructor cannot contain itself
////    olay su bir constructor i baska bir constructor in altinda cagiracaksan ilk onu cagiracan gibi ama sonrasinda
////    bir statement yazarsan unreachable oluyo zaten break gibi bisey oluyo sonrasina yazdigin bir seyi basstirmiyo
////    yada baska bir constructor felan yazamiyon haliyle yani hic bi sey yazamiyon
    public J09_Constructors(boolean a)
    {
        //Constructorlar(3); // bu sekilde cagrilmiyor ancak object create ederek yahut this() keyworduyle cagiriliyor
        this(100);        // bunu main method un altinda bir boolean la cagirmak lazim ki bu
        // this(); // diye cagirsaydik default olani cagiracakti
        // kendini cagiramazsin burday yani 100 yerine bi boolan koyamazsin
        // bunun altina zaten baska bi sey yazamazsinda
    }

    public static void main(String[] args)
    {
        J09_Constructors obj1 = new J09_Constructors();
        J09_Constructors obj2 = new J09_Constructors("zalim");
        J09_Constructors obj3 = new J09_Constructors(3);
        method1();
        J09_Constructors obj4 = new J09_Constructors(true);




    }
}