import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {


        double edge1, edge2, edge3;
        Scanner scan = new Scanner(System.in);

        System.out.println("Birinci kenarı giriniz = ");
        edge1 = scan.nextDouble();
        System.out.println("İkinci kenarı giriniz = ");
        edge2 = scan.nextDouble();
        System.out.println("Üçüncü kenarı giriniz = ");
        edge3 = scan.nextDouble();

        double u = (edge1 + edge2 + edge3) / 2;
        double perimeter = 2 * u;
        double area = u * (u - edge1)*(u - edge2)*(u - edge3);

        System.out.println("Üçgenin çevresi = " + perimeter);
        System.out.println("Üçgenin alanı = " + area);
    
    }
}
