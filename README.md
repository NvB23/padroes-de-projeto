# Padrões de Projeto

## Factory Method

É usado quando se deseja evitar a declaração direta das entidades no código cliente.
Para isso, é feito o uso das entidades abstratas e classe fábrica com regra de negócio que possuem regras de negócios e um método fábrica que fabricam as entidades que serão usadas.

## Abstract Factory

É usado quando se trabalha com variações de entidades, ou seja, coleções de uma mesma entidade. Para usá-lo, deve-se relacionar as variações por interfaces em comúns, de acordo com cada grupo de variações. Depois, crie uma Fábrica Abstrata que contém métodos de fabricação com retorno das interfaces, então, estenda essa classe por classes concretas das variações que instanciarão cada entidade, conforme a variação.

## Builder

É usado quando se há uma complexidade muito grande na criação de objetos. O padrão Builder permite montar esses objetos, passo a passo e conforme a necessidade do cliente. Para criar um Builder, crie uma interface que irá conter os métodos comuns na criação dos produtos, depois crie os builders de cada produto implementado a interface criada anteriormente. O builder deve ter uma estrutura contendo um reset() para resetar o objeto após finalizar a criação, e um método que retornará o produto final. Builders podem conter um gerente que administrará a ordem de criação dos produtos.

