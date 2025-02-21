import java.util.Scanner;

public class VolumeEsfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        double r = sc.nextDouble();
      
        double volume = (4.0 / 3.0) * 3.14159 * r * r * r;
        System.out.println("O volume da esfera é: " + volume);

        sc.close();
    }
}
