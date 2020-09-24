# Exercícios da Disciplina de Padrões de Projeto

Linguagem utilizada na disciplina: JAVA

## Padrões GoF

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



