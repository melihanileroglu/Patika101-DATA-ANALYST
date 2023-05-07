import java.util.Scanner;

public class FirstHomework {
    public static void main(String[] args) {
        //Değişkenleri oluştur
        int mat,fizik,kimya,turkce,tarih,muzik;

        //Scanner sınıfı tanımlandı.
        Scanner input = new Scanner(System.in);

        //Kullanıcan değerleri al
        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();


        System.out.print("Fizik Notunuz: ");
        fizik= input.nextInt();


        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();


        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();


        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        int toplam = (mat+fizik+tarih+turkce+kimya+muzik);
        double sonuc = toplam/6.0;



        System.out.println("Ortalamanız: "+ sonuc);



    }
}



