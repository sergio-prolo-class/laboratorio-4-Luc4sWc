package domain;

import java.time.LocalDate;

public class Consultor extends Temporario {
    private Pleno intermediario; // um funcionário CLT Pleno
    private int relatoriosPrevistos;

    public Consultor(String nome, String cpf, String sobreNome, LocalDate dataTerminoTemporario, double valorTotal, LocalDate dataTermino, int relatoriosPrevistos,String... emails) {
        super(nome,cpf,sobreNome,dataTerminoTemporario,valorTotal,emails);
        this.intermediario = intermediario;
        this.relatoriosPrevistos = relatoriosPrevistos;
    }

    public Pleno getIntermediario() {
        return intermediario;
    }

    public int getRelatoriosPrevistos() {
        return relatoriosPrevistos;
    }
}

