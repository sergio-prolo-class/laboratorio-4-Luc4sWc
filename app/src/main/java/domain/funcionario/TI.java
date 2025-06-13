package domain.funcionario;

public class TI extends Estagio {
    private Integer nSerie;
    private String atuacao;

    public TI(String nome, String cpf, String sobreNome, double salario, int cargaHoraria, String Instituicao,Boolean obrigatoria, int nSerie, String atuacao,String... emails) {
        super(nome, cpf, sobreNome, salario, cargaHoraria, Instituicao, obrigatoria, emails);

        this.nSerie = nSerie;
        this.atuacao = atuacao;
    }

    public String getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }

    public Integer getnSerie() {
        return nSerie;
    }
}
