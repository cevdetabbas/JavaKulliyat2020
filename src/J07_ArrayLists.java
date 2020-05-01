import java.util.ArrayList;
import java.util.*;

public class J07_ArrayLists
{
//  ARRAYLISTS
//  presented in java.util package
//  is an ordered collection of values
//  Arraylist is dynamic size arrays Yani size i specify etmek gerekmiyor
//  bide bu paket lazim import java.util.ArrayList;
//  we can add or remove objects from arraylist
//  Arraylist does no support primitives it stores objects only
//  decleration i iki sekilde olabilir
//  ArrayList<ClassType> variablename = new ArrayList<>();
//  ArrayList<ClassType> variablename = new ArrayList<ClassType>();
//  ArrayList size is dynamic so automatically adjusted
//  ArrayLists are ordered means it has index nubers


    public static void main(String[] args)
    {

//  DECLERATION
        ArrayList<Integer> arrList1 = new ArrayList<>();
        // or
        ArrayList<String> arrList2 = new ArrayList<String>();

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
// ARRAY METHODS //////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////

//  ADD METHOD
//  add object to arraylist if it is primitive it will be converted to wrapper class
//  add method is overloaded method it can work with idex numbers also
        arrList1.add(100);          arrList2.add("kamil");      // index 0
        arrList1.add(107);          arrList2.add("mahmut");     // index 1
        arrList1.add(102);          arrList2.add("huseyin");    // index 2
        arrList1.add(1);                            // auto-boxing
        arrList1.add(Integer.valueOf("33"));        // none
        arrList1.add(Integer.parseInt("100"));   // auto-bozing

        System.out.println(arrList1);   //  bu sekildede yazdiriliyor    [100,    101,     102]
        System.out.println(arrList2);   //  bu sekildede yazdiriliyor    [kamil, mahmut, huseyin]
        //  bunlarda index numberlar        0       1       2
        arrList1.add(3,99);   //  buda index numberla nasil object eklenebilecegi ama sonra resize yapiyo
        arrList1.add(2,13);   //  boyle yaparsan araya sokuyor yani ikinci index bu oluyo sonrakileri oteliyo
        // arrList.add(14,33);      //  boyle bisey yapaman cunku index does not exist halihazirdakinden bir fazla olabilir

//  GET METHOD
//  gets specific index of the arraylist
        System.out.println(arrList1.get(0));
        System.out.println(arrList1.get(2));
        System.out.println(arrList2.get(1));

//  SIZE METHOD
//  returns the length (total number of values) from the arraylist
        System.out.println(arrList1.size()); // gives how many items are there in the array
        int k = arrList1.size(); // bu k array size i veren int
        for (int i = 0 ; i<arrList1.size() ; i++){} // buday for yazarken isimize yarayabilir yada each ile de yazilabilir
        for (int each : arrList1){} // daha sikintisiz bir yontem

//  CLEAR METHOD
//  clears the array removes all values from the arraylist
        System.out.println(arrList1);
        //arrList1.clear();  // bunu yazipta butun bi arrayi p/hic etmemek lazim
        System.out.println(arrList1);

//  PRINTING EACH VALUE OF THE ARRAYLIST
        for (int i = 0 ; i<arrList1.size() ; i++)
        {
            System.out.print(arrList1.get(i)+" "); // bu bosluklarla yazdiracaktir.
        }
        System.out.println();
        // for each le de yazdirabiliriz
        for (int each : arrList1)
        {
            System.out.print(each+" ");
        }
        System.out.println();

//  SET METHOD
        // it replace the object with the given index number
        arrList1.set(1,44); // bu ikinci object i 44 ile degistirir.

//  CONTAINS METHOD
        // this checks an object contained in the arraylist or not. it is a boolean, returns a boolean
        ArrayList<String> hacilar = new ArrayList<>();
        hacilar.add("kamiller");
        hacilar.add("mahmutlar");
        hacilar.add("huseyinler");
        hacilar.add("zalimlar");

        hacilar.contains("hacilar"); // this returns false
        hacilar.contains("huseyinler"); // this returns true

//  EQUALS METHOD
        // it checks two arraylist is equal or not. if it is returns true if not return false
        ArrayList<String> zalimlar = new ArrayList<>();
        zalimlar.add("kamiller");
        zalimlar.add("mahmutlar");
        zalimlar.add("huseyinler");
        zalimlar.add("zalimlar");

        boolean a = zalimlar.equals(hacilar); // this returns true
        System.out.println(a);

//  REMOVE METHOD
        // remove(int) bu int index numberli object i siler
        // removes an object from the arraylist or removes given index number object from the arraylist
        zalimlar.remove("mahmutlar");   // bu remove the object and resizes the arraylist
        System.out.println(zalimlar);
        zalimlar.remove(0);         // bu removes sifir indexindeki object i
        System.out.println(zalimlar);
        // eger primitive le object ayni olursa cunku auto-boxing oldugundan direk primitive int yazip object olarak store
        // edebiliyoruz ne olur o zaman
        // add method only accepts primitives remove method both
        // remove(Integer) bu da match eden ilk object i siler
        // kullanirken once Integer oldugunu belirtmemiz lazim mesela
        System.out.println(arrList1);
        arrList1.remove(0); // dersek bu 0 indexli object i siler yani 100 u
        System.out.println(arrList1);
        Integer j = 102; // dedigimizde 1 Integer demis oluyoruz ve bununla silersek eger ilk eslesen 102 zaten bi tane
        arrList1.remove(j);
        System.out.println(arrList1); // 102 yi arraylist ten siler
        // eger object matchlesmiyorsa false donderir mesela
        arrList1.remove(Integer.valueOf("99"));   // 99 u siler
        System.out.println(arrList1);
        arrList1.remove(Integer.valueOf("98"));  // boyle bi object yok o zaman bi sey yapmaz amma
        System.out.println(arrList1);
        boolean q = arrList1.remove(Integer.valueOf("98")); // dersek bunu false donderebilir
        System.out.println(q);                              // oyle bi deger yok demek gibi bisey
        System.out.println(arrList1.remove(Integer.valueOf(13))); // deyince hem donderir hem siler
        System.out.println(arrList1);

//  INDEX OF METHOD
        // gives index number of object from the arraylist
        System.out.println(arrList1.indexOf(44));  // 44 son object onun index i 0
        // if ovject is not exist in the array it gives negative number
        System.out.println(arrList1.indexOf(33));       // -1 verir
        System.out.println(arrList1.indexOf(323));      // -1 verir cunku boyle bi object yok


//  LAST INDEX OF METHOD
        // gives last occured object`s index number as an int
        ArrayList<Integer> arrList4 = new ArrayList<>();
        arrList4.add(1);
        arrList4.add(21);
        arrList4.add(31);
        arrList4.add(41);
        arrList4.add(1);
        System.out.println(arrList4);
        System.out.println(arrList4.indexOf(1)); // bu ilk 1 degerinin index degerini verir 0
        System.out.println(arrList4.lastIndexOf(1)); // buda son 1 degerinin index degerini verir 4
        // sadece bir object varsa o zaten bastanda sondanda ayni
        System.out.println(arrList4.indexOf(31));           // bununla assagidakinin degeri ayni
        System.out.println(arrList4.lastIndexOf(31));    // aslinda unique objectleri bulmak icin kullanilabilir

//  IS EMPTY METHOD
        // bu muhtemelen true yada false degeri veriyodur
        System.out.println(arrList4.isEmpty()); // su an false verdi cunku bos degil. clear la bi bosaltalim
        arrList4.clear();
        System.out.println(arrList4.isEmpty()); // simdi true ya dondu hadi bakem hayirlisi

//      AS LIST
        // it converts object arrays to the list interface
        // bir arrayi arrayliste donusturmek isteniyorsa bu method kullanilabilir. mesela
        Integer[] arr1 = {1,2,3,4,56,7};            // array olusturalim
        System.out.println(Arrays.toString(arr1));  // bastiralim
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));    // arrayi arraylist e cevirelim
        System.out.println(list1);                  // bastiralim
        list1.add(33); list1.add(44); list1.remove(1); // simdi arraylistin nimetlerinden faydalanabiliriz
        System.out.println(list1); // ekle cikar felan hatta lazimsa arraye geri cevir ama size i degistirmek lazim
        arr1 = new Integer[list1.size()];
        for(int i = 0 ; i<list1.size() ; i++)
        {
            arr1[i]=list1.get(i);
        }
        System.out.println(Arrays.toString(arr1));  // bu arraylistin arraye cevirilmiss hali ne gerek varsa amk

//  ADD ALL METHOD (INTERFACE)
        // bu da bir arrayi hali hazirdaki bir arrayliste eklemeye yarar.
        String[] arr21 = {"hakki", "bulut", "hakan", "sabri"};  // one olusturup sonra ekleyebiliriz
        hacilar.addAll(Arrays.asList(arr21)); // simdi burda arr21 i hacilara ekledik
        System.out.println(hacilar);
        hacilar.addAll(Arrays.asList("hayalet", "akbaba", "harun", "amirim"));
        System.out.println(hacilar);

//  REMOVE ALL METHOD (interface)
        // bu muhtemelen butun match lesen object leri arraylist ten siler yada bir arrayi komple mi siler bilemedim
        // removes all matching objects from the list
        // this method not designed to be used with in loop
        hacilar.removeAll(Arrays.asList("hakan", "akbaba"));
        System.out.println(hacilar);
        ArrayList<Integer> arrlist = new ArrayList<>(Arrays.asList(1,1,2,3,3,3,4,4,5,5,5,5,6,6,7,7,8,9,123));
        System.out.println(arrlist);
        arrlist.removeAll(Arrays.asList(3));     // bu butun 3 leri siler ama object olmasi lazim ondan aslist yazdik
        arrlist.removeAll(Arrays.asList(4,5,6)); // bu da alayina gider yapti matchlesen hepsini sildi
        System.out.println(arrlist);
        // o bi soru vardi eger bir Stringde unique degilse bir harf sil sadece uniqleri birak diye tam onun icin bu


//  SORT METHOD
        // import java.util.Collections
        //  order values in ascending order. collectionis class is presented in java utils packages
        Collections.sort(arrList1); // Collections and collectin is different
        System.out.println(arrList1);


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  |            ARRAYS                                  VS                         ARRAYLIST                          |
//  |   array size fixed                                 |  arraylist size is dynamic                                  |
//  |   supports primitive and non primitive             |  does not support primitives only store objects             |
//  |   Array can be multidimentional                    |  is ordered collection of values (index numbers)            |
//  |                                                    |  we can add remove objects, size adjusted automatically     |
//  |                                                    |  arraylist does not skip index                              |
//  |                                                    |  does not support multidimention                            |
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  COMMON PROBLEMS



    }
    // ARRAY TO ARRAYLIST
// Arrayleri arrayliste cevirmek icin kullanilabilir.
// yani cok amele bir method aslinda
// birde for each le de yapilabilir sonucta arrayle ugrasiyon
    public static ArrayList<Integer> ArrToArrList(int[] arr)
    {
        ArrayList<Integer> ArrList = new ArrayList<>();
//        for (int i = 0 ; i<arr.length ; i++)
//        {
//            ArrList.add(arr[i]);
//        }
        for (int each : arr)
        {
            ArrList.add(each);
        }
        return ArrList;

    }

    //public static void main(String[] args)
    //{
    //    int[] arr = {1,23,4,5,6};
    //    System.out.println(ArrToArrList(arr));
    //}

}