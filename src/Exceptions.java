import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.NoSuchElementException;

public class Exceptions
{
    //  unchecked and checked exception
    //  try and catch blocks
    //  multi-catch blocks
    //  finally block
    //  throws
    //  throw
    //  Custom excpetion


    public static void main(String[] args)
    {

        //  UNCHECKED AND CHECKED EXCEPTIONS
        //  Buradaki mevzuu kodu yazarken error veriyorsa checked vermiyorsa unchecked exeption
        //  unchecked (unexpected event): occures during runtime RuntimeException class is the parent of all exceptions
        //  checked (unwanted events): occurs during the compile time. needs to be handled IMMEDIATELY
        //  mesela
        //  System.out.println("kamil".charAt(100));  // bu unchecked exception
        //  ve bu
        //  System.out.println(9/0);  // unchecked exception
        //  amma
        //  Thread.sleep(100); // bu checked exception cunku yazar yazmaz cikiyo zaten ve immediately cozulmesi lazim
        //  fekat bu syntax error degil ona dikkat bu exception

        //  TRY AND CATCH BLOCK
        //  Buradaki mevzuu eger biz expect ediyosak bi exception olacagini ona gore baraj kuruyoruz.
        //  yani bunu dene exception olursa catch blogunu execute et diyoruz.
        //  catch blogunda da bir kac option imiz var
        //  hic birsey yazdirmayip bos gecebiliriz.
        //  sout un icine bir sey yazdirip onu ekrana bastirabiliriz
        //  yada hatanin ne oldugunu ekrana yazdirabiliriz
        //  mesela
        try
        {
            System.out.println(9 / 0);
        } catch (Exception e) {}
        // burda hic o hata olmamis gibi devam etti ama sadece sout la bi satirbos ta birakilabilir

        try
        {
            System.out.println(9 / 0);
        }
        catch (Exception e)
        {
            System.out.println();
        } // burda bi println ile bir satir bos biraktik

        try
        {
            System.out.println(9 / 0);
        }
        catch (Exception e)
        {
            System.out.println("sikinti oldu");
        }
        // burda eger yukardaki exceptiona girerse bunu yazdirir
        //  girmezse zaten denedi yanilmadi olani yazdirir catch blogunu ignore eder.
        //  mesela
        try
        {
            System.out.println(9 / 1);
        } catch (Exception e)
        {
            System.out.println("sikinti oldu");
        }
        // burda exception olmadiginda sadece try i run etti


        //  birde biz hata ne ise onu direk kendimiz output olarak alabiliyoruz
        //  soyleki
        try
        {
            System.out.println(9 / 0);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        // burda eger yukardaki exceptiona girerse bunu yazdirir
        //  ama string olarak yazdiriyo
        //  diger bir mevzuu Exception in turu biz sadece Exception classini kullanabilirz fakat bide specific olarak
        //  hangi exception sa yani OutOfBound mu yoksa AritmeticError mu artik ne ise onlari da class olarak verebiliriz
        //  fekat en nihayetinde sub class oldugundan Exception i kullanmak mantikli herhangi bir excpetion icin
        //  eger ki yanlis exception class i kullanilirsa tekrardan exception hatasi konsala gelir
        //  birde bu aslinda bi string yani biz onu bi variable a atayip onu bastirabiliriz. amma cok ta sey degil
        //  yinede bir ornek yapalim
        String exceptionA = "";
        try
        {
            System.out.println(9 / 0);
        }
        catch (Exception e)
        {
            exceptionA = e.getMessage();
            System.out.println(exceptionA); // buda uygulamasi ama luzumsuz biraz gibi.
        }

        //  MULTI CACHE BLOCKS
        //  Bu kessinlikle cok luzumsuz ama velevki exception in hangi exception oldugunu gormek istiyosak butun kodu
        //  interrupt etmeden bu belki kullanilabilir
        //  kural su bir try can be followed by multiple catch block which one fits with the need it will be executed
        //  mesela bir Arithmetic Exception verelim yine
        try
        {
            System.out.println(8 / 0); // burda exception var altta da buna bakan catch ler var artik hangisi ilk uygunsa
        }
        catch (ClassCastException e)
        {
            System.out.println("Class Cast");
        }
        //  bu degil
        catch (NoSuchElementException e)
        {
            System.out.println("No such element");
        }
        //  bu degil
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic ");
        }  //  aha bu diyerek bunu yazdiracak
        //  eger sub class verirsende eger uygunsa onu bastirir. once hangisi uygunsa onu verir.

        //  Exception class is parent of all that is why it can handle all exceptions.


        //  try in icine birden fazla kod yazilabilir exception olana kadar normal execution devam eder.
        //  exception vukuu halnde catch block a gecer mesela
        try
        {
            System.out.println("hello");
            System.out.println("ola");
            System.out.println(8 / 0);
            System.out.println("bye");          //  bunlari yazdirmayacak cunku exception dan sonra catch e gitti
            System.out.println("bye bye");
        }
        catch (Exception e) {}

        //  FINALLY BLOCK
        //  eger try an catch block varsa birde sona bunu eklersen bu always get executed mesela velev ki exception
        //  exception olmasa bile amma try catch block is necessary.
        try
        {
            System.out.println(9 / 1);
        }
        catch (Exception e)
        {
            System.out.println("sikintilar var");
        } finally
        {
            System.out.println("yukarda sikinti var diyosa vardir yoksa yoktur olur oyle"); // gene verir.
        }
        //  eger exception olsa
        try
        {
            System.out.println(9 / 0);
        }
        catch (Exception e)
        {
            System.out.println("sikintilar var");
        }
        finally
        {
            System.out.println("yukarda sikinti var diyosa vardir yoksa yoktur olur oyle"); // gene verir
        }

        //  PRINT STACK TRACE
        //  Bu da muhtemelen hata varsa en sonra onu yazdiriyo rapor ediyo bi nevi
        try
        {
            System.out.println(9 / 0);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        } // burda eger yukardaki exceptiona girerse bunu yazdirir

        System.out.println("zalim");

        //  burada iki tane garip durum oldu birincisi onceki try catch den sonra degil once zalim i yazdirdi
        //  digeri assagida sleep exception i try in icine coyduk diye class a exception i eklememiz gerekmedi
        //  demeyse ki runtime error larla checked exception larin handle i farkli.

        try
        {
            Thread.sleep(3000);
        }
        catch (Exception e) {}
        System.out.println("dunya");
        System.out.println("a");
        System.out.println("a");
        System.out.println("a");

        for (int i = 1; i <= 5; i++)
        {
            System.out.println("push up " + i);
            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e) {
            }
        }

        //  bu yukardaki mevzuyu eger method icinde yazmak lazim gelse

    }
    public static void sleep1()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e) {}
    }

        //  THROWS KEYWORD
    //  bu exception u icerde hallediyo ve fekat egerki metoda exception verilmek istense
    public static void sleep2() throws InterruptedException //  bir exception atilip mevzuu halledilebilir.
    {
        Thread.sleep(1000);  //  bunun bir disadvantages i eger method da throw ediliyosa her method
        // cagirildiginda bu tekrardan handle edilmesi gerekiyo.
        //  birden fazla throws class verilebilir ama order should be child to parent for example
        //  public void methodName() throws IOException, Exception
    }



}
class Exceptions2
{
    //  THROW KEYWORD
    //  manually throwing exceptios
    //  bu mesele hic geregi yokken sirf sulluluk olsun diye hadi bir exception create edelim dersek
    //  throw la bunu yapabiliyoruz bi kac yontemi var
    //  once o exception classindan bir object create edip sonra onu throw objName diyebiliriz yada
    //  direk throw new RuntimeException("Burayada Istedigin Mesaji Yazabilirsin")
    public static void main(String[] args)
    {
        NoSuchElementException obj1 = new NoSuchElementException();
        throw obj1;
        // or
        //throw new RuntimeException("kendi kendime exception create ettim simdi cok mutluyum");
        //  fakat bu hata verir normaldir cunku bir onceki exception execute edileceginden bu iskartaya cikar
        //  bundan sonrakilerde iskartaya cikar.
        //  you can not create unchecked exceptions with this
    }
}
class customException
{
    //  we can create custom unchecked exception by extending runtime exception class
    //  we can create custom checked exception by extending exception class

    //  mesela bi class olusturalim onuda runtime exceptiondan extend edelim
    //  yani aslinda bir exception class olusturacaz ve onda bi obje gelirse yada throw edilirse
    //  bize cok ta lazim olan bir exception elde etmis olacaz
}
class BreakTimeException extends RuntimeException
{
    BreakTimeException()
    {
        super("bu custom BreakTimeException classimizin custom excpetion mesaji");
    }
}
class CustomExceptoin2
{
    public static void main(String[] args)
    {
        boolean breakTime=true;
        if(breakTime)
        {
            throw new BreakTimeException();  // o yukardaki class extend etmezsse burda sikinti olur.
        }
    }
}
//  simdi mesela bi runtime exception throw ettik ona istedigimiz seyi yazdirabiliyoruz soyleki
class exceptionaMesajYazdirma
{
    public static void main(String[] args) {
        throw new RuntimeException("bu custumaized runtime error mesaji akilli ol");
    }
}
//  bir luzumsuz mevzuu daha simdi yukarda breakTimeException classini RunTimeException classindan extend
//  ettik ya iste orada biz super classtaki constructor i super() ile override edip bu class a ozgu bir
//  hata mesaji yazdirabiliriz ve dahi onu bile overload edebiliriz

//  birde try catch block unda try in icine unchecked exceptino koyabiliyoruz soyle ki onuda handle edelim
class uncheckedInTry
{
    public static void main(String[] args)
    {
        try {
            throw new ClassNotFoundException();
            }
        catch (Exception e)  // buraya yukardaki classin isminide verebilirdik.
        {

        }
    }
}
