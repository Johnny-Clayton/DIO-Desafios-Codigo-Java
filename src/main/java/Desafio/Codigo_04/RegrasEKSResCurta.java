package Desafio.Codigo_04;

import java.util.Scanner;

public class RegrasEKSResCurta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroTotalPods = scanner.nextInt(), podsPorNode = 10, podsPorServidor = 4;
        int numeroMinimoNodes = (int) Math.ceil((double) numeroTotalPods / podsPorNode), numeroMinimoServidores = (int) Math.ceil((double) numeroTotalPods / podsPorServidor);

        System.out.println("1." + (numeroMinimoNodes <= 1 ? "Recomendamos usar um unico node" : "Numero minimo de nodes:" + numeroMinimoNodes));
        System.out.println("2." + (numeroMinimoServidores <= 1 ? "Recomendamos usar um unico servidor" : "Numero minimo de servidores:" + numeroMinimoServidores));
        scanner.close();
    }
}
