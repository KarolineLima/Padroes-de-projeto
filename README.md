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


~~~java

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

~~~
~~~java

public class TesteIncremental {
             public static void main(String[] args) {
                          for (int i = 0; i < 10; i++) {
                                       Incremental inc = new Incremental();
                                       System.out.println(inc);
                          }
             }
}

~~~

2. Imagine que o objeto Incremental (Singleton) é utilizado por várias threads. Reimplemente sua solução com o intuito de garantir que diferentes threads nunca consigam criar mais de uma instância da classe Incremental. Explique as vantagens e/ou desvantagens da abordagem que você utilizou para tornar sua classe Incremental (Singleton) thread-safe.


### Builder Restaurante

**_[ExBuilderRestaurante](https://github.com/KarolineLima/Padroes-de-projeto/tree/master/ExBuilderRestaurante)_**

Na cadeia de restaurantes fast-food Builder Burgers há um padrão para montagem de lanches de crianças. O sanduíche (hambúrguer ou cheeseburger), a batata (pequena, média ou grande) e o brinquedo (carrinho ou bonequinha) são colocados dentro de uma caixa e o refrigerante (coca ou guaraná) é entregue fora da caixa. A classe abaixo é dada para representar o pedido de um consumidor:

~~~java
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
~~~

Neste caso, o padrão Builder pode ser usado para separar as tarefas do atendente e do funcionário que monta o pedido. Somente este último sabe como montar os pedidos segundo os padrões da empresa, mas é o atendente quem lhe informa quais itens o consumidor pediu. Implemente a simulação do restaurante fast-food descrita acima utilizando o padrão Builder e escreva uma classe cliente que pede um lanche ao atendente, recebe-o do outro funcionário e imprime o pedido.



## _Padrões Estruturais_


### Class Adapter

**_[ExClassAdapter](https://github.com/KarolineLima/Padroes-de-projeto/tree/master/ExClassAdapter)_**

Considere os códigos fonte de um cliente, uma interface para um somador que ele espera utilizar e uma classe concreta que implementa uma soma, mas não da maneira esperada pelo cliente. 
Como você pode ver abaixo, o cliente espera usar uma classe que soma inteiros em um vetor, mas a classe pronta soma inteiros em uma lista. 
Crie um adaptador para resolver esta situação.


<img src="https://github.com/KarolineLima/Padroes-de-projeto/blob/master/ImagensExemplos/AdapterProblem.png" width="550"/>


### Bridge

**_[ExBridge](https://github.com/KarolineLima/Padroes-de-projeto/tree/master/ExBridge)_**

Melhore a arquitetura apresentada a seguir utilizando o padrão Bridge. A estrutura abaixo serve para lidar com implementações específicas para tratar um objeto em diferentes meios persistentes em um Editora.

<img src="https://github.com/KarolineLima/Padroes-de-projeto/blob/master/ImagensExemplos/BridgeProblem.png" width="550"/>


**_Resposta em Diagramação:_**

<img src="https://github.com/KarolineLima/Padroes-de-projeto/blob/master/ImagensExemplos/Diagrama%20de%20Classes%20-%20Exemplo%20Bridge.png" width="800"/>

### Composite

**_[ExComposite](https://github.com/KarolineLima/Padroes-de-projeto/tree/master/ExComposite)_**

Como poderia ser resolvido o problema abaixo?

◦ É preciso saber quantas pessoas irão participar do congresso

◦ Participantes podem ser pessoas ou instituição

<img src="https://github.com/KarolineLima/Padroes-de-projeto/blob/master/ImagensExemplos/CompositeProblem.png" width="550"/>


### Decorator

**_[ExDecorator](https://github.com/KarolineLima/Padroes-de-projeto/tree/master/ExDecorator)_**

Suponha que você esteja trabalhando em um kit de ferramentas de interface do usuário e deseja oferecer suporte à adição de bordas e barras de rolagem às janelas. Você pode definir uma hierarquia de herança como a figura a seguir.

Utilize o padrão Decorator para dar ao cliente a capacidade de especificar qualquer combinação de "recursos" desejada.

<img src="https://github.com/KarolineLima/Padroes-de-projeto/blob/master/ImagensExemplos/DecoratorProblem.png" width="550"/>



## _Padrões Comportamentais_


### Template Method

**_[ExTemplateMethod](https://github.com/KarolineLima/Padroes-de-projeto/tree/master/ExTemplateMethod)_**

Crie uma classe abstrata Game definindo operações com um template method definido como final para que não possa ser substituído. 

Cricket e Football devem ser classes concretas que estendam a Game e sobrescrevam seus métodos.

TemplatePatternDemo, deve ser a classe de demonstração e deve usar o Game para demonstrar o uso do padrão Template Method.

<img src="https://github.com/KarolineLima/Padroes-de-projeto/blob/master/ImagensExemplos/TemplateMethodProblem.png" width="500"/>



### Chain of Responsability

**_[ExChainOfResponsability-FabricaBolo](https://github.com/KarolineLima/Padroes-de-projeto/tree/master/ExChainOfResponsability-FabricaBolo)_**

Traga um exemplo de código que utilize o padrão de projeto Chain of responsability!!
