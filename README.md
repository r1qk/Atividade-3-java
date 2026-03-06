# Atividade da aula 3 de Java
Nome: Riquelme Santos da Mata  
Turma: CCPH2

## Documentação da atividade realizada na aula 3
A atividade é uma continuação da atividade 2, onde precisamos implementar encapsulamento utilizando métodos padronizados (get e set).  

### Arquivo model
O código model é um modelo da classe Cachorro, com três atributos: nome, idade e peso. A seguir, 
criamos um construtor de classe que executa quando se instancia a classe e, geralmente, usamos para atribuir valores. 
Aqui definimos os atributos como privados para não serem alterados facilmente pelo usuário, garantindo mais
segurança ao código.

```
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
```
Usamos um método para definir uma função. Nesse projeto, as funções "envelhecer" e "trocarNome" permanecem, porém são adicionados
seis métodos, três deles para set e três para get. As funções set servem para que os atributos sejam alterados de forma segura,
assim o usuário não consegue alterar esses atributos de um objeto como bem entender. Os métodos get são usados para retornar
esses atributos e exibí-los no arquivo main.

O outro método criado foi o trocarNome. Se o usuário digita um novo nome, o Cachorro tem o seu nome alterado. Também usamos conficional para restringir
essa mudança, como por exemplo: um cachorro não pode passar a ter um nome vazio.
Essa exibição funciona utilizando o if else para definir
a faixa etária do animal. Ambos os métodos mencionados utilizam condicionais para fazer uma validação e alteram um dos atributos definidos pelo usuário.
```
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
```
### Arquivo main
No arquivo main, é onde o código funciona. Dessa vez, utilizamos as funções get para exibir o atributo para 
o usuário, e caso o usuário tente alterar esse atributo manualmente, será exibido um erro dizendo que 
não é possível visualizar esse atributo.
```
// Exibindo os dados no Console
System.out.println("--- Exibindo cachorros ---");
System.out.println("Cachorro: " + cachorro1.getNome() + " | Idade: " + cachorro1.getIdade() + " | Peso: " + cachorro1.getPeso());
System.out.println("Cachorro: " + cachorro2.getNome() + " | Idade: " + cachorro2.getIdade() + " | Peso: " + cachorro2.getPeso());  
        
// Tentando mudar o atributo
cachorro2.nome = "Luke";
```
### Erro 
<img width="971" height="99" alt="image" src="https://github.com/user-attachments/assets/2ff6009e-4a09-4baf-bde2-8018e1de04b0" />

