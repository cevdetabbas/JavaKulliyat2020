package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Ex
{
    public static void main(String[] args)
    {
        Predicate<Integer> oddnumber = p -> p % 2 == 1;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.removeIf(oddnumber);
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Murtaza", "Mohammet", "bilal", "Erdogan"));
        Predicate<String> startsWithM = p -> p.toLowerCase().startsWith("m") || p.startsWith("E");
        list2.removeIf(startsWithM);
        System.out.println(list2);

        ArrayList<Character> charlist = new ArrayList<>();
        charlist.addAll(Arrays.asList('1','2','A','b','!'));
        Predicate<Character> digits = p -> p>=48 && p<=57;
        charlist.removeIf(digits);
        System.out.println(charlist);

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        list3.removeIf(p-> p>3);
        System.out.println(list3);




    }
}
