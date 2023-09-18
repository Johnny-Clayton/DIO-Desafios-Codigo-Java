package Desafio.Codigo_04;

import java.util.Scanner;

public class RegrasEKSResposta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroTotalPods = scanner.nextInt();
        int podsPorNode = 10;
        int podsPorServidor = 4;
        int numeroMinimoNodes = (int) Math.ceil((double) numeroTotalPods / podsPorNode);
        int numeroMinimoServidores = (int) Math.ceil((double) numeroTotalPods / podsPorServidor);

        System.out.println("1." + (numeroMinimoNodes <= 1 ? "Recomendamos usar um unico node" : "Numero minimo de nodes:" + numeroMinimoNodes));
        System.out.println("2." + (numeroMinimoServidores <= 1 ? "Recomendamos usar um unico servidor" : "Numero minimo de servidores:" + numeroMinimoServidores));

        scanner.close();
    }
}
