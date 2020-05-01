
        import java.util.Scanner;

public class J11_Static
{
    //  STATIC VARIABLE
//  simdi benim anladigim bu static cok delikanli bi keyword her yere seklini koyuyor yani sen bunu bi kere
//  class in icinde olusturdugun zaman herhangi baska bir yerde rahatlikla cagirip kullanabiliyosun
//  ote yandan instance variable i sadece instance methodlarda cagirabiliyosun static lilerde olmuyo ornek
    static int a1 = 1;
    int        a2 = 2;
    static int b1;
    int b2;

    //  simdi bunun cok kullanisli bir yontemi var mesela scanner oject create edecen burada bi tane sonra
//  sular seller istedigin kadar kullan onu ammaa
//  velev ki static le create ettin ordaki a degeri surekli update olar dur bi deneyelim
    static Scanner input = new Scanner(System.in);
    //Scanner scan = new Scanner.(System.in); // olmadi hata verdi
    public static void main(String[] args)
    {
        a1=5;   // main methodun icinde static variable kullandik
        //a2=3; // main method da bir static method oldugu icin instance variable i buraya cagiramadik.

        // diger bir mevzu eger bir tane daha object create edip ondan daha once bir object i kullanarak
        // deger atadigimiz bir instant variable i dondermesini istersek o bize daha once atanmis degeri verir
        // diger bir deyisle her bir objenin instance variale i alis sekli sanki yeni den goruyomus gibi
        // Allah allah boyle bir deger benim ilk defa karsima cikiyo diyo object cunku instance ote yandan
        // static her yerde kendini muhafaza ve mudafa ediyo.
        // yani ozetle instance variable iktidar yalakasi adamlar gibi o object e oyle buna boyle davranabiliyo
        // amma static variable lar adam gibi adam neyse o sekil ve tavir tutar
        J11_Static obj2 = new J11_Static();
        obj2.b1=111;
        obj2.b2=123;
        System.out.println("obj2 nin static variable i " + obj2.b1);
        System.out.println("obj2 nin instance variable i " + obj2.b2);
        J11_Static obj3 = new J11_Static();
        System.out.println("obj3 un static variable i bu 2 nin kiyle ayni olmali "+obj3.b1);
        System.out.println("obj3 un instance variable i bu 2 nin kiyle ayni olamamali default olmali "+obj3.b2);


        // diger bir mevzuu static method lari class name iyle cagirabiliyoruz mesela asagidaki m2 methodu static
        // onu main methodun altinda cagirmak icun
        J11_Static.m2(3);
        System.out.println(J11_Static.m2(3));
        // ve fakat eger ki biz bir instance method cagirmak istese iduk o vakit object create etmek icab ederdi
        // mesela
        // J11_Static.m1(2); hata verir cunku bu method static degil oyle ha deyince gelmez object lazim
        // onuda soyle bi create edelim
        J11_Static obj4 = new J11_Static();
        obj4.m1(2); // aha bak simdi hata vermedi niye cunku object constructur a dayaniyo oda methodu cekiyo
        // yazdirmak icun
        System.out.println(obj4.m1(2)); // ile de yazdirilabilir.
    }
    public int m1(int a3)
    {
        int c = input.nextInt(); // simdi bu static mi oluyo yoksa instance mi oluyo bilemedim
        // ama galiba bu instance oluyo cunku method instance bilemedim simdi sormak lazim
        return a1+a2+a3; // instance method oldugu icun instance variable i kullanabildik staticler zaten her
    }                    // yerde kullanilabiliyor
    public static int m2(int a4)
    {
        int a = input.nextInt();  // bu sekilde scanner object i class icinde static create edersek
        // daha her bi method da ayri ayri create etmeye gerenk yok
        // bide soyle cagrilabilir
        int b = J11_Static.input.nextInt();  // ayni sey beya
        //return a1+a2+a3+a4; // static method oldugu icin sadece a1 i kullanabildik
        return a1+a4;         // a4 zaten methodun icinde tanimli

    }
    public static void m3(int a5)
    {
        //System.out.println(a1+a2+a3+a4);  // static bir methodun icinde sadece static variable i cagirabildik
    }

    //  INSTANCE VARIABLE
//  peki instance variale i nasil methodlarin icinde kullanabiliriz oda soyle oluyo.
    int a6 = 6;  // simdi mesela bu bizim instance variable imiz olsun bunu methodlarin icinde kullanicaz
//  zaten bunu instance method larin icinde kullanmada bi sikinti olmuyo o yuzden bunu biz static bir method
//  yazip onun icinde kullanmaya calisacaz

    public static int m4()
    {
        J11_Static obj1 = new J11_Static();
        obj1.a1 = 11; // bu meselemiz disi sadece ornek kabilinden burada a1 zaten static zaten alayina gider
        obj1.a2 = 12; // imdi burada a2 ye bir deger atayabilmemizin sebebi su
        // a2 objesini create ederken onu ayni siniftan tureyen bir contructor la olusturduk o sebepten
        // mutevellit biz a2 ye erisip kullanabildik yani mevauu baz alinan constructor.


        return obj1.a2;
    }

}