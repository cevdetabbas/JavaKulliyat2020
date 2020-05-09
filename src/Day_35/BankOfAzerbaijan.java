package Day_35;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAzerbaijan
{
    //	3. create class called BankOfAzerbaijan
//        in the main method:
//        1. create a List of Employees
//				2. add random two employees from HumanResources to the List
//				3. use for each loop to print out the employee info
//				4. now go back to HumanResources class and comment out the static block
//				5. repeat the step 3 to print out the employee info to compare it with previous output

    public static void main(String[] args)
    {
        BankOfAzerbaijan emp = new BankOfAzerbaijan();

        ArrayList<Employee> list1 = new ArrayList<>(Arrays.asList(HumanResources.emp1));
        list1.add(HumanResources.emp3);
        for(Employee each : list1)
        {
            System.out.println(each);
        }
        HumanResources obj2 = new HumanResources();

    }

}
