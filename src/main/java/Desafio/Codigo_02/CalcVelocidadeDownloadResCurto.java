package Desafio.Codigo_02;
import java.util.Scanner;

public class CalcVelocidadeDownloadResCurto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distanciaServidores = scanner.nextDouble(), velocidadePlano = scanner.nextDouble();
        System.out.println("\nVelocidade de Download Estimada: " + String.format("%.2f", calcularVelocidadeDownload(distanciaServidores, velocidadePlano)) + " Mbps");
        scanner.close();
    }

    public static double calcularVelocidadeDownload(double distanciaServidores, double velocidadePlano) {
        return velocidadePlano / (1 + (distanciaServidores / 100));
    }
}
