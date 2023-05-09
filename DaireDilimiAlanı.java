import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
        double r,merkez, pi = 3.14,alan;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Yarıçapı giriniz : ");
        r=input.nextDouble();

        System.out.print("Merkez Açının Ölçüsünü Giriniz : ");
        merkez=input.nextDouble();

        alan = (pi*(r*r)*merkez)/360;
        System.out.print("Daire diliminin alanı : "+ alan);


    }
}
