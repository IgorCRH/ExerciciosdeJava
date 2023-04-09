----------------------------------------------------------------------------
Programa em Javascript de um exercício da UNESP que administra o sistema de cadastro de uma loja de CD's e DVD's com atributos como nome, preço, código, número de músicas ou de faixas.
Interface Midia
Classe CMidia implementa a interface Midia
Classes CD e DVD extendem a Classe CMidia.

Segue o enunciado:
Exercício 1: Uma loja que vende CD e DVDS deseja construir um
cadastro com dos seus produtos. Para tanto, foi elaborado o diagrama
de classes dado na Figura.
![](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiSl4mxDwe2w0aFWl_70RchDka64LnDbp4JDugPiW0HtZcnhkDv7YMhu8v99tnE4WmXd6z5J9y1cM-xKh_1LbmAvz3zCIMI65Bx6BXTrmGdlKsKMcEgYmq-sKg55yTwmO6L1n44bGm1vcCa7vok9XprXutuVAVHSWENW_SP-PCNHSHRgQazcW7LJHeu/s668/poli3.png)

Midia: String nome, int codigo, double preco.
Classes CD e DVD possuem praticamente os mesmos atributos.
Classe CD - CD(), Construtor da Classe CD, Métodos String getTipo, getDetalhes (getInfo), void setNumMusicas.
Classe DVD - DVD(), Construtor da Classe DVD, Métodos String getTipo, getDetalhes (getInfo), void setNumFaixas.

Aonde:
getTipo() - Retorna uma String com o nome da classe.
getInfo() - Retorna uma String com as informações contidas nos
campos.
printDados() - Imprime as informações contidas nos campos da classe.
Para tanto, usa dois métodos para recuperar estas
informações: getTipo() e getInfo(). Estas funções
por sua vez são polimórficas, ou seja, seu tipo retorno
varia de acordo com a classe escolhida, tal que este
método é sobreposto nas subclasses.
Os dados são inseridos na main nesta versão do programa.
----------------------------------------------------------------------------
