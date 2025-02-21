import java.util.Scanner;

public class DistanciaEntrePontos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a coordenada x1 do primeiro ponto: ");
        double x1 = sc.nextDouble();

        System.out.print("Digite a coordenada y1 do primeiro ponto: ");
        double y1 = sc.nextDouble();

        System.out.print("Digite a coordenada x2 do segundo ponto: ");
        double x2 = sc.nextDouble();

        System.out.print("Digite a coordenada y2 do segundo ponto: ");
        double y2 = sc.nextDouble();
        double dx = x2 - x1;
        double dy = y2 - y1;

        double distanciaQuadrada = (dx * dx) + (dy * dy);
        double distancia = Math.sqrt(distanciaQuadrada); 

        System.out.println("A distância entre os pontos é: " + distancia);

        sc.close();
    }
}
