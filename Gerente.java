package gestao_funcionario;

public class Gerente extends Funcionario {
    private String setor;

    public Gerente(String nome, double salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    @Override
    public void realizarTrabalho() {
        System.out.println("Gerente " + getNome() + " está gerenciando o setor " + setor);
    }

    @Override
    public String toString() {
        return super.toString() + ", Setor: " + setor;
    }
}

