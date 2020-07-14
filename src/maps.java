import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class maps
{
/*
    DATA STRUCTURES
Array           : size fixed,   primitives & objects
Collection      : size dynamic, only objects
Map             : size dynamic, only objects

HashMap         : does not keep the insertion order, accepts null
HashTable       : is synchronized, thread safety, one thread at a time, slower, does not accept null
LinkedHashMap   : keeps the insertion order as it is, put and remove faster, accept null
TreeMap         : sort the keys in ascending, does not accept null.

*/
    public static void main(String[] args)
    {
        //  Map in icine iki tane data type konulabiliyormus ben uc denedim olmadi.
        Map<String, Double> myfirstmap = new LinkedHashMap<>();

        myfirstmap.put("kamil",10000.0);
        myfirstmap.put("mahmut",20000.0);
        System.out.println(myfirstmap);
        System.out.println(myfirstmap.size());
        System.out.println(myfirstmap.get(0));  // bunlar nedense null veriyo.
        System.out.println(myfirstmap.get(1));
        System.out.println(myfirstmap.get("kamil"));  //  bu ilk degere key value deniliyo get i onunla kullanmak lazim
        //  map ler matematikteki fonksiyonlar gibi key value, real value yi veriyo.
        //  amma keyler unique olmali, ustune yazmiyo yani aslinda direk ustune yaziyo.
        myfirstmap.remove("kamil");
        System.out.println(myfirstmap);
        myfirstmap.put("zalim",50000.0);
        System.out.println(myfirstmap);
        myfirstmap.put("zalim",30000.0);
        System.out.println(myfirstmap);
        System.out.println(LocalDate.now());
        LocalDate.of(1000,12,3);
        System.out.println(myfirstmap.containsKey("kamil")); //  bu eger key present mi diye bakiyo
        System.out.println(myfirstmap.containsValue("30000.0"));  //  bu value varmi diye bakiyo
        myfirstmap.isEmpty();
        //myfirstmap.clear();  //  buda butun mapi temizliyo siliyo icinde bisey birakmiyo tertemiz yapiyo
        System.out.println(myfirstmap);
        LinkedHashMap<String , Integer> fb = new LinkedHashMap<>();
        fb.put("kamil",12);
        fb.put("mahmut",13);
        fb.put("huseyin",11);
        fb.put("zalim",19);
        fb.put("salih",18);
        //  in order to print out all usenames there is a method
        fb.keySet();  //  this will retorun collection of the keys. all the keys with the help of for loop
        for(String eache:fb.keySet())
        {
            System.out.println("eache = " + eache);  // this will return all usernames
        }
        for(Integer each :fb.values())
        {
            System.out.println("each = " + each);
        }
        for(String each :fb.keySet())
        {
            if (fb.get(each)<13)
            {
                System.out.printf("13 un alti"+ each);
            }
            System.out.println("each = " + each);
        }
        fb.entrySet();

        //  Entry can be only applicable to maps
        //  if you want to get both value of key an its value you can use Entry interface.

        for(Map.Entry<String, Integer> each : fb.entrySet())
        {
            System.out.println(each.getKey());
            System.out.println(each.getValue());
        }







    }




}
