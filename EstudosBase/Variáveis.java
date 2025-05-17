// import java.util.regex.MatchResult;
// import java.util.Scanner;

public class Estudos {
 public static void main(String[] args) {
// MARATONA JAVA PORRA!!!

// PARTE 1 : Variáveis de Instância (Campos Não Estáticos)

// Cada objeto Bicicleta criado terá seus próprios valores de velocidade e
// marcha.
// Essas variáveis são chamadas de variáveis de instância ou campos de
// instância.

 class Bicicleta {
//  Variáveis de instância (não usam 'static')
 int velocidade;
 int marcha;

// Construtor
 public Bicicleta(int v, int m) {
 velocidade = v;
 marcha = m;
 }

 public void mostrarEstado() {
 System.out.println("Velocidade: " + velocidade + " | Marcha: " + marcha);
}

 }

 Bicicleta minhaBikeItau = new Bicicleta(2, 3);

 minhaBikeItau.mostrarEstado();

// -------------------------------------------------------------------------------------------//

// 2. Variáveis de Classe (Campos Estáticos)

// }
// Colocar o prefixo static para que seja tratada como classe superior e possa
// ser usada
// public static class Bicicleta {
// int velocidade;
// int marcha;

// // Variável de classe (compartilhada entre todas as bicicletas)
// static int numeroDeRodas = 2;

// public Bicicleta(int v, int m) {
// velocidade = v;
// marcha = m;
// }

// public void mostrarEstado() {
// System.out.println("Velocidade: " + velocidade + " | Marcha: " + marcha +
// " | Rodas: " + numeroDeRodas);
// }
// //Esse codigo tem que ser colocado na classe MAIN para poder rodar
// Bicicleta minhaBike = new Bicicleta(20, 30); // Instanciação dentro do método
// main
// minhaBike.mostrarEstado();

// }

// }
