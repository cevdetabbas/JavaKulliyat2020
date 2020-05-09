package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeros
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
        for(int i = 0 ; i<list.size(); i++)
        {
            if(list.get(i)==0)
            {
                list.remove(i);
                list.add(0);
            }
        }
        System.out.println(list);;
    }
}
