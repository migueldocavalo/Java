import java.util.Scanner;

public class ConversaoMoeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em reais: ");
        double r = sc.nextDouble();

        System.out.print("Digite a cotação do dólar: ");
        double d = sc.nextDouble();

        double v = r / d;
        System.out.println("O valor equivalente em dólares é: " + v);

        sc.close();
    }
}
