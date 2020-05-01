import java.util.ArrayList;

public class J12_InitializerBlocks
{
    // STATIC INITIALIZER BLOCK
//  bu block main method dan bile once execute edilir. even if there is no main method
//  static initializer block is executed as soon as the class is loaded. it does not matter before or after main
//  simdi mesela constructor create edip onu main method da bir object create edip cagirirsak ne olar
//  once static sonra main methodun icinde object create edildigi icin constructor en son main methodun statementi
//  eger 2 tane object create etsek constructoru iki kere run edecek
//  static only executes one time, and it does not depends on creation of object
//  you can have more than one static method but first one executes first

    //  simdi burda garip bi mevzuu var bu class variable larla static initializer block orasinda bir iliski var
//  evet ilk static block execute ediliyor amma velev ki bazi variable lar create edilmisse class in icine
//  o zaman bunlar cooperate ediyollar gibi yani varible lar orda var olan seyler demem o ki
//  class in icinde defune edip static block un icinde deger atanabiliyor mesela array create etcen
    public static int[] arr1;  // diyerek baslatabilirsin deger atamana bu kertede gerenk yok
    // daha sonra bunu bir static block un icinde baslatabiliriz mesela
    static
    {
        arr1 = new int[3];     // gibi
    }

    //  arraylist te baslatabiliriz amma onun size sikintisi olmadiginda direk baslatabiliriz
    public static ArrayList<Integer> list1 = new ArrayList<>();
    static
    {
        list1.add(111);
        list1.add(123);
    }
    public J12_InitializerBlocks()
    {
        System.out.println("this is constructor");
    }

    //  // STATIC BLOCK
//  static block un onceligi var bu adam dir adam gibi adamdir o yuzden creation of object e bagimli degildir
//  renngini seklini en basta koyar static
    static
    {
        System.out.println("static block");
    }

    static
    {
        System.out.println("Static Block 1");
        list1.add(223);
    }
    static
    {
        System.out.println("Static Block 2");
    }

//  //  INSTANCE INITIALIZER BLOCK
//  used for initializing instance variables, belongs to object, sadece parantezin icine yazacaz
//  instance block depends on creation of object
//  when the object is created instance block runs first then constructor
//  you can have multiple constructor in one class

    {
        System.out.println("ilk instance block");
    }

    {
        System.out.println("instance block");
    }

    {
        System.out.println("instance block3");
    }



    public static void main(String[] args)
    {
        J12_InitializerBlocks obj1 = new J12_InitializerBlocks();
        J12_InitializerBlocks obj2 = new J12_InitializerBlocks();
        System.out.println("main method");



    }
}