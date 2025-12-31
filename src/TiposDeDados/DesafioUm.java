package TiposDeDados;

import java.sql.SQLOutput;

public class DesafioUm {
    public static void main(String[] args) {
        // Pessoa 1
        String nomePessoa1 = "Francisco Leite";
        int idadePessoa1 = 19;
        String missao1 = "Salvar vidas";
        String nivelDeDificuldade1 = "Dificil";
        char nivelMissao1 = 'C';
        String statusMissao1 = "";


        // Pessoa 2
        String nomePessoa2 = "Joao Paulo";
        int idadePessoa2 = 28;
        String missao2 = "Pintar paredes";
        String nivelDeDificuldade2 = "Facil";
        char nivelMissao2 = 'A';
        String statusMissao2 ="";


        // Pessoa 3
        String nomaPessoa3 = "Julio Cesar";
        int idadePessoa3 = 40;
        String missao3 = "Estudar 3h";
        String nivelDeDificuldade3 = "Moderada";
        char nivelMissao3 = 'C';
        boolean statusMissao3 = true;



        // Monstrano as informações na tela
        System.out.println("=== CADASTRO DE PESSOAS ===");
        System.out.println();
        System.out.println("Pessoa 1: " + nomePessoa1);
        System.out.println(nomePessoa1 + " tem " + idadePessoa1 + " anos");
        System.out.println("A missão de " + nomePessoa1 + " e de "+ missao1 + " e a dificuldade e " + nivelDeDificuldade1 + " com nível " + nivelMissao1);

        // Verificar condição
        if(idadePessoa1 < 15 ){
            if(nivelMissao1 =='C' || nivelMissao1 =='D'){
                statusMissao1 = "Concluído ✅";
            } else {
                statusMissao1 = "Nao concluido ❌";
            }
        } else {
            statusMissao1 = "Concluido!";
        }

        System.out.println("Resultado e: " + statusMissao1);




        System.out.println("----------------------------------------");
        System.out.println("Pessoa 2: " + nomePessoa2);
        System.out.println(nomePessoa2 + " tem " +  idadePessoa2 + " anos");
        System.out.println("A missão de " + nomePessoa2 + " e de " + missao2);
        System.out.println("A dificuldade da missão e: " + nivelDeDificuldade2 + " com nível " + nivelMissao2);

        // Verificar a idade da pessoa
        if( idadePessoa2 < 15) {
            if (nivelMissao2 == 'C' || nivelMissao2 == 'D') {
                statusMissao2 = "Concluida!";
            } else {
                statusMissao2 = "Nao concluida! ❌ Menor de idade.";
            }
        } else {
            statusMissao2 = "Concluida! ✅";
        }
        System.out.println("O status da missao e: " +statusMissao2);





        System.out.println("----------------------------------------");
        System.out.println("Pessoa 3: " + nomaPessoa3);
        System.out.println("A missão de " +  nomaPessoa3 + " e de " + missao3);
        System.out.println("A dificuldade da missao e: " + nivelDeDificuldade3  + " com nível " + nivelMissao3);
        if (statusMissao3 == true) {
            System.out.println("O status da missão e: " + "Concluida!");
        }else {
            System.out.println("O satus da missão e: " + "Nao concluida!");
        }
    }
}
