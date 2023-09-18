package Desafio.Codigo_05;

import java.util.*;

public class MonitorLogsAWSResCurta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine();
        Map<String, Long> eventosPorServico = new HashMap<>();

        for (int i = 0; i < quantidadeLogs; i++) {
            String servico = scanner.nextLine().split(",")[1];
            eventosPorServico.put(servico, eventosPorServico.getOrDefault(servico, 0L) + 1);
        }

        Map.Entry<String, Long> maxEntry = Collections.max(eventosPorServico.entrySet(), Map.Entry.comparingByValue());
        Map.Entry<String, Long> minEntry = Collections.min(eventosPorServico.entrySet(), Map.Entry.comparingByValue());

        System.out.println("Eventos por servico:");
        eventosPorServico.forEach((k, v) -> System.out.println(k + ":" + v));
        System.out.println("Maior:" + maxEntry.getKey());
        System.out.println("Menor:" + minEntry.getKey());

        scanner.close();
    }
}

