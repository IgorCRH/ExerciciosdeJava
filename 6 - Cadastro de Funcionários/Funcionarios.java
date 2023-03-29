public class Funcionarios {
private String nome, cargo; // Criando os atributos do funcionário.
private static int matricula; // Pelo príncipio do encapsulamento, tem de ser private.
private double salario; // Para poder exibí-lo mais pra frente, temos que torná-lo público.

public String getNome (){ // Área para introduzir os GETs para torná-lo público
return nome;    
}

public String getCargo (){
return cargo;    
}

public int getMatricula (){
return matricula;    
}    

public double getSalario (){
return salario;    
}
  
// Área dos métodos SET para construir as variáveis do GET. O this é um objeto para se referir a variável da classe Funcionarios, e diferenciá-la da do argumento do
// método SET.  
public void setNome (String nome) 
{
this.nome = nome;   
}

public void setCargo (String cargo)
{
this.cargo = cargo;   
} 

public void setMatricula (int matricula)
{
this.matricula = matricula;   
} 

public void setSalario (double salario)
{
this.salario = salario;   
}

public void exibir (){ // Exibir as informações que estarão no GET
System.out.println("Matrícula: "+this.matricula);
System.out.println("Nome: "+this.nome);
System.out.println("Cargo: "+this.cargo);
System.out.println("Salário: "+this.salario);    
}    
}  
