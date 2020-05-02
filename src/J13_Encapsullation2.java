public class J13_Encapsullation2
{
    public static void main(String[] args)
    {
        J13_Encapsulation1.a = "kamil2";  // bu static oldugundan direk erisim saglanabiliyor. fekat
        //  J13_Encapsulation1.b = "mahmut2"; // bu instance oldugundan once object olusturmak lazim
        J13_Encapsulation1 obj1 = new J13_Encapsulation1();
        System.out.println(obj1.b); // objecti olusturduktan sonra static cagirmak da mesele degil object sagolsun
        // ve fakat private li olani nasil cagiracaz iste burda J13_1 de bir pulic instance method yazmamiz lazim
        // ondan sonra burada o methodu kullanarak cagiracaz ki buna getter methodu diyollar
        // simdi method umuzu olusturduk burda caagirmak icin sadece c degil get c diyecez o kadar
        // hali hazirda zaten daha onceden olusturulmus methoudmuz var o zaman direk cagiralim
        System.out.println(obj1.getc());  // evet boylelik le oradaki c yi cagirmis olduk

        // peki getter methodu sadece getir mek icin. eger ki ben onu edit etmek istersem nasil yapacam
        // iste buna da setter methoud diyollar bunun icinde once J13_1 de bir void methodu yazmak lazim
        // ondan sonra o degisken bizim icin editable olacak.
        obj1.setc("huseyin2"); //  bu sekilde method kullanarak edit edebiliriz c mizi
        System.out.println(obj1.getc());    //  c artik editlendi huseyin2 olarak donutumuzu aldik


    }

}
