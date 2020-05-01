import java.util.Scanner;

public class J02_ScannerClass
{
    public static void main(String[] args)
    {
        // SCANNER OBJECT
//  kullanicidan input almak icun kullanilir. int veya string kullanicidan girmesi istenebilir.
//  fekat bunu yapabilmek icun java.util.Scanner in import edilmesi icab eder
//  import java.util.Scanner;
//  daha sonra class in ismi neyse o
        //  DECLERATION
// scanner object i create etmemiz lazim object in ismi input yada scan artik meyse
        Scanner input; 		// bunlari actiysan kapamak iktiza edebilir oda
        input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);			// input.close();
// bundan kelli kullanicidan bisey isteyebiliruk
//mesela string
        String a = input.nextLine(); // bu entera basana kadar olanki stringi alir
        String b = input.next(); // bu sadece bosluga kadar olanki stringi alir
        int c = scan.nextInt();
//bu sonraki satira kadar olan kismi input aliyo , input.next derse sonraki bosluga kadar alir
//yada int
        double d = input.nextDouble();
// double yada herhangi baska bir ayni variable istenebilur.

    }
}