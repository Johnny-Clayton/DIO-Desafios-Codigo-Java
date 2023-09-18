package Desafio.Codigo_03;
import java.util.Scanner;

public class CalcCustosAWSResCurta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double custoPorHoraServidor = 0.15, custoPorHoraBancoDados = 0.05;
        int quantidadeServidores = scanner.nextInt(), quantidadeBancosDados = scanner.nextInt();

        double custoTotal = (quantidadeServidores * custoPorHoraServidor) + (quantidadeBancosDados * custoPorHoraBancoDados);

        System.out.printf("Custo total de uso da AWS por hora: R$ %.2f%n", custoTotal);
        scanner.close();
    }
}
