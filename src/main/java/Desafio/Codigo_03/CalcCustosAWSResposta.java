package Desafio.Codigo_03;

import java.util.Scanner;

public class CalcCustosAWSResposta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double custoPorHoraServidor = 0.15;
        double custoPorHoraBancoDados = 0.05;

        int quantidadeServidores = scanner.nextInt();
        int quantidadeBancosDados = scanner.nextInt();

        //TODO: Calcule os custos
        double custoServidores  = quantidadeServidores * custoPorHoraServidor;
        double custoBancosDados = quantidadeBancosDados * custoPorHoraBancoDados;
        double custoTotal = custoServidores + custoBancosDados;

        System.out.printf("Custo total de uso da AWS por hora: R$ %.2f%n", custoTotal);

        scanner.close();
    }
}
