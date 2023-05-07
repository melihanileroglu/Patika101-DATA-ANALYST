import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        double tutar,kdvOran=0.18, kdvOrani, kdvTutar,kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını giriniz : ");

        tutar = input.nextDouble();

        kdvOrani=(tutar<1000 && tutar>0) ? 0.18:0.08;
        System.out.println("KDV Oranı:" + kdvOrani);
        kdvTutar = tutar*kdvOrani;
        System.out.println("KdvTutarı:" + kdvTutar);
        kdvliTutar = kdvTutar+tutar;
        System.out.println("KDVli Tutar:" + kdvliTutar);



    }
}
