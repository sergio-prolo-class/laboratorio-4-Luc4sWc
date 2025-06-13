package domain.humano;

import java.time.LocalDate;

public class Cliente extends Pessoa {
    private static int countTotal;

    static {
        countTotal = 0;
    }

    private int id;
    private String endereco;
    private String telefone;
    private char genero;
    private LocalDate dataCadastro;

    public Cliente(String nome, String cpf,
                   String sobreNome, String endereco,
                   String telefone, char genero, String... emails) {
        super(nome, cpf, sobreNome, emails);
        this.endereco = endereco;
        this.telefone = telefone;
        this.genero = genero;
        this.dataCadastro = LocalDate.now();
        this.id = ++countTotal;
    }

    public String getEndereco() {
        return endereco;
    }

    public char getGenero() {
        return genero;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public String getTelefone() {
        return telefone;
    }
}
