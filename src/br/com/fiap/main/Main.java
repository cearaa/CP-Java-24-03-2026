package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

//CP de JAVA - 24/03/2026 - Pro.Gilberto
//Tárik Moussa Alma - RM: 571411
//Giovane Dias Chicoli - RM: 569750
//Fabricio Aquiles Sales da Silva - RM: 570985
public class Main {
    public static void main(String[] args) {
        DespesaFamiliar despesa = new DespesaFamiliar();

        try {
            Scanner scan = new Scanner(System.in);
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

            System.out.printf("Renda familiar: R$ %.3f\nTotal de Despesas: R$ %.3f\nRenda Familiar Líquida: R$ %.3f", despesa.rendaFamiliar, despesa.calcularTotalDeDespesas(), despesa.calcularRendaFamiliarLiquida());
        } catch (Exception e){
            System.out.println("Você digitou um valor incorreto. (Permitido somente numeros decimais ou inteiros)");
        }
    }
}
