package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques
//  remove dublicates from an array only unique objects
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));
        list1.removeIf(p-> Collections.frequency(list1,p)>1);
        System.out.println(list1);
    }
}
