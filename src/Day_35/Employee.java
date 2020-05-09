package Day_35;

public class Employee
{
//    Task01:
//        1. Create a class called Employee
//        instance variables:
//    name, id, ssn, jobTitle, salary, gender
//    actions:
//    setEmployeeInfo(): can initialize all the instance variables
//    toString(): can return the info of the employee as string
//	2. create a class called HumanResources
//        declare 5 variables of Employee as static
//    use static block to:
//        1. initialize those static variables
//						2. set all the info of the Employees
//	3. create class called BankOfAzerbaijan
//        in the main method:
//        1. create a List of Employees
//				2. add random two employees from HumanResources to the List
//				3. use for each loop to print out the employee info
//				4. now go back to HumanResources class and comment out the static block
//				5. repeat the step 3 to print out the employee info to compare it with previous output

    String name;
    long id;
    long ssn;
    String jobTitle;
    double salary;
    String gender;

    public Employee(String name, long id, long ssn, String jobTitle, double salary, String gender)
    {
        this.name=name;  this.id=id;  this.ssn=ssn;   this.jobTitle=jobTitle;  this.salary=salary; this.gender=gender;
    }
    public Employee()
    {

    }
    public String toString()
    {
        return "Employee name = "+name+" if number = "+id+" ssn="+ssn+" jobtitle ="+jobTitle+" salary="+salary+" gender ="+gender;
    }


}
