package Desafio.Codigo_01;

import java.util.Scanner;
import java.util.regex.Pattern;

public class VerificandoSenhasCurto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(verificarForcaSenha(scanner.nextLine()));
    }

    public static String verificarForcaSenha(String senha) {
        if (senha.length() < 8)
            return "Sua senha é muito curta. Recomenda-se no mínimo 8 caracteres.";

        return Pattern.compile("[A-Z]").matcher(senha).find() &&
                Pattern.compile("[a-z]").matcher(senha).find() &&
                Pattern.compile("\\d").matcher(senha).find() &&
                Pattern.compile("[!@#$%^&*(),.?\":{}|<>\\*]").matcher(senha).find()
                ? "Sua senha atende aos requisitos de segurança. Parabéns!"
                : "Sua senha não atende aos requisitos de segurança.";
    }
}
