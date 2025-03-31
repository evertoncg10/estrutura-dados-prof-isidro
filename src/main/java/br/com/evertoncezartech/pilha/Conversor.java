package br.com.evertoncezartech.pilha;

public class Conversor {
    public static void main(String[] args) {
        int numero = 172;
        Pilha pilha = new Pilha();
        int resto;

        //fase 1  = empilhamento dos restos
        while (numero != 0) {
            resto = numero % 2; // pego o resto da divisão deste número or 2 (vale 0 ou 1)
            pilha.push(resto); // Armazeno o resto na pilha
            numero = numero / 2; // Gero um novo número, resultado da divisão dele por 2
        }

        //fase 2 = exibição dos restos
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop()); // Remove da pilha (Sempre o que está no topo)
        }

        System.out.println("\nFim do programa");
    }
}

// (172)10 = (10101100)2
/**
* 172 / 2 = 86; resto = 0
* 86 / 2 = 43; resto = 0
* 43 / 2 = 21; resto = 1
* 21 / 2 = 10; resto = 1
* 10 / 2 = 5; resto = 0
* 5 / 2 = 2; resto = 1
* 2 / 2 = 1; resto = 0
* 1 / 2 = 0; resto = 1
 **/


