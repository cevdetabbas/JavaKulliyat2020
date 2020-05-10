package day34_CustomClass;

public class CapitalOne
{


    public static void main(String[] args)
    {
        Tester tester1 = new Tester();
        tester1.setTesterInfo("kamil",123,"Manual Tester",120000);

        ScrumTeam scrumTeam1 = new ScrumTeam();
        scrumTeam1.hireTester(tester1);
        System.out.println(scrumTeam1.testerTeam.size());
        ////
        //
        /

    }
}
