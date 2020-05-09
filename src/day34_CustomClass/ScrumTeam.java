package day34_CustomClass;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ScrumTeam
{
    ArrayList<Tester> testerTeam = new ArrayList<>();

    public void hireTester(Tester tester)
    {
        testerTeam.add(tester);
    }
    public void fireTester(long employeeID)
    {
        testerTeam.removeIf(p->p.employeeID==employeeID);
    }
}
