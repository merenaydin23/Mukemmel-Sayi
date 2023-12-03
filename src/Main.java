import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mükemmel Sayi Tespit Programına Hoş Geldiniz");
System.out.println("Kendisi hariç pozitif tam bölenleri toplamı sayının kendisine eşitse Mükemmel Sayıdır");
        Scanner klavye=new Scanner(System.in);
        int kalan=0,sayi=0;
 do {
     System.out.println("Sisteme incelenecek sayıyı girin");
     sayi= klavye.nextInt();
 }while (sayi<=1);
 int top=0;
 for (int i=1;i<=sayi-1;i++){
     kalan=sayi%i;
     if (kalan==0){
         top=top+i;
     }
 }
if (sayi==top){
    System.out.println("Mükemmel Sayıdır");
}
else {
    System.out.println("Mükemmel Sayı değildir");
}





















    }
}