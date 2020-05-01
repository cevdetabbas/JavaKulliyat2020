public class J01_VariablesPrimitivesOperators
{
    public static void main(String[] args)
    {
        // DECLERAITON OF VARIABLES
// DataType VariableName = Value;
        int n = 10;
        n=100; // yeniden assign etme
        System.out.println(n); // print etme --> 100
        String greeting; // variable olusturma
        greeting = "Hello World"; // variable a value assign etmek
// you can not give reserved names for a varialbe like class main etc...
// it should not start from a number
// start always with lower case, yani upper case le de baslayabilir
// primitives are byte short long int float double char boolean
// float ends with f
// float price = 47.34f
// double ends with d ama zorunda degil
// double metertomile = 2.345d
// char has only one character within single quote
// boolean has true and false option
        char firsletterofmyname = 'm';
        boolean lovejane = true;
        double d = 345.5;
        float f = 23.4f;
        int age = 34;
        long size = 12345l;
        String str = "kamil";

        // CONCATENATION
// writing different variables and values together.
        System.out.println(n+greeting+" ne diyon lan sen denisik" + 3);//--> 100Hello World ne diyon lan sen denisik3
// if there is only numbers it considered as int
// but if there is a string it all considered as String
        System.out.println(3+4+6); //--> 13
        System.out.println("3"+5); //--> 35

        //ARITMETIC OPERATORS
// oncelik sirasi ayni matematikteki gibi +-*/%
//        OPERATOR	    USE				    DESCRIPTION					    EXAMPLE
//           +		    x + y				Adds x and y				    float num = 23.4 + 1.6; // num=25
//           -		    x - y				Subtracts y from x			    long n = 12.456 – 2.456; //n=10
//           -x		    -x     			    Arithmetically negates x		int i = 10; -i; // i = -10
//           *		    x * y				Multiplies x by y				int m = 10*2; // m=20
//           /		    x / y				Divides x by y				    float div = 20/100 ; // div = 0.2
//           %		    x % y				Computes the remainder 		    int rm = 20/3; // rm = 2

//        Operator		Description
//           +			Unary plus operator; indicates positive value (numbers are positive without this, however)
//           -			Unary minus operator; negates an expression
//           ++			Increment operator; increments a value by 1
//           --			Decrement operator; decrements a value by 1
//           !			Logical complement operator; inverts the value of a boolean
//

        int apples;
        apples=0;
        System.out.println(apples++); // once bastirir sonra arttirir
        System.out.println(++apples); // once arttirir sonra yazdirir
        System.out.println(--apples); // once azaltir sonra yazdirir
        System.out.println(apples--); // once yazdirir sonra azaltir

        // TYPE CASTING
        int i = (int)3.0;   // this paranthesis converts the double value into intger 3
        int i3 = (int)3.6;   // int value is 3

        // IMPLICIT CASTING
        // byte>short>int>long>float>double
        double d1= 2000;
        long l = i;         // this is implicit capable degiskeni kendinden kucuge assign edebiliyon gibi bisey

        // EXPLICIT CASTING
        double price = 200.55;
        //int iprice = price;  bu hata verir cunku double a kusuratli yazaman onun icin explicit casting yapcan
        int iprice = (int)price;
        // for example int islem = 5/2.0; int degeri kusuratli olamayacagindan olmaz
        int islem = (int)(5/2.0);
        int islem2 = (5/2);
        System.out.println(islem);
        System.out.println(islem2);

        //SHORTHAND OPERATORS
        // +=sth or -=sth or *=sth or /=sth
        int guest = 3;
        guest = 5;
        guest = guest + 2 ;             // guest +=; ayni sey demek
        System.out.println(guest);      // fekat =+ ayni sey degil
        guest+=5;                       // bu guest = guest + 5 demek
        System.out.println(guest);
        int minutes = 431;
        int ours = minutes / 60;
        System.out.println(ours);
        minutes = minutes%60; // bu su sekildede yazilabilir minutes %=60;
        minutes %=60;
        System.out.println("kalan sure " + ours + " saat " + minutes + " dakikadir");
        boolean sweet = false;
        boolean hot = (sweet = true);
        System.out.println(sweet);
        System.out.println(hot);

        //RELATIONAL/COMPARISON OPERATORS
        // > < >= <= == !=          they gives boolean value
        int n1 = 30;
        int n2 = 50;
        System.out.println(n1>n2);
        boolean test = n1>n2;
        System.out.println(test);
        boolean test2 = n1!=n2;
        System.out.println(test2);
        char letter1 = 'A';
        char letter2 = 'B';
        boolean b11 = letter1 == letter2;
        boolean b12 = letter1 != letter2;
        boolean b13 = letter1 > letter2;
        boolean b14 = letter1 < letter2;
        boolean b15 = letter1 >= letter2;
        boolean b16 = letter1 <= letter2;
        System.out.println(b11);
        System.out.println(b12);
        System.out.println(b13);
        System.out.println(b14);
        System.out.println(b15);
        System.out.println(b16);

        //LOGICAL OPERATORS
        // && || !
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        // OR
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(true && true && true);
        System.out.println(true && true && false);
        System.out.println(true && false && false);
        System.out.println(false && false && false);
        System.out.println(true && false && true);
        System.out.println(false && true && false);
        System.out.println(false && false && false);

        System.out.println(true || true || true);
        System.out.println(true || true || false);
        System.out.println(true || false || false);
        System.out.println(false || false || false);
        System.out.println(true || false || true);
        System.out.println(false || true || false);
        System.out.println(false || false || false);

        System.out.println(!true);
        System.out.println(!false);
        System.out.println(3!=5);

        // exclusive or
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        // precedence of logical operators
        // if ! && and || together at the same place

        // first ! then && then || considered
        System.out.println(!(true) && true  || false);
        System.out.println(!(true) || true  || false);
        System.out.println(!(true) && true  && false);
        System.out.println(!(true) && true  || false);

    }
}