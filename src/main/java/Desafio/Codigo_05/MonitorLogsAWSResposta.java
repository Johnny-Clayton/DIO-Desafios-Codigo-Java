package Desafio.Codigo_05;

import java.util.*;

public class MonitorLogsAWSResposta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine();

        Map<String, Long> eventosPorServico = new HashMap<>();
        for (int i = 0; i < quantidadeLogs; i++) {
            String[] parts = scanner.nextLine().split(",");
            String servico = parts[1];
            eventosPorServico.put(servico, eventosPorServico.getOrDefault(servico, 0L) + 1);
        }

        Map.Entry<String, Long> maxEntry = Collections.max(eventosPorServico.entrySet(), Comparator.comparing(Map.Entry::getValue));
        Map.Entry<String, Long> minEntry = Collections.min(eventosPorServico.entrySet(), Comparator.comparing(Map.Entry::getValue));

        System.out.println("Eventos por servico:");
        for (Map.Entry<String, Long> entry : eventosPorServico.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("Maior:" + maxEntry.getKey());
        System.out.println("Menor:" + minEntry.getKey());

        scanner.close();
    }
}
