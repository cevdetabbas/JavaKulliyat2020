
public class J13_Encapsulation1
{
//  //  ENCAPSULLATION
//  butun bu izdirabin sebebi bir instance variable i private yapip - yani sadece kendi class indan erisilebilir -
//  sonra baska class tan nasil erisiriz in derdine dusmek yani tam anlamiyla luzumsuz bir privacy olayi
//  adina da getter methodu diyolar arkasindaki logic te su
//  //  GETTER METHOD
//  bir instance variable i private olarak create ediyosun - diger classlardan erisilemiyo - erismek icinse
//  bir public instance method yaziyosun diyosunki setVarname metodu varname i donderir amma public donderir.
//  boyle olunca sadece o variable a diger bir class tan bir object create edip ulasabiliriz cunku o artik public
//  buna setter method u diyolar ama sikintisi su o sadece read-only method cunku instance method
//  //  SETTER METHOD
//  burdada o variable i modify etmek lazim gelse bu methodu kullaniriz o da soyle oluyo
//  bir public void method yaziyosun diyosunki getVarname methodunun variable i private valuenun this lisine esit
//  yani evet biraz karisik ama olay bu hadi deneyelim

    static String a = "kamil";    // bunun zaten her sekil gideri var
    public String b = "mahmut";     // buna zaten sadece method olusturarak erisebiliyoruz contruction kullanarak
    private String c = "huseyin";     // buna erismeye calisacaz

//  private li olan instance variable a bir public instance method yazacaz soyleki
//  tamam instance variable private ama onu niye bir public instance methodun icinde kullanamayalim ki
//  //  GETTER METHOD
    public String getc()    //  simdi burda dikkat getc public method yanindaki c icerden kullanilacak c
    {
        //this.c = c;                 //  burdaki this instance var yanindaki c instance methodun icindeki c
        return c;                   //  yani getc dediginde this c yi return edecek kulagi soyle gostermek gibi
    }   //  yani bir c donderiyoruz o c ki yukardaki private c ye esit ve yine kendini donderiyo, bu ne amk
        //  niye sadece return yazmiyoz ki
        //  zaten oyleymis amk oyle kulak gostermeye gerek yokmus instance method instance variable i direk
        //  cagirabildiginden zaar private ta olsa sonucta ayni class ta sikinti olmuyormus

//  //  SETTER METHOD
//  simdi de sadece getirmek icin degil edit etmek icinde bir setter method u yazalim
    public void setc(String c)
    {
        this.c = c;     //  burada diyoruz ki parantez icindeki c yukardaki public c ye esit, sonra yardir zaten
    }

    public static void main(String[] args)
    {

    }





}
