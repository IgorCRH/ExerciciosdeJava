import java.util.Scanner;
public class AnimalID implements Animal // Classe AnimalID implementa a interface Animal
{
protected String nome, especie, cor;
protected int cont = 0, numpatas, codigo;
Scanner leitura = new Scanner (System.in);

// Construtor da classe AnimalID
public AnimalID(String nome2, String especie2, String cor2, int numpatas2, int codigo2){
this.nome = nome2;    
this.especie = especie2;
this.cor = cor2;
this.numpatas = numpatas2;
this.codigo = codigo2;    
}

// Métodos SET para setar as variáveis usadas no programa na inserção de valores
public void setNome(String nome2){
nome = nome2;
}

public void setEspecie(String especie2){
especie = especie2;
}

public void setCor(String cor2){
cor = cor2;
}

public void setNumpatas(int numpatas2){
numpatas = numpatas2;
}

public void setCodigo(int codigo2){
codigo = codigo2;
}

// Métodos GET para retornar os valores
@Override
public String getNome(){
return nome;
}

@Override
public String getEspecie(){
return especie;
}

@Override
public String getCor(){
return cor;
}

@Override
public int getNumpatas(){
return numpatas;
}

@Override
public int getCodigo(){
return codigo;
}

// Método para manipular a formatação da matriz na main
@Override
public String toString() {
return "Nome: " + nome + ", | Espécie:" + especie + " | Cor: " + cor + " | Número de Patas:" + numpatas + " | Código:"
            + codigo + "]";
}
}