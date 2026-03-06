package br.com.atividade2.model; 

//Classe
public class Cachorro {
    
    // Atributos
    
    private String nome;
    private int idade;
    private double peso;
    
    public Cachorro(String nome, int idade, double peso) {
    	this.setNome(nome);
    	this.setIdade(idade);
    	this.setPeso(peso);
    }
    

    public void envelhecer (int anos) {
        if (anos < 0) {
            System.out.println("Impossível");
            return;
        }
        if (anos == 0) {
            System.out.println("Não envelheceu");
            return;
        }

        if (this.idade + anos > 30) {
            System.out.println("Idade máxima atingida");
            return;
        }

        this.idade += anos;
        String mensagem = String.format("Seu animal agora tem %d anos! ", idade); 
        System.out.println(mensagem);
        return;
    }

    public void trocarNome (String novo_nome) {
        if (novo_nome == null) {
            System.out.println("Nenhum nome foi digitado.");
            return;
        }

        if (novo_nome.length() == 1) {
            System.out.println("Digite um nome com mais letras!");
            return;
        }

        this.nome = novo_nome;
        String mensagem2 = String.format("Nome alterado para %s! ", this.nome); 
        System.out.println(mensagem2);
        return;

    }

    // setando
    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setIdade(int idade) {
        if (idade >= 0 && 30 >= idade) {
            this.idade = idade;
        } else {
            System.out.println("Erro: idade inválida!");
        }
    }

    private void setPeso(double peso) {
        if (peso <= 100) {
            this.peso = peso;
        } else {
            System.out.println("Peso impossível.");
        }
    }

    // get
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getPeso() {
        return this.peso;
    }
}
