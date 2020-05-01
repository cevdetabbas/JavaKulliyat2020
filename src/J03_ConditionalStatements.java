public class J03_ConditionalStatements
{
    public static void main(String[] args)
    {
        //  CONDITIONAL STATEMENTS
// if (a condition is true/false) {} if eger parantez icindeki durumun dogru almasi durumunda suslu parantezin
// icindeki olayi donderiyo if in icindeki durum bir boolean ve onun dogru olmsi durumunda sekilleniyo

        // BASIC IF STATEMENT
        if (9>3)
        {
            System.out.println("9 3 ten buyuk yada herhangi bi istendik sonruc buraya yazilabilir");
        }
// if tek basina olmasi durumunda calisiyor. (codingbat de calismiyo o ayri)
// eger birden fazla mantiksal sinama yapilmak istense
        if (4<6)
        {
            System.out.println("sayi 5");
        }
        else if (1<3) // else if in icine mantiksal sinama konmak zorunda bu durumda bir output veriyo
        {
            System.out.println("sayi iki");
        }
        else // bu son sinama her hangi bir other output burdan neset ediyoru. if ve else if gecerli olmadigiysa budur.
        {
            System.out.println("sayi iki veya bes degil");
        }

        // NESTED IF
//  ic ice if koyunca ona nested diyo mesela
        int a = 0;
        if (a>5)
        {
            if (a>15)
            {
                System.out.println("15 ten bile buyuk");
            }
            else
            {
                System.out.println("sadece 5 ten buyuk 15 ten kucuk");
            }
        }
        else
        {
            System.out.println("sayi 5 ten kucuk");
        }

        //  TERNARY OPERATOR
//  bu sadece ikili bir sinama veriyo yani if ve else gibi else if diye bisey yok ama ic ice yazilabiir soyle// is a question mark in java ? it is like an if statement but just for to check true false condition.
// structuri max = (n1>n2) ? n1 : n2; seklinde ama nasil calisiyo
// galiba sadece int value lerinde calisiyo ve onu cift degiskenden birine assign etmek istediginde kullaniliyo
// mesela
        int aa=3,bb=4,cc=5; // burda 3. degerin ne oldugu onemli degil cunku onu degisik bi rakama esitleyecez sonuca gore
        a = (bb>cc) ? // bundan sonra true kismini yazcan sonra iki nokta sonra yanlissa olursa ne yazcan. ; ile bitircen
                aa = (bb>cc) ? a : bb: a; //gibi burda b>c is a esit a ya degilse b ye esit oluyo.
// ote yandan ic ice ternary yaziladabiliyor

        // NESTED TERNARY OPERATOR
        int aaa=3,bbb=9,ccc=5,ddd=6,eee=3,fff=2;
        aaa = (bbb>ccc) ? ddd = (eee>fff) ? aaa:bbb:ccc; //
// yada String in olup olmayacagini bir sinamaya -booleana- baglayabiliriz
        String action; String dddd="zalim"; boolean isGreen = true;
        action = (isGreen) ? dddd=("kamil".equals("mahmut")) ? "zalim" : "goAhead" : "stop";
// burada mesele ilk basta string verdiysen ikinci degisken de string olmasi lazim icerdeki mantiksal sinama
// boolean yada .equals yada == yada >< logical operatorlardan biri olabilir. Amma bastaki degiskenle sondaki degiskenler ayni olmali yada arada herhangi bir baska ternary varsa onlarinda bastaki degiskeni ayni olmali ama parantez icindeki mantiksal sinama degisebilir yani boolean yada logical operatorlardan biri olabilir.

        // SWITCH STATEMENT
// Switch statement can be used for limited case it is defined by an expression which can be string boolean
// character or integer here it is how to use
// boolean koymaya calistim olmadi
        int h = 0;
        switch (h) 	// whatever the case matches it will give that statement
        {
            case 1:			// eger break koymazsan matchlestikten sonra altindakini de yazdiriyo
                System.out.println("1 e esit");		// default olsada break koymak lazim eger onu sona yazmadiysan.
                break;			// yani yukardan asagiya okuyo
            // case ler 1,2,3 int olabilecegi gibi char string yada boolean olabilir.
            case 2:
                System.out.println("2 ye esit");
                break;

            case 3:
                System.out.println("3 e esit");
                break;

            default:
                System.out.println("default case"); // bunun altina break yazmazsan case 4 u de yazdiri alimallah
            case 4:
                System.out.println("case 4");
                // break;








        }

    }
}