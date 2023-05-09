import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        double armut = 2.14, elma=3.67,domates=1.11,muz=0.95,patlıcan =5.00,  kilo;
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg, toplam;

        Scanner input= new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        armutKg = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        elmaKg = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        domatesKg = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        muzKg = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlicanKg = input.nextDouble();

        toplam = (armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg) + (patlıcan * patlicanKg);
        System.out.print("Toplam tutar :"+ toplam + "TL'dir");




    }
}
