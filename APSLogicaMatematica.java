/*
 * VERIFICAÇÃO DE ACESSO - ACESSO SEGURO
 * 
 * Etapa 1: usuário insere a senha (p)
 * Etapa 2 é executada APENAS se a senha for correta:
 *    - Biometria facial (q) OU digital (r) E Confirmação do token recebido por e-mail (s)
 * 
 * Fórmula: p ∧ (q ∨ r) ∧ s
 */

import java.util.Scanner;

public class APSLogicaMatematica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String continuar = "sim";

        while (continuar.equals("sim")) {
            System.out.println("Bem-vindo(a) à plataforma Acesso Seguro!");
            System.out.println("Por favor, realize as etapas de verificação.");
            System.out.println("ETAPA 1 - Digite sua senha para acessar a plataforma:");
            String senha = teclado.nextLine();
            String senhaCorreta = "123456";

            if (senha.equals(senhaCorreta)) {
                System.out.println("Senha confirmada! Seguimos para a ETAPA 2.....");
                System.out.println("ETAPA 2 - Verificação biométrica e token");
                System.out.println("Seu reconhecimento facial foi confirmado? Responda com true ou false: ");
                boolean facial = teclado.nextBoolean();

                System.out.println("Sua digital foi confirmada? Responda com true ou false: ");
                boolean digital = teclado.nextBoolean();

                System.out.println("Você recebeu e confirmou o token por e-mail? Responda com true ou false: ");
                boolean token = teclado.nextBoolean();

                if ((facial || digital) && token) {
                    System.out.println("Acesso liberado! Bem-vindo(a), pode começar a utilizar a plataforma.");
                } else {
                    System.out.println("Acesso negado! Falha na biometria ou no token.");
                }
                teclado.nextLine();

            } else {
                System.out.println("Acesso negado! Senha incorreta.");
            }
            System.out.println("Deseja tentar novamente? (sim/não)");
            continuar = teclado.nextLine();
        }

        System.out.println("Encerrando o sistema. Até logo!");
        
        teclado.close();
    }
}
