package domain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pessoa {
    private String nome;
    private String sobreNome;
    private String cpf;
    private Set<String> emails;

    public Pessoa(String nome, String cpf,
                  String sobreNome, String... emails) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cpf = cpf;
        this.emails = new HashSet<>(Arrays.asList(emails));
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pessoa p)) return false;
        return cpf.equals(p.cpf);
    }

    @Override
    public int hashCode() {
        return cpf.hashCode();
    }
}