package day33_CustomClass;

public class CarObjects
{
//  burada main methodun icinde ojbectleri olusturacaz

    public static void main(String[] args)
    {
        //  object olustururken bir class i baz almamiz lazim ordan variable lari cekecegiz
        CarDataAction car1 = new CarDataAction();  // burda new ile bir object olusturduk ve onu CarDataAction dan cektik
        CarDataAction car2 = new CarDataAction();  // burda new ile bir object olusturduk ve onu CarDataAction dan cektik
        CarDataAction car3 = new CarDataAction();  // burda new ile bir object olusturduk ve onu CarDataAction dan cektik
        CarDataAction car4 = new CarDataAction();  // burda new ile bir object olusturduk ve onu CarDataAction dan cektik
        CarDataAction car5 = new CarDataAction();  // burda new ile bir object olusturduk ve onu CarDataAction dan cektik
        //  simdi bu car i define edecez specifically
        car1.Brand="Ford";      car2.Brand="Honda";     car3.Brand="Merso";   car4.Brand="Honda";
        car1.Model="Mustang";   car2.Model="Fit";       car3.Model="X5";      car4.Model="Accord";
        car1.year=1967;         car2.year=2006;         car3.year=2016;       car4.year=2012;
        car1.color="black";     car2.color="silver";    car3.color="red";     car4.color="blue";
        //  butun field lari kullanarak yada data lari kullanarak object imizin value larini verdik simdi bastiralim
        System.out.println(car1.Brand+" "+car1.Model+" "+car1.year+" "+car1.color);
        //  aslinda bunlari teker eker assign etmektense bir method yazip tekten niye yapmiyoruz hadi obur class ta
        //  bir method yazalim tek satirda isi halledelim
        car5.setCarInfo("tofas","sahin",2001,"white"); // bu nu yazarken luzumsuz bir
        //  amelelik yapip consturctor yapmadik onun yerine bir instance method yazdik bir de constructorla yapalim
        //  ama yukardaki objectler hata verdi cunku constructor in olayi bu object create ederken ona gore etmek lazim
        //  bunu onlemek icin de bir constructor daha defaul constructor olusturabiliriz her iki sekildede yapmak icin
        //  yani overload edelim constructor u


        //  simdi CarDataAction classina donup orada bir takim action lar initialize edelim
        //  start stop action larini create ettik burda onlari specific bir oject uzerinden cagirmamiz lazim mesela
        car1.start();  // olusturdugumuz method void oldugu icin sout yazmaya gerek yok ama return lu olsaydi baska
        System.out.println(car1.stopped()); //  method void olmadigi icin sout la cagirmak lazim
        System.out.println(car2.stopped()); //  methodu herhangi bir object icin cagirabiliriz
        car2.getCarInfo();                  //  tamam iste kafana gore actilari objectleri kullanip cagirabilirsin
        //  ornekler sinirsiz fekat bur da bir degisik mevuzuu var elemanin yaptigi
        //  objectleri bir arrayin icine store ediyo garip du bakalim bi yapalim bizde
        //  simdi objectlerden olusan bir array create etmek icin String veya Integer kullanamayiz nasil olcak o zaman
        //  object leri create ettigimiz class in ismini kullanarak bir array olusturabiliriz. soyle ki
        CarDataAction[] arrCars = {car1,car2,car3,car4};  // de dersiniz hos olmadimi simdi arrCars[0] felan diyip ha
        System.out.println(arrCars[0]);  //  biz bunu boyle direk cagiramayzi neden cunku object oyle ne diyecek ki
        System.out.println(arrCars[0].color);
        arrCars[1].start();
        car2.start();       // ayni sey, pek useful gorunmuyo amma mesela butun arablarin info sunu tekten almak dersek
        System.out.println("_________________________________________________________________________________________");
        for(CarDataAction each : arrCars) // once dataType sonra each sonra : sonra arrayin ismi
        {
            each.getCarInfo();
        }
        System.out.println("__________________________________________________________________________________________");
        //  simdi burda son bir mevzuu var toString methodu eger bir object i direk sout la bastirmak istiyorsak
        //  onu overload etmemiz lazim sonra o objectin neyi nasil yazdirmasini istiyorsak oylece cikarir yoksa hashcode
        System.out.println(car1);

    }








}
