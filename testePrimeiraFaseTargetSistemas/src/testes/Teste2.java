package testes;

import java.util.Scanner;

public class Teste2 {
        public static int[] calculaFibonacci ( int n){
            int[] fib = new int[n];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i < n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            return fib;
        }

        public static boolean verificaFibonacci ( int n){
            int[] fib = calculaFibonacci(n);
            for (int i = 0; i < fib.length; i++) {
                if (fib[i] == n) {
                    return true;
                }
            }
            return false;
        }

        public static void main (String[]args){
            Scanner input = new Scanner(System.in);
            System.out.print("Digite um numero: ");
            int numero = input.nextInt();

            if (verificaFibonacci(numero)) {
                System.out.println(numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println(numero + " não pertence à sequência de Fibonacci.");
            }
        }
    }

