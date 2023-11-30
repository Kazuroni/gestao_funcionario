package gestao_funcionario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        // Adicionando funcionários à lista
        funcionarios.add(new Gerente("João", 5000.0, "TI"));
        funcionarios.add(new Desenvolvedor("Maria", 4000.0, "Java"));
        funcionarios.add(new Desenvolvedor("Pedro", 4500.0, "Python"));

        // Iterando e realizando operações comuns
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
            funcionario.realizarTrabalho();
            // Aqui você pode realizar outras operações comuns, como apagar tabela do banco, subir para produção, etc.
        }
    }
}
