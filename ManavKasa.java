import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tutar,elma, armut, muz,patlican, domates;

        System.out.println("----Meyvelerin fiyatları-----");
        System.out.println("Armut : 2,14 TL");
        System.out.println("Elma : 3,67 TL");
        System.out.println("Domates : 1,11 TL");
        System.out.println("Muz: 0,95 TL");
        System.out.println("Patlıcan : 5,00 TL");

        System.out.print("Armut Kaç Kilo ?: ");
        armut = sc.nextDouble();

        System.out.print("Elma Kaç Kilo ?: ");
        elma = sc.nextDouble();

        System.out.print("Domates Kaç Kilo ?: ");
        domates = sc.nextDouble();

        System.out.print("Muz Kaç Kilo ?: ");
        muz = sc.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ?: ");
        patlican = sc.nextDouble();

        tutar = (armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.00);
        System.out.print("Toplam Tutar= " +tutar +"TL");

    }
}
