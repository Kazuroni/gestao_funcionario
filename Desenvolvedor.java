package gestao_funcionario;

public class Desenvolvedor extends Funcionario {
    private String linguagem;

    public Desenvolvedor(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    @Override
    public void realizarTrabalho() {
        System.out.println("Desenvolvedor " + getNome() + " está programando em " + linguagem);
    }

    @Override
    public String toString() {
        return super.toString() + ", Linguagem: " + linguagem;
    }
}
