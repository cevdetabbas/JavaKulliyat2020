import java.util.Arrays;

public class J08_Methods
{
//  grouping a series of statement together to perform specific tasks fx sort length trim equals
//  methods can make our codes reusable , you dont need to repeat same set of statements
//  without main method you can not run any java application
//  you can not create any method within a method
//  methods must be created/decleared within the class not within the method
//  we call the methods by their names within the main method otherwise they wont work itself
//  void methods does not return any value
//  you can not create 2 main method in a class
//  you can not create a method in main method
//  fekat bir methodu diger bir methodun altinda cagirabiliriz.  zaten sonucta hepsini main in altinda cagiriyoruz

    // METHOD DECLERATION
// for method decleration you need following things
//     |    public      |   static      |   void        |    main       |   (String[] args)    |    {      }   |
//-----|----------------|---------------|---------------|---------------|----------------------|---------------|
//     |    access      |   specifier   |   return      |    method     |   arguments          |     method    |
//     |    modifier    |               |   type        |    name       |                      |     body      |
//=====|================|===============|===============|===============|======================|===============|
//     |    public      |               |   String      |               |                      |               |
//     |    protected   |               |   int         |               |                      |               |
//     |    default     |               |   boolean     |               |                      |               |
//     |    private     |               |   double      |               |                      |               |
//     |                |               |   any other   |               |                      |               |
//     |                |               |   data type   |               |                      |               |
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////// VOID METHODS WITHOUT PARAMETER
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void myFirstMethod()  // method void yani return suz icinde de uc print statement var
    // ben bunlari main metod ta cagirdigim zaman 3 statement i da print edecek.
    {                                   // cagirma olayi da at la deve degil sadece metodun adini yazmak lazim
        System.out.println("kamil");    // soyle yani myFirstMethod(); deyince 3 statement i yazdiracak.
        System.out.println("mahmut");
        System.out.println(3);
    }

    public static void oneToOneHundred()    // bu diger bir void method ornegi
    {                                       // zaten assagida main metod ta cagirdik kendisini
        for(int i = 0 ; i<=100 ; i++)       // o da kendini yazdiriyor kendini
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// VOID METHODS WITH PARAMETER
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// when we specify parameter or argument we mean when we call the method under main we ask for that data type

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// create a method which finds a number is even or odd
// bu method sadece sayilara yonelik oldugundan argument olarak sadece int degeri lazim
    public static void oddOrEven(int a)     // argument i specify ettigimizde demis oluyoruz ki
    {                                       // method u main method da cagiriken o data type la cagirman lazim
        if(a%2==0)
        {
            System.out.println(a+" is an even number");
        }
        else
        {
            System.out.println(a+" is an odd number");
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// create a method which finds sum of two numbers
    public static void sumOfTwoNumbers(int a, int b)
    {
        System.out.println("sum of two number you entered  ="+(a+b));    // bunu main method da cagirirken parantez icine iki int
    }                                                       // degeri yazmak lazim

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a method that can remove duplicates from the string and prints out the result
    public static void removeduplicates(String str)
    {
        String result = "";
        for(int i = 0 ; i<str.length() ; i++)
        {
            if(!result.contains(str.substring(i,i+1)))
            {
                result+=str.substring(i,i+1);
            }
        }
        System.out.println(result);
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a method that can convert km to mile and km to miles
    public static void kmToMiles(double a)
    {
        System.out.println(a+" km equals " + (a*0.612) + " miles");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a method that calculate grades
// write a calculator with two int one char +-*/ or invalid
// write a method that finds largest number of 3 int s


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// RETURN METHODS
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// bunlar return type olara herhangi bir data-type kullanabilirler yani void degil. primitive or non primitive
// does not have void as return Type
// Must return a value
// the returning value must match with the return-type of the method
// the method body must be closed with return statement. with return it exit the method immediately.
// return methods are either printed or assigned to the other variable.
// main methodun icine return yazilabilir
    public static void method1(String a)
    {
        System.out.println("kamil");        // simdi burda return type void oldugundan sout kullanilabiliyo
    }
    public static String method2(String b)
    {
        return b;                     // burada return type String oldugundan return yaninda string olmali
    }
    public static boolean method4()
    {
        return (3>5);
    }

// COMMON QUESTIONS
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a methdod returns highest number
// write a method accepts string array and returns the longest string value from the array
//


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//                       VOID              VS                   RETURN
// void method does not return any value   | return method must return a value
//




//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// METHOD OVERLOADING
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// it allows us to have more than one method with same name, the methods must have different parameters
// it improves the reusability
// it improves the readability
// easier to remember
// return type does not need to be same
// ayni argument lerle different data type a overload yapilamiyo
// main method overload yapilabilir

    public static int sumOfNums(int a, int b)
    {
        return (a+b);
    }

    public static int sumOfNums(int a, int b, int c)
    {
        return (a+b+c);
    }

    public static double sumOfNums(int a, long b, double c)     // return type do not need to be same
    {
        return (a+b+c);
    }

    public static int m1(int a, int b)
    {
        return a-b;
    }

//    public static int    m1(int a, int b)     // bu nu yazdiktan sonra eger overloadi ayni parametrelerle yapsan
//    public static double m1(int a, int b)     // bunu kabul etmiyo yani argumentler belirleyici aslinda
//    {                                         // argumentleri overload yapabiliyoz tek basina return type i degil
//        return a-b;                           // when you overload return type does not matter
//    }

    //  OVERLOADING METHODS WITH ARRAYS
    public static int[]     SortDesc(int[] arr)         {return arr;}   // ortaya karisik sekilde overload olabilir
    public static long[]    SortDesc(long[] arr)        {return arr;}   // is o ki argumentler cakismasin
    public static char[]    SortDesc(char[] arr)        {return arr;}   // return type degisebilir
    public static short[]   SortDesc(short[] arr)       {return arr;}
    public static Double[]  SortDesc(Double[] arr)      {return arr;}

    //  WRITE A METHOD FINDING MAX OF 3 NUMBERS
//  lets write two methods one finds max of two numbers then overload with 3 number using one in another
    public static int max(int a, int b)
    {
        return (Math.max(a,b));                     // cok amelece bir is yapmis olabiliriz ama
    }                                               // sonucta kendi methodumuzu yazdik
    public static int max(int a, int b, int c)      // vede assagida bir kere daha kullandik.
    {
        return max(max(a,b),c);
    }
    public static int max(int a, int b, int c, int d)
    {
        return max(max(a,b,c),d);                   // hayir burda extend edip dort degeri compare ettik
    }                                               // ama methodun kullanisi cok manidar ve sik oldu
    public static int max(int a, int b, int c, int d, int e)
    {                                               // burda iyice amk olayin 3 degeri birden cagirdik sonra 2 yi
        //return max(max(a,b,c),max(d,e));            // sonra bunlari ikilinin icine koduk asilnda soylede olabilir di
        return max(max(a,b),max(c,d),e);              // yani ikiser ucer takilabiriz teker teker de takilabilirdik
    }
    public static int max(int a, int b, int c, int d, int e, int f)
    {
        //return max(max(a,b,c),max(d,e,f));           // yani olasiliklar cok artti ama en kolay boyle olur herhal
        return max(max(a,b,c,d,e),f);                  // yani besini birden cagirip sonra son degeride ekleyebilirdik
    }




    public static void main(String[] args)
    {
        myFirstMethod();
        oneToOneHundred();
        oddOrEven(7);
        sumOfTwoNumbers(8,4);
        removeduplicates("kamilkekkaaammmmz");
        kmToMiles(3);
        method1("a");
        System.out.println(method2("hakki"));
        String str = method2("strninamk");
        System.out.println(str);
        System.out.println(method4());
        System.out.println(sumOfNums(1,2));
        System.out.println(sumOfNums(3,4,5));
        System.out.println(max(4,3,5,7,22,3));

    }
    public static void method12(String a )
    {
        a = "mahmut"; // tanimlamaya gerek yok cunku zaten methodun icine yazdik bunu.
        System.out.println("kamil");
    }
    public static void onetoonehundred()
    {
        for(int i = 0 ; i<=0 ; i++)
        {
            System.out.println(i+" ");
        }
    }
    public static void reverseString(String str)
    {
        String result = "";
        for(int i = 0 ; i<str.length()-1 ; i++)
        {
            result += "" + str.charAt(str.length()-1-i);
        }
        System.out.println(result);
    }
    public static int largestNumber(int a, int b)
    {
        return Math.max(a,b);
    }
    public static int[] descendingOrderArray(int[] arr)
    {
        int[] arr1 = new int[arr.length];
        Arrays.sort(arr);
        for (int i = 0 ; i < arr.length ; i++)
        {
            arr1[i]=arr[arr.length-1-i];
        }
        return arr1;
    }
    public static double[] descendingOrderArray(double[] arr)
    {
        double[] arr1 = new double[arr.length];
        Arrays.sort(arr);
        for (int i = 0 ; i < arr.length ; i++)
        {
            arr1[i]=arr[arr.length-1-i];
        }
        return arr1;
    }
    public static char[] descendingOrderArray(char[] arr)
    {
        char[] arr1 = new char[arr.length];
        Arrays.sort(arr);
        for (int i = 0 ; i < arr.length ; i++)
        {
            arr1[i]=arr[arr.length-1-i];
        }
        return arr1;
    }
    public static String[] descendingOrderArray(String[] arr)
    {
        String[] arr1 = new String[arr.length];
        Arrays.sort(arr);
        for (int i = 0 ; i < arr.length ; i++)
        {
            arr1[i]=arr[arr.length-1-i];
        }
        return arr1;
    }

}