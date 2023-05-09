import java.util.Scanner;
public class VücutKitle {
    public static void main(String[] args) {
        double kilo,boy,vücut;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kilo = input.nextDouble();

        vücut = kilo/(boy*boy);
        System.out.print("Vücut Kitle İndeksiniz : " + vücut);





    }
}
