package br.com.atividade2.main;

//Importamos a classe Cachorro para que o sistema a reconheça
import br.com.atividade2.model.Cachorro;

public class sistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro cachorro (Objeto 1)
    	
        Cachorro cachorro1 = new Cachorro("Mike", 10, 15);
        System.out.println("Animal 1");
        cachorro1.envelhecer(7);
        cachorro1.trocarNome("Zeus");
        

        // Criando o segundo cachorro (Objeto 2)
        Cachorro cachorro2 = new Cachorro("Bob", 3, 5);
        System.out.println("Animal 2");
        cachorro2.envelhecer(5);
        cachorro2.trocarNome("Thor");

        // Exibindo os dados no Console
        System.out.println("--- Exibindo cachorros ---");
        System.out.println("Cachorro: " + cachorro1.getNome() + " | Idade: " + cachorro1.getIdade() + " | Peso: " + cachorro1.getPeso());
        System.out.println("Cachorro: " + cachorro2.getNome() + " | Idade: " + cachorro2.getIdade() + " | Peso: " + cachorro2.getPeso());
        
        // Tentando mudar o atributo
        // cachorro2.nome = "Luke";
    }

}
