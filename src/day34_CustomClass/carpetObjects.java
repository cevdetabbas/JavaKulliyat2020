
package day34_CustomClass;

import java.util.ArrayList;
import java.util.Collections;

public class carpetObjects
{
    public static void main(String[] args)
    {
        carpet c1 = new carpet(1,221,133.3,true);
        carpet c2 = new carpet(2,222,233.3,false);
        carpet c3 = new carpet(3,223,333.3,true);
        carpet c4 = new carpet(4,224,433.3,false);
        carpet c5 = new carpet(5,225,533.3,true);

        carpet[] arrCarpet = new carpet[]{c1,c2,c3,c4,c5};
        ArrayList<carpet> persianCarpets = new ArrayList<>();
        ArrayList<carpet> regularCarpets = new ArrayList<>();

//        for(carpet each : arrCarpet)
//        {
//            if(each.isPersian==true)
//            {
//                persianCarpets.add(each);
//            }
//            else
//            {
//                regularCarpets.add(each);
//            }
//        }
        for(carpet each : persianCarpets)
        {
            System.out.println(each);
        }
        System.out.println(persianCarpets.size());
        System.out.println(regularCarpets.size());
        double totalCost = 0;
        for (carpet each : arrCarpet)
        {
            totalCost+=each.calcCost();
        }
        System.out.println(totalCost);
        double totalCostOfPersianCarpets = 0;
        for (carpet each : persianCarpets)
        {
            totalCost+=each.calcCost();
        }
        System.out.println(totalCost);
    }
}
