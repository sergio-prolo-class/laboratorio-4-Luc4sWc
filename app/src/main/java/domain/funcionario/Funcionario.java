package domain.funcionario;

import domain.humano.Pessoa;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private static int countTotal;

    static {
        countTotal = 0;
    }

    private int id;
    private LocalDate dataInicioContrato;

    public Funcionario(String nome, String cpf,
                       String sobreNome, String... emails) {
        super(nome, cpf, sobreNome, emails);
        this.id = countTotal++;
        this.dataInicioContrato = LocalDate.now();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Funcionario f)) return false;
        return id == f.id;
    }

    public int hashCode() {
        return id;
    }

    public LocalDate getDataInicioContrato() {
        return dataInicioContrato;
    }

    public int getId() {
        return id;
    }
}