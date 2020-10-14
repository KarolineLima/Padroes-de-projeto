# Exercícios da Disciplina de Padrões de Projeto

Linguagem utilizada na disciplina: **JAVA**

# Padrões GoF

## _Padrões Criacionais_


### Factory Method

**_[ExFactoryMethodSaudacao](https://github.com/KarolineLima/Padroes/tree/master/ExFactoryMethodSaudacao)_**

Uma aplicação precisa definir saudações diferentes para homens,
mulheres e para pessoas que não queira identificar seu gênero.
∙ Bem-vinda Srª. X.
∙ Bem-vindo Sr. Y.
∙ Bem-vindo X.
∙ Sabe-se que cada usuário tem um nome e gênero. Como solucionar este
cenário utilizando o padrão Factory Method?



### Desafio das Fábricas

**_[TheSimsAF](https://github.com/KarolineLima/Padroes/tree/master/TheSimsAF) - Abstract Factory_** 

Você foi convidado para fazer parte do desenvolvimento do novo The Sims. Sua responsabilidade no projeto é lidar melhor com a geração dos avatares do jogo. Nessa nova versão, alguns perfis de personagem serão pré-configurados em relação a aparência do personagem no jogo. O processo de criação dos personagens pré-configurados seguem duas etapas principais, (i) a escolha do gênero (Masculino e Feminino) e (ii) a escolha do estilo (esportista, vintage, moderno, vanguarda, futurista, neon vibes, clássico e rural). Essa última escolha afeta o tipo de vestimenta e do cabelo que serão adicionados automaticamente ao personagem que está sendo criado
Como o sistema ainda está sendo avaliado, seu gerente de projeto pediu que você desenvolvesse uma versão beta com apenas um tipo de estilo por gênero. Ficou definido que Avatares femininos seriam esportistas e os Avatares masculinos seriam clássicos. Para isso, será necessário utilizar fábricas. Decida que tipo de fábrica é a mais adequada ao problema. Considere que as classes precisam ter os atributos a seguir: 

Avatar: nome (string), id (int), fortuna(float), cabelo (Cabelo), roupa(Vestimenta)
Cabelo: estilo (string), cor (string) e tamanho (string).
Vestimenta: camisa (string), sapato (string) e acessórios (string).



### Singleton


**_[Primeira questão - ExSingleton](https://github.com/KarolineLima/Padroes-de-projeto/tree/master/ExSingleton)_**

**_[Segunda questão - ExSingleton-threadsafe](https://github.com/KarolineLima/Padroes-de-projeto/tree/master/ExSingleton-threadsafe)_**


1. Escreva, compile e execute o programa abaixo. Em seguida, troque sua implementação para que a classe Incremental seja Singleton. Execute novamente e veja os resultados.
```
class Incremental {
             private static int count = 0;
             private int numero;

             public Incremental() {
                          numero = ++count;
             }
             public String toString() {
                          return "Incremental " + numero;
             }
}
```

```
public class TesteIncremental {
             public static void main(String[] args) {
                          for (int i = 0; i < 10; i++) {
                                       Incremental inc = new Incremental();
                                       System.out.println(inc);
                          }
             }
}
```

2. Imagine que o objeto Incremental (Singleton) é utilizado por várias threads. Reimplemente sua solução com o intuito de garantir que diferentes threads nunca consigam criar mais de uma instância da classe Incremental. Explique as vantagens e/ou desvantagens da abordagem que você utilizou para tornar sua classe Incremental (Singleton) thread-safe.


### Builder Restaurante

**_[ExBuilderRestaurante](https://github.com/KarolineLima/Padroes-de-projeto/tree/master/ExBuilderRestaurante)_**

Na cadeia de restaurantes fast-food Builder Burgers há um padrão para montagem de lanches de crianças. O sanduíche (hambúrguer ou cheeseburger), a batata (pequena, média ou grande) e o brinquedo (carrinho ou bonequinha) são colocados dentro de uma caixa e o refrigerante (coca ou guaraná) é entregue fora da caixa. A classe abaixo é dada para representar o pedido de um consumidor:

```
import java.util.*;
public class Pedido {
         private Set<String> dentroDaCaixa = new HashSet<String>();
         private Set<String> foraDaCaixa = new HashSet<String>();

         public void adicionarDentroDaCaixa(String item) {
                  dentroDaCaixa.add(item);
         }
         public void adicionarForaDaCaixa(String item) {
                  foraDaCaixa.add(item);
         }
         public String toString() {
                  StringBuffer buffer = new StringBuffer();
                  buffer.append("Seu pedido:\n");
                  buffer.append("Dentro da caixa:\n");
                  for (String item : dentroDaCaixa)
                           buffer.append("\t" + item + "\n");
                  buffer.append("Fora da caixa:\n");
                  
                  for (String item : foraDaCaixa)
                           buffer.append("\t" + item + "\n");
                  buffer.append("\nTenha um bom dia!\n\n");
                  
                  return buffer.toString();
         }
}
```

Neste caso, o padrão Builder pode ser usado para separar as tarefas do atendente e do funcionário que monta o pedido. Somente este último sabe como montar os pedidos segundo os padrões da empresa, mas é o atendente quem lhe informa quais itens o consumidor pediu. Implemente a simulação do restaurante fast-food descrita acima utilizando o padrão Builder e escreva uma classe cliente que pede um lanche ao atendente, recebe-o do outro funcionário e imprime o pedido.



## _Padrões Estruturais_

## _Padrões Comportamentais_
