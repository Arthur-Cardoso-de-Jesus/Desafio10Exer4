/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio10exer4;

import java.util.Scanner;

/**
 *
 * @author baung
 */
public class Desafio10Exer4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int ordem = 1, aN, razao, a1, termo = -1, n = 0;
        System.out.println("Informe o valor N(inteiro e possitivo)");
        n = ler.nextInt();
        for (int cont = 1; cont < n; cont++) {

            if (ordem % 2 == 0) {
                termo = termo + 5;
            } else {
                termo++;
            }
            ordem++;

        }
        System.out.println("Termo do numero "+n+" é:"+termo);
    }
}
