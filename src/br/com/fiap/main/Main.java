//CP de JAVA - 24/03/2026 - Pro.Gilberto
//Tárik Moussa Alma - RM: 571411
//Giovane Dias Chicoli - RM: 569750
//Fabricio Aquiles Sales da Silva - RM: 570985
package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

public class MainDespesaFamiliar {
    public static void main(String[] args) {
        DespesaFamiliar despesa = new DespesaFamiliar();
        float rendaFamiliar, gastoComLuz, gastoComAgua, gastoComInternet, valorMensalidadeDaAcademia,numeroDeMoradores;
        Scanner scan;
        try {
            scan = new Scanner(System.in);
            System.out.println("Digite sua renda familiar: ");
            despesa.rendaFamiliar = scan.nextDouble();
            System.out.println("Digite seus gastos com luz: ");
            despesa.gastoComLuz = scan.nextDouble();
            System.out.println("Digite seus gastos com água: ");
            despesa.gastoComAgua = scan.nextDouble();
            System.out.println("Digite seus gastos com internet: ");
            despesa.gastoComInternet = scan.nextDouble();
            System.out.println("Digite seus gastos com a mensalidade da academia");
            despesa.valorMensalidadeDaAcademia = scan.nextDouble();
            System.out.println("Digite o número de moradores");
            despesa.numeroDeMoradores = scan.nextInt();
        } catch (Exception e){
            System.out.println("Formato incorreto");
        }
        System.out.printf("Total de Despesas: R$ %.3f\nRenda Familiar Líquida: R$ %.3f", despesa.calcularTotalDeDespesas(), despesa.calcularRendaFamiliarLiquida(), despesa.calcularTotalDeDespesas());
    }
}
