# Atividade da aula 2 de Java
Nome: Riquelme Santos da Mata  
Turma: CCPH2

## Documentação da atividade realizada na aula 2
A atividade é uma amostra de como criar e utilizar métodos em programação orientada a objetos.  
### Arquivo model

O código model é um modelo da classe Cachorro, com três atributos: nome, idade e peso. A seguir, 
criamos um construtor de classe que executa quando se instancia a classe e, geralmente, usamos para atribuir valores.

```
package br.com.atividade2.model; 

"""
public class Cachorro {
  // Atributos
  public String nome;
  public int idade;
  public double peso;

  public Cachorro(String nome, int idade, double peso) {
    this.nome = nome;
    this.idade = idade;
    this.peso = 0.0;
  }
```
Usamos um método para definir uma função. Nesse caso, a primeira função é envelhecer, onde o usuário digita quantos anos ele quer adicionar 
ao cachorro e uma nova idade é gerada, somando a nova idade e a idadde antiga definida no parâmetro de quando o objeto foi criado. Também foi utilizado
a condicional if para restringir o que o usuário pode digitar. É impossível rejuvenescer (literalmente) com o passar dos anos. 

O outro método criado foi o trocarNome. Se o usuário digita um novo nome, o Cachorro tem o seu nome alterado. Também usamos conficional para restringir
essa mudança, como por exemplo: um cachorro não pode passar a ter um nome vazio.
Essa exibição funciona utilizando o if else para definir
a faixa etária do animal. Ambos os métodos mencionados utilizam condicionais para fazer uma validação e alteram um dos atributos definidos pelo usuário.
```
public void envelhecer (int anos) {
    if (anos < 0) {
        System.out.println("Impossível :/");
        return;
    }
    if (anos == 0) {
        System.out.println("Não envelheceu :D");
        return;
    }

    if (this.idade + anos > 30) {
        System.out.println("Idade máxima atingida :(");
        return;
    }

    this.idade += anos;
    String mensagem = String.format("Seu animal agora tem %d anos! ", idade); 
    System.out.println(mensagem);
    return;
}

public void trocarNome (String novo_nome) {
    if (novo_nome == null) {
        System.out.println("Nenhum nome foi digitado :(");
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
```
### Arquivo main
No arquivo main, é onde o código funciona. Chamamos a classe a seus métodos, utilizamos a cláusula new para criar um objeto e 
fornecer parâmetros aos seus atributos. Ao chamarmos os métodos, podemos utilizar valores para modificar a idade e o nome do cachorro, 
mas se o valor for inválido ou improvável, a mudança não ocorre. No final, apenas exibimos as informações de cada um dos objetos criados, 
ou seja, os cachorros.
```
    Cachorro cachorro1 = new Cachorro("Mike", 10, 15);
    System.out.println("Animal 1");
    cachorro1.exibirFaixaEtaria(10);
    

    Cachorro cachorro2 = new Cachorro("Bob", 2, 5);
    System.out.println("Animal 2");
    cachorro1.exibirFaixaEtaria(2);
```
