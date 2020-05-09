package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates
//  a program return the duplicated values from an ArrayList of String
{
    public static void main(String[] args)
    {
    ArrayList<String> list = new ArrayList<>(Arrays.asList("A","B","C","A","D","B","B","C","B","D","E","A","B"));
    String a ="";
        int k = 0;
    for (int i = 0 ; i<list.size(); i++)
    {
        int count = 0;

        for(int j = 0 ; j<list.size() ; j++)
        {
            if(j>i&&list.get(i).equals(list.get(j)))
            {
                list.remove(j);
                count+=1;
            }
        }
        if(count==2)
        {
            a+=list.get(i);
        }
    }


        System.out.println(a);




    }
}
