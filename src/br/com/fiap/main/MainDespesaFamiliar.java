                        //CP de JAVA - 24/03/2026 - Pro.Gilberto
//Tárik Moussa Alma - RM: 571411
//Giovanne - RM:
//Fabricio Aquiles - RM:
package br.com.fiap.main;

public class MainDespesaFamiliar {
 public static void main(String[] args) {
        DespesaFamiliar despesa = new DespesaFamiliar();
        despesa.rendaFamiliar = 10000;
        despesa.gastoComLuz = 100;
        despesa.gastoComAgua = 100;
        despesa.gastoComInternet = 200;
        despesa.valorMensalidadeDaAcademia = 50;
        despesa.numeroDeMoradores = 5;
        System.out.printf("Renda Familiar: R$ %.3f\nMoradores: %d\nConta de Luz: R$ %.3f\nConta de Água: R$ %.3f\nConta de Internet: R$ %.3f\nMensalidade da Academia: R$ %.3f\nTotal de Despesas: R$ %.3f\nRenda Familiar Líquida: R$ %.3f",despesa.rendaFamiliar, despesa.numeroDeMoradores, despesa.gastoComLuz, despesa.gastoComAgua, despesa.gastoComInternet, despesa.valorMensalidadeDaAcademia, despesa.calcularTotalDeDespesas(), despesa.calcularRendaFamiliarLiquida(), despesa.calcularTotalDeDespesas());
    }
}
}
