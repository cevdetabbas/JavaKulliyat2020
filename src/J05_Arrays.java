import java.util.Arrays;
import java.util.Arrays;
public class J05_Arrays
{
    // arrayler birden fazla ayni tip primitive degerlerini store etmek icun kullanilir.
// Arrays class is presented in java.util package
// decleration i iki sekilde olabilir birincisi direk butun degerleri yazarak
// Array size must be initialized
// Arrays are immutable
// Default vaules int 0 , boolean false , char space , String null
//      int[] arr = new int[4] // 4 deger arrayin uzunlugu yani deger alacak arrayimiz default deger 0 space for String
//      degerleri teker teker girmek mumkun
//      arr[0]=11;arr[1]=22;arr[2]=13; arr[3]=15;
// yada su sekilde deklare edilebilir
//      int[] arr = {1,2,3,4,5,6};
//
    public static void main(String[] args)
    {
        // DECLERATION OF AN ARRAY 1 (by giving value)
        String arr3[] = {"kamil","mahmut","huseyin"}; // boyle de deklare edilebilir.
        // INDEX NUMB        0        1        2
        int[] arr1 = {20,10,30}; // array size is 3
        // INDEX NUMB  0  1  2

        // DECLERATION OF AN ARRAY 2 (by new keyword)
        int[] arr2 = new int[2]; // array size is 2 default values are 0 like arr2[0]=0 , arr2[1]=0

        // PRINTING SPECIFIC VALUES
        System.out.println(arr1[2]);  // bu arr1 in 3. degerini verecek yani 30
        System.out.println(arr2[1]);  // bu arr2 nin 2. degerini verecek yani 0 cunku default olarak 0 olacak

        // ASSIGNING A VALUE
        String[] names = new String[3];
        names[0]="kamil";   names[1]="mahmut";  names[2]="huseyin";

        // PRINTING EACH VALUE OF AN ARRAY
        for (int i = 0 ; i< arr1.length ; i++) { System.out.print(arr1[i]+" "); } // bu araya bosluklarla yazdiracaktir

        // FOR EACH LOOP
        for (int each : arr1) {System.out.println(each+" ");}  // buda araya bosluklarla butun degerleri yazdiracaktir.

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // ARRAY METHODS //////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // ARRYAS LENGTH
        int a = arr1.length; // bu arrayin uzunlugunu veriyor
        System.out.println(a);

        // PRINTING ARRAYS toStringArray
        System.out.println(arr1); // bu hash codu verir array boyle yazdirilmaz yazdirmak icun
        String str1 = Arrays.toString(arr1); // Bu arrayi yazdirmak icin [1,23,4,5,6] gibi yazdiriyo hash codu degil
        System.out.println(Arrays.toString(arr1)); // iste bu ekrana yazdirir.

        // SORT METHOD
        Arrays.sort(arr1); //Arrays.sort(arrayVariable) arrayi ascending ordera sokar oyle kalir yani mutable gibi
        System.out.println(Arrays.toString(arr1));

        // BINARY SEARCH
        Arrays.binarySearch(arr1,30); // array degerinin index numberini verir
        System.out.println(Arrays.binarySearch(arr1,30));
        System.out.println(Arrays.binarySearch(arr1,40)); // eger deger out of bound sa -(a+1) degeri verir.

        // SPLIT METHOD
        str1.split(""); // stringi verilen regex e gore arraye cevirir. // aslinda String methodu fekat iste oyle
        System.out.println(str1.split("")); // biz buda zaten Arrays.toString le yazdirdigimizdan sacmaladi
        System.out.println(str1.split(" "));
        // str.split(".") yaparsan olmuyo onun icin str.split("\.") yapmak lazim

        // TO CHAR ARRAY
        String str = "java";
        System.out.println(Arrays.toString(str.toCharArray())); //bu da string i charArray e ceviren method

        // MULTI DIMENTIONAL ARRAYS
// n dimentional array contains multiple (n-1) dimentional array
// for example 2d array contains more then 1 single dimentional array.

        // DECLERATION OF 2D ARRAY
        String[] arr = {"A","b"};
        String[][] arr2d = {{"a","b","c"},{"d","z","f"}};
        // index numbers     0   1   2     0   1   2
        // index number          0             1

        // PRINTING SPECIFIC VALUES
        System.out.println(arr2d[0][1]); // bu deger b yi verir yani ilk deger hangi array ikincisi hangi value gibi
        System.out.println(arr2d[1][1]);

        // ASSIGNING A VALUE
        arr2d[0][2]="zalim"; // bu degeri ona assign eder

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // ARRAY METHODS //////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // PRINTING ARRAYS DEEP TO STRING METHOD
        System.out.println(Arrays.deepToString(arr2d)); // bu butun 2d arrayi ekrana yazdirir. entire array i
        System.out.println(Arrays.toString(arr2d)); // bu hash kodu verir. yani toString sadece single dim array yazdirir
        System.out.println(Arrays.toString(arr2d[1])); // buda hash kodu verir.
        System.out.println(Arrays.toString(arr2d[0])); // bu ilk single dimentional arrayi yazdirir.
        System.out.println(Arrays.toString(arr2d[1])); // bu ikinci single dimentional arrayi yazdirir.

        // DECLERATION OF 3D ARRAY
        String[] arr1D = {"A","b"};
        // index numbers   0   1
        String[][] arr2D = {{"a","b","c"},{"d","z","f"}};
        // index numbers     0   1   2     0   1   2
        // index number          0             1
        int[][][] arr3D = {{{1,2,3},{4,5,6}}, {{7,8,9},{11,22,33}} , {{12,22,33},{14,25,36}} };
        // index numbers     0 1 2   0 1 2      0 1 2    0  1  2        0  1  2    0  1  2
        // index numbers       0       1          0         1              0          1
        // index numbers            0                  1                         2

        // PRINTING SPECIFIC VALUES
        System.out.println(arr3D[0][1][2]); // bu deger 6 yi verir yani ilk deger hangi array ikincisi hangi value gibi
        System.out.println(arr3D[1][1][0]); // 11

        // ASSIGNING A VALUE
        arr3D[1][1][2]=123;  // bu degeri yerine koyar
        System.out.println(arr3D[1][1][2]);  // buda verify etmek icin

        // PRINTING 3D ARRAY
        System.out.println(Arrays.deepToString(arr3D)); // butun arrayi doker
        System.out.println(Arrays.toString(arr3D[0][1])); // sadece o single dimentional arrayi yazdirir.

        // PRINTING 3D ARRAY WITH FOR EACH LOOP
        for (int[][] each2darr : arr3D)
        {
            for (int[] each1darr : each2darr)
            {
                for (int eacharr : each1darr)
                {
                    System.out.println(eacharr);
                }
            }
        }

        // ARRYAS LENGTH
        System.out.println(arr3D.length); // bu 3d arrayin icinde kac tane 2d array var onu verir.
        System.out.println(arr3D[0].length); // bu da o 2d arrayin uzunlugunu verir.
        System.out.println(arr3D[0][0].length); // da o single dimentional arrayin uzunlugunu verir.

        // SORTING 2D ARRAYS
        //Arrays.sort(arr2D); // boyle bi dalga yok
        Arrays.sort(arr2D[1]);
        System.out.println(Arrays.deepToString(arr2D));



        // COMMON QUESTIONS
        // printing each element in a 2d array
        for(int i =0 ; i<arr2D.length ; i++)
        {
            for(int j = 0 ; j<arr2D[i].length ; j++)
            {
                System.out.print(arr2D[i][j]+" "); // yada bunu yanina bosluklu virgullu felan da yazdirilabilir.
                System.out.println();
            }
        }

        // printing each element in a 2d array WITH FOR LOOP
        for(int i =0 ; i<arr2D.length ; i++)
        {
            for(int j = 0 ; j<arr2D[i].length ; j++)
            {
                System.out.print(arr2D[i][j]+" "); // yada bunu yanina bosluklu virgullu felan da yazdirilabilir.
                System.out.println();
            }
        }

        // printing each 1d array in a 2d array
        for(int i =0 ; i<arr2D.length ; i++)
        {
            System.out.println(Arrays.toString(arr2D[i])); // bu her bir 1d arrayi ayri ayri yazdirir
        }

        // searching for specific value in a 2d arrya
        for (int i = 0 ; i<arr2D.length ; i++)
        {
            for (int j = 0 ; j<arr2D[i].length ; j++)
            {
                if(arr2D[i][j].equals("e"))
                {
                    System.out.println(true);
                }
            }
        }

        // PRINTING ARRAY WITH FOR EACH LOOP
        for(String[] each1 : arr2D)
        {
            for(String each2 : each1)
            {
                System.out.print(each2);
            }
        }
        System.out.println();

        // CREATE AN ARRAY TO PRINT EVEN NUMBERS FROM 1 TO 100 INCLUSIVE
        int[] arr4 = new int[101];
        String str11 = "";
        for(int i = 1 ; i<=100 ; i++)
        {
            arr4[i]=i;
            if(arr4[i]%2==0)
            {
                str11 += arr4[i] + " ";
            }
        }
        System.out.println(str11);
        String[] arr5 = str11.split(" ");
        System.out.println(Arrays.toString(arr5));

        // COMMON QUESTIONS
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // find the longest/shortest String in an array
        // ascending in order
        // descending in order
        // find max/min value
        // find second max/min value
        // find unique value
        // find duplicated values and remove duplicates
        // find how many time each value is duplicated
        // make fibonacci series
        //








    }
}