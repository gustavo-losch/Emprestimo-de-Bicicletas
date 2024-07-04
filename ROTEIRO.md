# Roteiro - Trabalho Final de Fundamentos de Programação

### Introdução | (1 min)

Olá tudo bem eu sou guilherme cavazzotto
---e eu sou Gustavo losch
e hoje iremos apresentar nossa grandiosíssimo aplicativo cujo objetivo é melhorar e facilitar a vida dos cidadães no quesito empréstimo de bicicleta
então introduzindo superficialmente o aplicativo, deve-se ressaltar suas funções que são Incluir membro
 mostrar membros, Pesquisar membro, adicionar bicicleta, Mostrar bicicletas, Pesquisar bicicleta por modelo, Emprestar bicicleta, Devolver bicicleta, mostrar numero de bicicletas disponíveis para empréstimo,
tudo isso organizado por um menu simples, onde cada uma dessas opções são numeradas e podem ser escolhidas digitando o número da opção desejada. É importante ressaltar que para o usuário fazer bom uso do aplicativo deve-se fazer tudo em uma ordem lógica correta, caso isso não ocorra será impossível tirar 100% do potencial do app,
Agora passo a palavra para nosso grande programador Gustavo Losch

### Desenvolvimento | (4 min)

Na etapa de desenvolvimento, construimos o software seguindo uma estrutura hierárquica de classes, das quais temos uma classe principal, duas classes que fazem operações com objetos e dois objetos. Para o desenvolvimento do projeto, os objetos utilizados foram Membro, que armazena características importantes dos membros do clube e Bicicleta, que armazena dados como quantidade e modelo da bicicleta utilizada pelo clube. Já as classes que fazem operações com os objetos, que são CadastroMembro e CadastroBiciceta, armazenam o conjunto de objetos em vetores e operam os dados nos vetores. Por fim, a classe Clube executa o método main de nosso software, dessa forma, acaba interligando as demais classes e fazendo uma ponte entre usuário e programa.

A aplicaçao desenvolvida também consta com diversas funcionalidades, sendo as principais delas: incluir membros no vetor de objetos, incluir bicicletas no vetor de objetos e emprestar bicicleta ao membro. Durante o desenvolvimento do software, nos deparamos com diversos erros na execução do código, o principal erro encontrado foi o "NullPointerException", o qual significa, em nosso contexto, que foi tentado acessar as informações de um objeto que não existe. Em nosso caso, tanto o vetor de objetos de membros quanto o de bicicletas eram inicializados apenas com elementos nulos e, a medida que fosse sendo preenchido, os valores nulos deixariam de existir. Portanto, foi criada uma regra de excessão utilizando um if simples que somente realizaria operações se o objeto lido não fosse nulo.

Além disso, construimos dois métodos adicionais na classe Clube, os quais fazem respectivamente a contagem de bicicletas disponíveis para o aluguel e a checagem de disponibilidade da bicicleta requisitada para aluguel. A seguir, mostrarei um pouco do funcionamento de nossa aplicação, junto a informações úteis referentes ao projeto.

>     Mostrar código e excução no terminal. Mostrar fluxograma do trabalho no tldraw.

### Conclusões | (1 min)

Então, concluimos que alguns aspectos foram fundamentais no desenvolvimento do projeto para garantir a execução limpa e organizada das tarefas exigidas pelo trabalho. Alguns desses aspectos foram:

* Organização: organizar o código foi fundamental para melhorar a eificiência do grupo.
* Documentação: os comentários no código foram fundamentais para o melhor entendimento das estratégias lógicas utilizadas no projeto pelos integrantes do grupo.
* Versionamento: a organização das versões de nosso programa utilizando o git nos permitiu trabalhar em equipe de forma organizada e rastreada.

Portanto, a realização do trabalho nos gerou um grande aprendizado técnico acerca das funcionalidades da linguagem Java, além de proporcionar conhecimentos muito importantes referentes a melhoria de eficiência ao trabalhar em equipe.
