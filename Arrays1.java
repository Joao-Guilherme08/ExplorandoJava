package com.estudos;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
       //ARRAYS 

       int []  anArray = {
        100, 200, 300,
        400, 500, 600,
        700, 800, 900, 1000
        };
         
        
        
         for (int array : anArray){
         System.out.println("Cor: " +  array);
        }

     // int[] idades = {25, 30, 22, 28};

     // int primeiraIdade = idades[0];
     // int terceiraIdade = idades[2];

     //idades[1] = 35; //muda o valor


     int [] [] ma = {

        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
     };

     int elemento = ma[1][0]; //elemento agora é 4 (segunda linha, primeira coluna)

     System.out.println("elemento é: " + elemento);

     //METODOS DE ARRAYS - Manipulação e Modificação:

     int [] numeros = {5,2,8,1,9};
     String[] nomes = {"Carlos", "Ana", "Beatriz"};
     int[][] matriz = {{1,2}, {3,4}};

     //fill(array, value): Atribui o valor especificado a todos os elementos do array. Existem sobrecargas para preencher partes específicas do array (fill(array, fromIndex, toIndex, value)).
     System.out.println("--- fill() ---");
     int[] preenchido = new int[5];
     Arrays.fill(preenchido, 10);
     System.out.println(Arrays.toString(preenchido));
     Arrays.fill(numeros, 1, 4, 20);
     System.out.println(Arrays.toString(numeros));  // Saída (antes era [5, 2, 8, 1, 9]): [5, 20, 20, 20, 9]

     //setAll(array, IntFunction<T> generator) (Java 8+): Define todos os elementos do array usando a função geradora fornecida. A função recebe o índice como argumento e retorna o valor a ser colocado naquele índice.
     //
     System.out.println("\n--- setAll() ---");

     int[] quadrados = new int[5];
     Arrays.setAll(quadrados, i -> i * i); // Define cada elemento como seu índice ao quadrado
     System.out.println(Arrays.toString(quadrados));

     //parallelSetAll(array, IntFunction<T> generator) (Java 8+): Similar a setAll, mas executa a operação em paralelo para potencialmente melhorar o desempenho em arrays grandes.
     //
     System.out.println("\n--- parallelSetAll() ---");
     int[] cubos = new int[5];
     Arrays.parallelSetAll(cubos, i -> i *i*i);
     System.out.println(Arrays.toString(cubos));

     
     //asList(array): Retorna uma lista de tamanho fixo apoiada pelo array especificado. As alterações na lista refletem no array e vice-versa 

     System.out.println("\n--- asList() ---");
     java.util.List<String> listaNomes = Arrays.asList(nomes);
     System.out.println(listaNomes);
     // listaNomes.add("Daniel"); // Isso lançaria UnsupportedOperationException pois a lista tem tamanho fixo

     //METODOS DE ARRAYS - Ordenação:

     //1)  sort(array): Ordena o array na ordem crescente. Existem sobrecargas para ordenar arrays de tipos primitivos e arrays de objetos (neste caso, os objetos devem implementar a interface

     System.out.println("\n--- sort() ---");

     int[] paraOrdenar = {5, 2, 8, 1, 9};
     Arrays.sort(paraOrdenar);
     System.out.println(Arrays.toString(paraOrdenar));
     Arrays.sort(nomes);
     System.out.println(Arrays.toString(nomes));
     Integer[] wrapperNumeros = {5, 2, 8, 1, 9,};

     Arrays.sort(wrapperNumeros, Comparator.reverseOrder()); 
     System.out.println(Arrays.toString(wrapperNumeros));


     System.out.println("\n--- parallelSort() ---");
     
     int [] paraOrdenarParalelo = {5, 2, 8, 1, 9};
     Arrays.parallelSort(paraOrdenarParalelo);
     System.out.println(Arrays.toString(paraOrdenarParalelo));


     System.out.println("\n--- binarySearch() ---");
     //Busca o valor especificado no array ordenado usando o algoritmo de busca binária. Retorna o índice do elemento encontrado ou um valor negativo se o elemento não estiver presente. Existem sobrecargas para diferentes tipos primitivos e para especificar um intervalo de busca.


     int [] ordenadoParaBusca = {1, 2, 5, 8, 9};
     int indiceOito = Arrays.binarySearch(ordenadoParaBusca, 8);
     System.out.println("Índice do 8: " + indiceOito); // Saída: 3
     int  indiceQuatro = Arrays.binarySearch(ordenadoParaBusca, 4);
     System.out.println(" índice do 4: " + ordenadoParaBusca);
     




     

























       
    }
}
