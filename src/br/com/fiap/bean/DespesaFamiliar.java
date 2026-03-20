package br.com.fiap.bean;

//CP de JAVA - 24/03/2026 - Pro.Gilberto
//Tárik Moussa Alma - RM: 571411
//Giovane Dias Chicoli - RM: 569750
//Fabricio Aquiles Sales da Silva - RM: 570985
public class DespesaFamiliar {
    //Atributos
    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;

    //Métodos
    public double calcularTotalDeDespesas() {
        double valorAcademiaXmembros;
        valorAcademiaXmembros = valorMensalidadeDaAcademia * numeroDeMoradores;
        return gastoComLuz + gastoComAgua + gastoComInternet + valorAcademiaXmembros;
    }

    public double calcularRendaFamiliarLiquida(){
        double calcularRendaFamiliarLiquida;
        calcularRendaFamiliarLiquida = rendaFamiliar - calcularTotalDeDespesas();
        return calcularRendaFamiliarLiquida;
    }
}
