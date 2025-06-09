package domain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String cpf;
    private Set<String> email;

    public Pessoa (String nome, String sobrenome, String cpf, String... email){
        this.nome = nome;
        this.cpf = cpf;
        this.sobrenome = sobrenome;
        this.email = new HashSet<>(Arrays.asList(email));
    }

    public String getNome() {
        return nome;
    }

    public Set<String> getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSobrenome() {
        return sobrenome;
    }
}
