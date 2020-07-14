import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.util.jar.JarOutputStream;

public class iterator
{
    public static void main(String[] args)
    {

//  in order to remove an object from a list you need to use iterator since for loops does not work.
//  either you use predicate or you use iterator.


        String[] arr = {"1","2","3","4","3","2","6","7","1"};

        List<String> sl = new ArrayList<>(Arrays.asList());
        sl.addAll(Arrays.asList(arr));

        System.out.println(sl);

        for(int i = 0 ; i< sl.size();i++)
        {
            if(sl.get(i)=="3")
            {
                sl.remove(i);
            }
        }
        System.out.println(sl);

        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(1,1,2,3,2,3,3,4,5,4,5,6,7,18));
        System.out.println("l2 = " + l2);
        for(int i = 0; i<l2.size(); i++)
        {
            if(l2.get(i)<Integer.parseInt(String.valueOf(i)))
            {
                l2.remove(i);
            }
        }
        System.out.println("l2 = " + l2);

        //for(int i = 0 ; i<l2.size();i++)

            l2.removeIf(p->p<4);

        System.out.println("l2 = " + l2);

        Iterator<Integer> it = l2.iterator();

        while(it.hasNext())
        {
            Integer s = it.next();
            if(s<6)
            {
                it.remove();
            }
        }
        System.out.println(l2);

        String[] arr1 = {"ali","kamil","mahmut","ali","hakki","mahmut","cevo"};
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr1));
        System.out.println(list1);
        Iterator<String> itt = list1.iterator();

        for(Iterator<String> I = list1.iterator(); I.hasNext(); )
        {
            String s = I.next();
            if(s.contains("m")||s.contains("k"))
            {
                I.remove();
            }
        }
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr1));
        System.out.println("list2 = " + list2);
        list2.removeIf(p->p.contains("m")||p.contains("k"));
        System.out.println("list2 = " + list2);
        list2.removeAll(Arrays.asList("ali"));
        System.out.println("list2 = " + list2);
        list2.addAll(Arrays.asList("zalim","cevo","kamil","hasan","veli","ali","deli"));
        System.out.println("list2 = " + list2);
        Set<String> list2set = new HashSet<String>(list2);
        System.out.println("list2set = " + list2set);
        Set<String> list3set = new LinkedHashSet<>(list2);
        System.out.println("list3set = " + list3set);
        Set<String> list4set = new TreeSet<>(list2);
        System.out.println("list4set = " + list4set);



    }
}
