
interface downloadable
{
    boolean downloadable(); // public static final
    void download(); //  pulic abstract
}
interface AndroidApps extends downloadable
{
    String AppStoreName = "Android";
}
interface AppleApps extends downloadable
{
    String AppStoreName = "Apple";
}
abstract class Phone
{
    static String brand;
    String model;
    double price;
    String size;

    public abstract void texting(long phoneNumber);  //  if you do not specify abstract you have to give body to mehtod.
    public abstract void calling(long phoneNumber);
    public String toString()
    {
        return brand+" "+model+" "+price+" "+size+" ";
    }
}
final class iPhone extends Phone implements AppleApps
{

    static
    {
        brand = "iPhone";
    }

    public iPhone(String model, double price, String size) {
        this.model=model;
        this.price=price;
        this.size=size;
    }

    @Override
    public boolean downloadable() {
        return false;
    }

    @Override
    public void download() {
        System.out.println("apple is downloading from"+AppStoreName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Apple is testing to "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Apple is calling"+phoneNumber);
    }
    public void faceTiming(long phoneNumber)
    {
        System.out.println("apple is facetiming with"+phoneNumber);
    }
}

public class Polum
{
    public static void main(String[] args)
    {
        iPhone phone1 = new iPhone("x",1000,"medium");
        System.out.println(phone1);
    }
}
