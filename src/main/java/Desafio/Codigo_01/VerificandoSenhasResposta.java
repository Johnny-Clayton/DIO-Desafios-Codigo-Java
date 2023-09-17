package Desafio.Codigo_01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class VerificandoSenhasResposta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha = scanner.nextLine();

        String resultado = verificarForcaSenha(senha);
        System.out.println(resultado);
    }

    public static String verificarForcaSenha(String senha) {
        int comprimentoMinimo = 8;

        boolean temLetraMaiuscula = Pattern.compile("[A-Z]").matcher(senha).find();
        boolean temLetraMinuscula = Pattern.compile("[a-z]").matcher(senha).find();
        boolean temNumero = Pattern.compile("\\d").matcher(senha).find();
        boolean temCaractereEspecial = Pattern.compile("[!@#$%^&*(),.?\":{}|<>\\*]").matcher(senha).find();

        if (senha.length() < comprimentoMinimo)
            return "Sua senha é muito curta. Recomenda-se no mínimo 8 caracteres.";

        if (!temLetraMaiuscula || !temLetraMinuscula || !temNumero || !temCaractereEspecial)
            return "Sua senha não atende aos requisitos de segurança.";

        return "Sua senha atende aos requisitos de segurança. Parabéns!";

    }
}
