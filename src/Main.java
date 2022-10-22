import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14,deg,rad,aotc;
        Scanner circle = new Scanner(System.in);

        System.out.print("Lütfen Yarıçap Bilgisi Giriniz: ");
        rad = circle.nextDouble();

        System.out.print("Lütfen Açı Bilgisi Giriniz: ");
        deg = circle.nextDouble();

        aotc = (pi * (rad*rad) * deg) / 360;

        System.out.println("Dilimin Alanı: " + aotc);


    }
}
