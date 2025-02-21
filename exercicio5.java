import java.util.Scanner;

public class IdadeParaDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade em anos: ");
        int idade = sc.nextInt();

        int diasVividos = idade * 365;
        System.out.println("Você viveu aproximadamente " + diasVividos);

        sc.close();
    }
}
