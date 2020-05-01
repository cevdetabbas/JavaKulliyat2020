import java.util.*;
public class J04_Loops
{
    public static void main(String[] args)
    {
        // LOOPS
// loops allows you to execute commands as many time as you need to.
// looplar bir komutu istenen miktar kadar asmaya yarar.
// There are three types of loop are there in java WHILE LOOP DO WHILE LOOP	FOR LOOP



        //  WHILE LOOPS
// while loop helps you out to repeat processes as many times as you want
// each loop has initialization termination and increment/decrement method
// While parantexinin icindeki condition dogru oldugu surece repeadetly executes same set of statements as long
// as the condition is true. once it is true it stops. each repetition of the loop called iteration of the loop
// you can manually break the loop with an if statement if you need.
        int a = 1; // bu baslangic deger
        System.out.println(" 1 den 10 a kadar dongu baslasin");
        while (a<=10)   // bu son deger
        {
            System.out.println("tekrar number " + a); // buda yazdirilacak metin
            a++;    // bu da artis miktari
        }
        System.out.println("Dongu Tamamlandi");
        System.out.println("_______________________________________________________________");

        int b=0;
        System.out.println("dongu 1 den 10 a kadar cifter cifter");
        while (b<=10)
        {
            System.out.println("current value " + b);
            b+=2;                                                       // artis sayisi 2
        }
        System.out.println("cifter dongu tamamlandi");
        System.out.println("_______________________________________________________________");

        int c=0;
        System.out.println("dongu 1 den 10 a kadar ucer li");
        while (c<=10)
        {
            System.out.println("current value " + c);
            c+=3;                                                       // artis sayisi 3
        }
        System.out.println("ucerli dongu tamamlandi");

        // NESTED WHILE
//  while in icine while yazilabilir ama ne gerek var.
        int aa = 0;
        int bb = 0;
        while (aa<10 && bb < 10)
        {
            while (aa<10 &&bb < 10)
            {
                System.out.println("aa = " + aa + " bb= " + bb);
                bb++;
            }
        }


        // FAKTORIYEL HESABI
        System.out.println("Faktoriyel Hesaplamaya Hosgeldiniz \n lutfen faktoriyelini hesaplamak istediginiz sayiyi girin ");
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        int e=1;
        int result = 1;
        while (e<=d)
        {
            System.out.println(result=result*(e));
            e+=1;
        }

        // N E KADAR OLAN SAYILARIN TOPLAMININ HESABI
        System.out.println("Faktoriyel Hesaplamaya Hosgeldiniz \n lutfen faktoriyelini hesaplamak istediginiz sayiyi girin ");
        Scanner input2 = new Scanner(System.in);
        int d2 = input.nextInt();
        int e2=1;
        int result2 = 0;
        while (e2<=d2)
        {
            System.out.println(result2=result2+e2);
            e2+=1;
        }

        // DO WHILE LOOPLARI
// bunun olayi run the command do it first then check the condition.
// Nobody knows why we need do while loops since nobody use this.
// it exexutes do statement whatever the condition  then checks for while if it is valid does it if it is not // valid it does not do it.
// As I understand it gives a last , ending value for a loop for example

        int n = 10;

        do
        {
            System.out.println("n = " + n);
            n--;
        }
        while( n>0 );  					// zaten while in icinde bi statement yok ; ile bitiyo
        int apples= 1;
        do
        {
            System.out.println("eat an apple "+apples);
            apples++;
        }
        while(apples<=10);                                  // bu zaten valid bir statement normal while gibi calisir

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int apples2= 1;
        do
        {
            System.out.println("eat an apple "+apples2);
            apples2++;                                      // simdi bu invalid oldugu icin sadece 1 kere do yapti bitti
        }
        while(apples2>=10);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //eger sayilari sirayla birerli artirmak istesek

        int BaslangicDegeri = 0;
        int BitisDegeri = 14;

        do {
            System.out.println("saymaya basla su anki sayi " + BaslangicDegeri);
            BaslangicDegeri+=1;
        }while(BaslangicDegeri<=BitisDegeri);

        //eger sayilari sirayla birerli azaltmak istesek

        int BaslangicDegeri2 = 8;
        int BitisDegeri2 = 0;

        do {
            System.out.println("saymaya basla su anki sayi " + BaslangicDegeri2);
            BaslangicDegeri2-=1;
        }while(BaslangicDegeri2>=BitisDegeri2);

        // belli bir kere bir string i yazdirmak istese
        int TekrarSayisi=5;
        String s12 = "Cevo";
        do {
            System.out.println(s12);
            TekrarSayisi-=1;
        } while (TekrarSayisi>0);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // FOR LOOPS
// loop larin olayi bu nssil kullaniliyo for (initialization ; condition ; updates ){statement};}
// for dan sonra parantezin icine once baslangic degeri sonra ; sonra bitis degeri ; artis miktari
// forun icine (initializatoin ; condition ; updates ) {...do this again and again}
        for(int ii = 0; ii<5 ; ii++) System.out.println("cevo");
        // alt alta degil de yan yana yazdirmak istesen
        for (int i3=0;i3<6;i3++) System.out.print(i3+ ", ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int[] ints = {1,2,3,4,5,6,7};
        for(int item:ints)
        {
            System.out.println("items : "+ item);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int[] ints2 = {1,2,3,4,5,6,7};
        for(int item2:ints2)
        {
            System.out.print(", "+ item2);
        }
        System.out.println("bitti");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int[] ints3 = {1,2,3,4,5,6,7};
        System.out.print("even numbers are in the array");

        for(int item3:ints3)
        {
            if(item3%2==0) System.out.print(item3 + " ");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // bu example da if any string given found in the array for is going to break the loop with an if statement
        String[] strs = {"aaa","bbb","ccc","ddd","asdf","qwer","skldfjskjdlf"};
        for (String letter: strs)
        {
            if(letter.contains("ddd"))
            {
                System.out.println("ddd found breaking the loop");
            }
            System.out.println(letter + " ");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //NESTED lOOPS
// Ic ice loop demektir bu mevzuu cok su goturur iki farkli loop yapip run etmek bakalim
        for ( int i = 0 , j = 0 ; i<5 && j<5 ; i++ , j++)
        { System.out.println(" i = " + i + " ote yandan j = " + j ); }
// ic ice for donguleride yazilabilir

        for ( int i = 0 ; i<5 ; i++)
        {
            for ( int j=0 ; j<5 ; j++)
            {
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        // FOR EACH OR ENHANCED FOR OR FOR ALL LOOPS
//   bu mevzuu on numero bir olaydir ki arraylerle yuz goz olurken herseferinde increment decrement first value
//   artis miktari felan ugrasmazsin bu demektirki her bir item a yardir aga herbir item icun yap bunu.
//   do something for each element
//   syntax format
//        for (dataType) item:colletion)
//        {
//            vhatever the thing you want to do with collection;
//        }

//  for example her bir item i yazdirmak icun
        int[] array1 = {1,2,3,4,5};
        for (int item : array1)
        {
            System.out.print(item);
        }
//        output is 12345

// in this situation there is no infinite array or loop.
// for each loop it has some limitation for example you can not change each items value using this method
// you still need to use old increment method to do it.

        //  BREAK AND CONTINUE
// break donguyu kirar sona erdirir. bunu zaten daha once switch statementlarda kullandik
// continue o conditionu es gecer pass gecer basa tekrar doner. mesela
        while (true)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Gauss Methodu Programina Hosgeldiniz. \nBu program girdiniz sayidan 0 akadar olan sayilarin toplamini verir. \nSimdi luften toplamlarini bulmak istediginiz sayiyi girin.");
            int a1 = scan.nextInt();
            if(a1==0)
            {
                System.out.println("Programdan Cikiliyor");
                break;
            }
            if(a1!=0)
            {
                int result1 = 0;
                result1 = a*(a+1)/2;
                System.out.println(" 0 dan " + a + " ya kadar olan sayilarin toplami " +result + "\nYeni bir islem yapmak icin 1 e cikmak icin 0 a basin");
                int b1 = scan.nextInt();
                if (b1==0) {System.out.println("Programdan Cikiliyor"); break;}
                else continue;
            }
        }

        //  CONTINUE
// break donguyu kirar sona erdirir. bunu zaten daha once switch statementlarda kullandik
// continue o conditionu es gecer pass gecer basa tekrar doner. mesela ornek ugursuz 13 te oldugu gibi
// bu dongude 0 dan 15 e kadar olan sayilari yazdiracam ama 13 u istemiyom ordada iste if le 13 e esit
// oldugunda donguye devam et bekleme yapma burada diyecem

        for (int i = 0 ; i <=15 ; i++)
        {
            if(i==13)				// burda sadece 13 degil || ile 7 yi hatta 2 yi bile ugursuz yapabiliriz.
            {
                continue;
            }
            System.out.println("i nin su anki degeri = " + i );
        }
        System.out.println("dongu bitti");


    }
}