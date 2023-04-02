----------------------------------------------------------------------------
Programa em Java de administração de um sistema de produtos comprados e fabricados, aonde se calcula o custo de compra do primeiro, o de fabricação do segundo (somando o preço dos ingredientes), com retorno do valor da compra.

Enunciado:
Uma empresa controla seus produtos na forma de dois tipos de objetos: produtos comprados e
produtos fabricados. Produtos comprados implementam a interface IProduto:
public interface IProduto {
 public String getNome();
 public float getCusto();
}

O método getNome retorna o nome do produto. Se o objeto for um produto comprado, o método
getCusto retorna o valor de compra do produto (este valor representa seu custo).
Produtos fabricados são feitos a partir de uma combinação de ingredientes. Para fins de simplificação
considere que sempre será usada uma unidade de cada ingrediente. Tais produtos fabricados implementam
a interface IProdutoFabricado:
public interface IProdutoFabricado extends IProduto {
 int getNumeroIngredientes();
 IProduto getIngrediente(int numero);
}

Para fins de simplificação, o custo de um produto fabricado é apenas a soma dos custos de seus
ingredientes. Portanto, se o objeto for produto fabricado, seu método getCusto retorna esta soma.
Objetos de produtos comprados não implementam a interface IProdutoFabricado.
O sistema define uma classe auxiliar GerenteProdutos com os seguintes métodos estáticos:
ingredientes Recebe como parâmetro uma String contendo o nome do produto e retorna um vetor de Strings com os
ingredientes do mesmo. Retorna null se este produto não puder ser fabricado.
valorCompra Retorna como parâmetro uma String contendo o nome do produto e retorna seu valor de compra.
Considere as classes e interfaces acima como preexistentes (não é necessário codificá-las).
Codifique uma classe que implemente a interface IProdutoFabricado.
Codifique um método em Java que receba como parâmetro um objeto representando um produto
comprado (implementando a interface IProduto). Este método deverá executar o processo de redução de
custo do produto, baseado nos seguintes passos.
1. Recupera os ingredientes do produto e calcula o seu custo fabricado. Se o custo fabricado for menor
que o comprado, transforma o objeto produto comprado em um objeto produto fabricado.
----------------------------------------------------------------------------
