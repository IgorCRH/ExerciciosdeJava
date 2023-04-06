import java.util.Scanner;

public class CMidia implements Midia // Classe CMidia implementa interface Midia
{
// Atributos que ambas as classe CD e DVD possuirão em comum    
protected String nome;
protected int codigo;
protected double preco;

// Construtor da Classe
public CMidia(String nome2, int codigo2, double preco2){
this.nome = nome2;
this.codigo = codigo2;
this.preco = preco2;
}

// Métodos SET para pegar as variáveis
public void setNome(String nome2){
nome = nome2;
}

public void setCodigo(int codigo2){
codigo = codigo2;
}

public void setPreco(double preco2){
preco = preco2;
}

// Métodos GET para retornar as variáveis
@Override
public String getNome(){
return nome;
}

@Override
public int getCodigo(){
return codigo;
}

@Override
public double getPreco(){
return preco;
}

// Métodos pedidos no enunciado
// Método para construir a classe sem parâmetros, para definir o tipo posteriormente.
public CMidia (){
this("N/A",0,0);
}

// Método que prepara o retorno de qual tipo será retornado para a impressão.
public String getTipo(){
return "Tipo de Midia: \n";
}

// Método que prepara o retorno da impressão dos detalhes de cada produto.
public String getInfo(){
return "Nome: \n" +getNome() + "\nCodigo: \n" +getCodigo() + "\n" + "Preco: \n" +getPreco();
}

// Método que prepara a impressão dos detalhes de todos os produtos das classes,
// juntando as informações inicialmente preparadas dos métodos GetInfo e Tipo.
public void printDados(){
System.out.println("Os detalhes do produtos desta classe: \n");
String print = getInfo() + getTipo();
System.out.println(print);
}
}
