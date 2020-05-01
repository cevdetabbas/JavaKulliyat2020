public class J06_WrapperClass
{
    // WRAPPER CLASS
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// every primitives in java has a class that`s designed to it
// wrapper class i farkli yapan sey object olmasi yani alayi object
// wrapper class is dedicated to its primitives
//   | PRIMITIVES|(default values)|                     | WRAPPER CLASS|(default values)|
//   | byte      |      0         |                     | Byte         |      null      |
//   | short     |      0.0       |    auto-boxing      | Short        |      null      |
//   | int       |      0         | ================>>  | Integer      |      null      |
//   | long      |      0         |                     | Long         |      null      |
//   | float     |      0         |                     | Float        |      null      |
//   | double    |      0         | <<================  | Double       |      null      |
//   | boolean   |      false     |     unboxing        | Boolean      |      null      |
//   | char      |      ' '       |                     | Character    |      null      |
//   |           |                |                     | String       |      null      |
//
//  if you convert primitive to wrapper it is auto boxing
    int a = 10;
    Integer b = a; //boxing

    long c = 20L;
    Long d = c; // Auto-Boxing

    //  if you assign convert wrapper to primitive it is unboxing
    char ch1 = 'L';
    Character ch2 = ch1;    //boxing
    char ch3 = ch2 ;        //unboxing

    Character c4 = 'c';
    char c5 = c4;           //unboxing

    // wrapper class is dedicated to its primitives
    int a12 = 10;
    double b12 = a;
    // ammaa
    //Double b13 = a12; olmaz cunku double class only dedicated to double primitive.

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// WRAPPER CLASS METHODS
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// primitive classes does not have methods wrapper class does

    // MAX/MIN VALUE METHOD
    int maximum = Integer.MAX_VALUE; // this gives maximum value of primitive
    double maxdouble = Double.MAX_VALUE; // maximum value of double
    char maxchar = Character.MAX_VALUE; // max value of char
    byte maxbyte = Byte.MAX_VALUE; // max value of byte
    int minnum = Integer.MIN_VALUE; // min value of int

    // PARSE METHOD
// convert string values into primitives
// amma wrapper class lar dedicated tir yani only kendi primitivini kendi wrapperina cevirir.
// yani aslinda dusununce int.valueOf diye bi method yok yada double.valueOf degilde Integer.parseInt("123") var
    String str = "123"; int s1 = 12;
    int aa = Integer.parseInt(str);
    Integer num1 = Integer.parseInt("111"); // auto boxing
    int num22 = Integer.parseInt("122"); // none
    Short s2 = Short.parseShort("12");
    Double d3 = Double.parseDouble("12.3");
    Long l3 = Long.parseLong("12345");
    Float f1 = Float.parseFloat("12.34");
    Byte b1 = Byte.parseByte("123");
    Boolean b23 = Boolean.parseBoolean("true");  // this gives true  but ignores Case Sensitivity
    Boolean b35 = Boolean.parseBoolean("kalender"); // this gives false anything other than true gives false
    int aa11 = Byte.parseByte("10"); // gariptir hemde cok gariptir oluyo
    Integer bb11 = (int)Byte.parseByte("113");

//  VALUE OF METHOD
// converts String value to Wrapper class values
// it is case sensitive

    Integer a1 = Integer.valueOf("123");
    int z = Integer.valueOf("123"); // unboxing
    Integer zz = (int)Integer.valueOf("12345"); // auto-boxing


    public static void main(String[] args)
    {
        System.out.println();
    }

//
}