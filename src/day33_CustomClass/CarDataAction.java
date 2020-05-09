package day33_CustomClass;
//  //  CUSTOM CLASS
//      class               :   lar data/attribut ve action/function icerir
//      objects             :   ler came from class referans name i ile
//      instance variables  :   object variables declared outside of the block or method
//      local variables     :   declared within a block
//      instance methods    :   object methods variables that are declared within a block does not have static specifier
public class CarDataAction
{
    //  buraya instance variable lari belirleyecez yada attribute yada data diyebiliriz

    String Brand;
    String Model;
    int year;
    String color;

    //  simdi sira action create etmeye geldi bir instance method create edecegiz onun olayida static olmamasi

    public void start()
    {
        System.out.println(Brand+" "+Model+" started");
    }
    public String stopped()
    {
        return (Brand+" "+Model+" stopped");
    }
    public void getCarInfo()
    {
        System.out.println(Brand+" "+Model+" "+year+" "+color);
    }
    //  simdi get info yaptikta butun value leri ayri ayri girmektense tekten girebilecegimiz bir setCarInfo yazsak ha
    //  aslinda bu method birsey dondermiyecek birsey bastirmayacak o zaman ne void ne return olmasinin bi manasi yok
    //  iste burda constructor lar ve this methodu devreye giriyo ama ondan once bi sekil yapalim sonra constructor lari
    public void setCarInfo(String Brand1, String Model1, int year1, String color1)
    {
        Brand=Brand1;Model=Model1;year=year1;color=color1;
    }
    //  bu yukardaki cok sacma olsada bunu bide constructorla yazalim
    public CarDataAction(String Brand, String Model, int year, String color)
    {
        this.Brand=Brand;this.Model=Model;this.year=year;this.color=color;
    }
    public CarDataAction()
    {
        // simdi bu constructor i neden overload ettim cunku default constructor olmazsa bos object olusturamayiz
    }
    //  son bir mevzuu var o da toString methodu bu aslinda her methodun icinde var
    //  eger ki biz bir objeyi direk arraylist gibi yazdirmak istiyosak sout ile bunu overload etmemiz lazim
    //  yoksa hash code aliriz arraylerdeki gibi, bizim bu nu bir sekilde kafamiza gore overload etmemiz lazim
    public String toString()
    {
        return Brand+" "+year+" "+Model+" "+" "+color;  //  simdi object lerimizi bastirabilirzi
    }

    //  bir mevzuu daha diyelim ki baska bir package da biz bu CatDataAction larini kullanarak bir object olusturmak
    //  istiyoruz o vakit bu package i ve class i belirtip import etmeiz lazim soyle ki
    //  import PackageName.ClassNmae;  //  bu kadar, ayni arraylist yada arraylerde oldugu gibi object olusturmak icin
    //  o class lari import etmemiz lazim
}
