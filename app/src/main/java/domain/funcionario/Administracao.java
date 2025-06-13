package domain.funcionario;

public class Administracao extends Estagio {
    private String setor;
    private String descricao;

    public Administracao(String nome, String cpf, String sobreNome, double salario, int cargaHoraria, String Instituicao,Boolean obrigatoria, String setor, String descricao,String... emails){
        super(nome, cpf, sobreNome, salario, cargaHoraria, Instituicao, obrigatoria, emails);

        this.setor = setor;
        this.descricao = descricao;
    }

    public String getSetor() {
        return setor;
    }

    public String getDescricao() {
        return descricao;
    }
}
