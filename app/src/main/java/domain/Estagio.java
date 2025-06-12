package domain;

public class Estagio extends Funcionario{
    private double salario;
    private int cargaHoraria;
    private String instituicao;
    private Boolean obrigatoria;

    public Estagio (String nome, String cpf, String sobreNome, double salario, int cargaHoraria, String Instituicao,Boolean obrigatoria,String... emails) {
        super(nome, cpf, sobreNome, emails);

        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.instituicao = Instituicao;
        this.obrigatoria = obrigatoria;
    }
}
