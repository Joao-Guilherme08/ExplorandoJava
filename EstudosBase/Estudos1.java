import java.util.regex.MatchResult;
import java.util.Scanner;

public class Estudos1 {
    public static void main(String[] args) {

        // 3.VARIAVEIS LOCAIS

        class Exemplo {
            public void somar() {
                // Variáveis locais (existem só dentro do método)
                // São variáveis declaradas dentro de métodos, visíveis apenas dentro deles.
                // a, b e resultado existem apenas durante a execução do método somar().

                // Fora desse método, elas não podem ser acessadas.

                int a = 5;
                int b = 10;
                int resultado = a + b;

                System.out.println("Resultado: " + resultado);
            }
        }
        System.out.println("metodo somar");

        Exemplo estudosExemplo = new Exemplo();
        estudosExemplo.somar();

    }
}
