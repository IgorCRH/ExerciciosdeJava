// Classes CD e DVD possuem quase os mesmos métodos em comum, pois a maioria
// dos atributos é o mesmo, por serem produtos ou itens bem parecidos, isto é,
// constróem a mesma coisa ao retornar.
public class DVD extends CMidia // Classe DVD extende a CMidia
{
protected int nfaixas; // Único atributo específico da classe DVD
// DVD herda nome,codigo e preço de CMidia

// Método para construir a classe sem parâmetros, para definir o tipo posteriormente.
public DVD(){
this("N/A",0,0,0);
}

// Construtor da classe DVD
public DVD(String nome, int codigo, double preco, int nfaixas2){
super(nome,codigo,preco);
setNumFaixas(nfaixas2);   
}

// Se o tipo for CD, retorna por esse método, finalizando o retorno do GetTipo
// em CMidia.
public String getTipo (){
return "\nDVD";
}

// Devolve para o método getInfo (que prepara a impressão) da classe CMidia suas informações,
// para finalizar a impressão inicialmente criada em CMidia.
public String getInfo (){
return super.getInfo() + "\n" + "Quantidade de Faixas: " +nfaixas;
}

// Método SET para pegar a variável de quantidade de faixas
public void setNumFaixas(int nfaixas2){
nfaixas = nfaixas2;
}   
}
