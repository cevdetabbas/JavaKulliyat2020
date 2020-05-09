package day34_CustomClass;

public class carpet
{
    int width;
    int length;
    double unitPrice;
    boolean isPersian;

    public carpet()
    {

    }
    public carpet(int width, int length, double unitPrice, boolean isPersian)
    {
        this.width=width;this.length=length;this.unitPrice=unitPrice;this.isPersian=isPersian;
    }
    public double calcCost()
    {
        if(isPersian)    {return width*length*unitPrice+200;}
        else             {return width*length*unitPrice;}
    }
    public String toString()
    {
        return "width="+width+" length ="+length+" unitprice="+unitPrice+" isPersian="+isPersian+" totalCost="+calcCost();
    }

}
