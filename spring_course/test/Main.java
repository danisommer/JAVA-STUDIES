import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }

    public static void operacoes(){
        double x = 3.0, y = 4.0, z = -5.0;

        System.out.println(Math.sqrt(x));
        System.out.println(Math.pow(y, 2.0));
        System.out.println(Math.abs(z));

    }

    public static void entradaESaida(){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);

        int y;
        y = sc.nextInt();
        System.out.println("Você digitou: " + y);

        double z;
        z = sc.nextDouble();
        System.out.println("Você digitou: " + z);

        char a;
        a = sc.next().charAt(0);
        System.out.println("Você digitou: " + a);

        int b;
        String s1, s2, s3;

        b = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Você digitou: ");
        System.out.println(b);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
