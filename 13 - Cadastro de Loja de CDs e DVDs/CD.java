// Classes CD e DVD possuem quase os mesmos métodos em comum, pois a maioria
// dos atributos é o mesmo, por serem produtos ou itens bem parecidos, isto é,
// constróem a mesma coisa ao retornar.
public class CD extends CMidia // Classe CD extende a CMidia
{
protected int nmusicas; // Único atributo específico da classe CD
// CD herda nome,codigo e preço de CMidia

// Método para construir a classe sem parâmetros, para definir o tipo posteriormente.
public CD(){
this("N/A",0,0,0);
}

// Construtor da classe CD
public CD(String nome, int codigo, double preco, int nmusicas2){
super(nome,codigo,preco); // Chamada super para pegar os atributos da CMidia
setNumMusicas(nmusicas2);  // Constrói a variável nummusicas na classe 
}

// Se o tipo for CD, retorna por esse método, finalizando o retorno do GetTipo
// em CMidia.
public String getTipo (){
return "\nCD";
}

// Devolve para o método getInfo (que prepara a impressão) da classe CMidia suas informações,
// para finalizar a impressão inicialmente criada em CMidia.
public String getInfo (){
return super.getInfo() + "\n" + "Quantidade de Músicas: " +nmusicas;
}

// Método SET para pegar a variável de quantidade das músicas
public void setNumMusicas(int nmusicas2){
nmusicas = nmusicas2;
}    
}
