public class J10_CustomClass
{
    //  CUSTOM CLASS
//  iste kafana gore class oluturuyon
    public static class AttributesActions // bu galiba subclass oluyor // biz constructor olustururken bu ismi kullanacaz
    {
        // INSTANCE VARIABLE
//  created outside methods, within the class (object)
//  we mainly use storing datas into objects it belongs to the objects, properties of objects.
//  it is also called fields
//  local created within the methods. not visible to other methods. can be used within the method
//  bir classin icindeki method lardan hicbirine dahil olmayan variable lara instance variable denir
//  bunlari baska classlarin altinda kendi classinin ismini kullanarak cagirabiliyoruz
//  yada bunlari kullanarak bir constructor yapabiiriz amma orda variable i cagirirken this kullanmak lazim
//  eger ayni isim vereceksen variable a constructor in icinde bu variable lari this ile cagirmak lazim
        String EmployeeName = "kamil";
        int EmployeeID;
        String JobTittle;
        long SSN;
        String Gender;
        double Salary;

        //  INSTANCE METHOD
//  mothods that does not have static specifier but do have return type.
//  iste kafana gore bi method yazarsan constructor degilse yani classin adini tasimiyosa instance method oluyor
//  yada galiba void li olmasi lazim en azindan return felan sikinti gibi
        public void WhatDoesItDo()
        {
            System.out.println(EmployeeName+" science ogretiyor");
        }

        public void GetInfo()
        {
            System.out.println("Employee Name "+EmployeeName+", ID "+EmployeeID+", JobTittle "+JobTittle+", SSN "+SSN+", Gender "+Gender+", Salary "+Salary);
        }

        //  CONSTRUCTOR METHOD
//  hic bir sey yapmasan zaten kendi bir default constructor olusturuyo fekat
//  eger ki default value li bir constructor olursturmak istesen o vakit default constructori kendin yazman gerek
//  mesela
        public AttributesActions() // set up default values for attributes of the class
        {
            EmployeeName="kamil";
            EmployeeID=000;
            JobTittle="vasifsiz";
            SSN=111111111;

        }

    }
    public static void main(String[] args)
    {
        AttributesActions user1 = new AttributesActions();
        user1.EmployeeName = "hakki bulut";
        user1.EmployeeID = 12345;
        user1.JobTittle = "ogretmen";
        user1.SSN = 123456789;
        user1.Gender = "erkek";
        user1.Salary = 75000;
        System.out.println(user1.EmployeeName);
        user1.GetInfo();
        user1.WhatDoesItDo();
        AttributesActions user2 = new AttributesActions();
        user2.GetInfo();
    }

}