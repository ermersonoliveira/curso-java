package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {

        String nomeAluno = "Francisco Leite";
        System.out.println("Nome do aluno: " + nomeAluno);

        /*String nomeAlunoAtualizado = nomeAluno.toUpperCase();
        System.out.println("Nome do aluno atualizado: " + nomeAlunoAtualizado);*/

        String nomeProfessor ="";
/*        int quantasLetras = nomeProfessor.length();
        System.out.println("A quantidade de ltras e: " + quantasLetras);*/

        boolean estaVazio = nomeProfessor.isEmpty();
        System.out.println("O campo está vazio? " + estaVazio);


    }
}

