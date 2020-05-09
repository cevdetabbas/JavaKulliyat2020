package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica
{
    public static void main(String[] args)
    {
        Tester tester1 = new Tester();
        Tester tester2 = new Tester();
        Tester tester3 = new Tester();
        tester1.setTesterInfo("kamil1",123,"Senior SDET",120000);
        tester2.setTesterInfo("kamil2",2123,"test",220000);
        tester3.setTesterInfo("kamil3",3123,"SDET",320000);
        ArrayList<Tester> testers = new ArrayList<>();
        testers.addAll(Arrays.asList(tester1,tester2,tester3));

        testers.removeIf(p->!p.jobTitle.contains("SDET"));
        for(Tester each : testers)
        {
            System.out.println(each);
        }
    }
}
