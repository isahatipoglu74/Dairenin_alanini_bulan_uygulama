import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner inp=new Scanner(System.in);


      double r,aci,pi=3.14;
        System.out.print("Dairenin yariçapini giriniz=");
        r=inp.nextDouble();
        System.out.print("Merkez açısının ölçüsünü giriniz=");
        aci=inp.nextDouble();
        System.out.print("Merkez açısının ölçüsü "+aci+" derece olan dairenin alanı="+((pi*r*r*aci)/360));





    }
}