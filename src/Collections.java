import Interface.Interface;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.*;

public class Collections
{
//  COLLECTION and ITERABLE
//  Data Structures: in order to manage the data efficiently and in an organized manner
//      --Array         size is fixed,  can be multi dimensional, has index number, accept duplicates.
//      --Collection    size is Dynamic consist of multiple interfaces, each has multiple implementations. java util
//      --Map

//  Iterable(I): root interface. super-type of all interfaces in collections framesork.

//  COLLECTION
//  Collection(I): extended by List, Set, Queue.
//      List: accepts duplicates implemented by ArrayList, LinkedList, Vector
//      Queue: does not have index number, size is dynamic, it accepts duplicates, first in first out. poll();
//      SET: it does not accept duplicates. does not have index number
//
//
//
//
//                                              COLLECTION
//      LIST                              |          SET                           |           QUEUE
//  --ArrayList(C)                        |  --HashSet                             |   --PriorityQueue
//      -each object are singly linked    |    -does not accept duplicates         |     -first in first out
//      -array based class                |    -it does not keep insertion order   |     -poll() removes first obj
//      -internally uses array            |    -does not have index numbers        |
//      -retrieving data is faster        |    -faster then linked hashset         |
//                                        |    -accepts null                       |
//  --LinkedList(C)                       |                                        |
//      -each object are doubly linked    |                                        |
//      -removing and adding are faster   |                                        |
//                                        |                                        |
//                                        |                                        |
//  --Vector(C)                           |  --LinkedHashSet                       |
//      -array based class                |     -it does not accept duplicates     |
//      -is synchronized                  |     -it keeps it ordered, sorted       |
//      -only prefered in multi-thread    |                                        |
//  ----Stack                             |                                        |
//      -array based class                |                                        |
//      -is synchronized                  |   --SortedSet                          |
//      -last in first out order          |   ---TreeSet                           |
//      -extends vector class             |     -does not accept null              |
//      -pop(): returns the last object   |     -sort the objects                  |
//              and removes it from stack |                                        |
//
//
//  syncronized: used for achieving thread-safety. it is thread safe but slow.
//
//
//
//
//
//
//
//
//
//
//
//
    public static void main(String[] args)
    {
        String[] arr = {"1","2","3","4","3","2","6","7","1"};
        List<Integer> arrList = new ArrayList();
        arrList.addAll(Arrays.asList(1,2,3,4,5,5,6,6,6,7,5,4,3,2,1,100));
        ArrayList<Integer> list1 = new ArrayList<>(new TreeSet<>(arrList));
        ArrayList<Integer> list2 = new ArrayList<>(new HashSet<>(arrList));
        ArrayList<Integer> list3 = new ArrayList<>(new LinkedHashSet<>(arrList));
        ArrayList<Integer> list4 = new ArrayList<>(new PriorityQueue<>(arrList));
        ArrayList<Integer> list5 = new ArrayList<>(new ArrayDeque<>(arrList));
        ArrayList<Integer> list6 = new ArrayList<>(new Vector<>(arrList));

        ArrayList<Integer> l1 = new ArrayList(Arrays.asList(arr));
        System.out.println(l1);
        LinkedHashSet<String> st = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println("st = " + st);
        TreeSet<String> ts = new TreeSet<>(Arrays.asList(arr));
        System.out.println("ts = " + ts);
        LinkedList<String> ll = new LinkedList<>(Arrays.asList(arr));
        System.out.println("ll = " + ll);
        Vector<String> vl = new Vector<>(Arrays.asList(arr));
        System.out.println("vl = " + vl);
        List<String> vll = new Vector<>(Arrays.asList(arr));
        System.out.println("vll = " + vll);
        List<String> sl = new Stack<>();
        sl.addAll(Arrays.asList(arr));
        System.out.println("sl = " + sl);
        String a = ((Stack<String>) sl).pop();
        System.out.println(a);
        System.out.println(((Stack<String>) sl).pop());
        System.out.println(list1);

        for(int i = 0 ; i< list1.size();i++)
        {
            if(list1.get(i)==3)
            {
                list1.remove(i);
            }
        }
        System.out.println(list1);


    }
}
