import com.sun.tools.internal.xjc.model.CBuiltinLeafInfo;

public class LastTopics
{
/*
    GARBAGE COLLECTION
- Destroys object. if a reference does not point any value.
- removal process of unreferenced objects.
- it is automatically done by jvm no additional effort needed.


- String        : immutable
- StringBuilder : mutable version of string char sequences, not synchronized.
- StringBuffer  : mutable version of string char sequences, synchronized, thread-safe, slow


- finalize()    : this method called automatically by garbate collector.

- enum          : is a custom dataType


 */
    public static void main(String[] args)
    {
       // GarbageCollector obj = new GarbageCollector();  //  muhtar bunu yapinca oluuyo ben yapinca olmuyo.
        StringBuilder str = new StringBuilder("haci ");
        str.append("abi");
        System.out.println("str = " + str); //  StringBuilder is mutable
        str.reverse();
        System.out.println("str = " + str);

        StringBuffer str2 = new StringBuffer("kamil ");
        str2.append("zaloglu");
        System.out.println("str2 = " + str2);

        Color c1 = Color.yellow;
        Color c2 = Color.blue;
        Color c3 = Color.green;
        Color c4 = Color.green;
    }
}
enum Color
{
    yellow, green, blue //  this means color only can be yellow green blue.

}
