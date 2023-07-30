import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        System.out.print("Kaç Elemanlı olmalı= ");
        int selectNumber = imp.nextInt();
        int baslangic=1;
        int sayac=0;
        for (int i=1; i<=selectNumber;i++)
        {
            int total= sayac+baslangic;
            System.out.println(sayac+" + "+ baslangic +" = "+total);
            sayac=baslangic;
            baslangic=total;
        }
    }
}