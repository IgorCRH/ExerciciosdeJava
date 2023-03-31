import java.util.Date;
import java.util.Scanner;

public class Aluno extends Pessoa // Chamada de herança da classe Aluno para Pessoa
{
private int matricula;
private double cr;

public int getMatricula (){
return matricula;    
}

public double getCR (){
return cr;    
}

public void setMatricula (int matricula) 
{
this.matricula = matricula;   
}

public void setCR (double cr) 
{
this.cr = cr;   
}


public Aluno (String nome, String email, int cpf, String data){
// Método da classe aluno usado para implementar o super para resgatar
// os atributos da classe que ela é herdeira    
super(nome,email,cpf,data);
}

public void cadaluno (){
Scanner leitura = new Scanner (System.in);

System.out.println("Entre com o nome do aluno: ");
super.nome = leitura.next();
System.out.println("Entre com o email do aluno: ");
super.email = leitura.next();
System.out.println("Entre com o CPF do aluno: ");
super.cpf = leitura.nextInt();
System.out.println("Entre com a data de nascimento do aluno: ");
super.data = leitura.next();
System.out.println("Entre com a matrícula do aluno: ");
this.matricula = leitura.nextInt();
System.out.println("Entre com a CR do aluno: ");
this.cr = leitura.nextDouble();
}

public void atualizaaluno (String natt){
String nomenov, emailnov, datanov;
int cpfnov, matnov;
Scanner leitura = new Scanner (System.in);

if (super.nome.equals(natt)){
System.out.println("Entre com o nome novo");
nomenov = leitura.next();
System.out.println("Entre com o email novo");
emailnov = leitura.next();
System.out.println("Entre com o CPF novo");
cpfnov = leitura.nextInt();
System.out.println("Entre com a data de nascimento nova");
datanov = leitura.next();
System.out.println("Entre com a matrícula nova");
matnov = leitura.nextInt();

super.nome = nomenov;
super.email = emailnov;
super.cpf = cpfnov;
super.data = datanov;
this.matricula = matnov;
}  else {
System.out.println("Aluno não encontrado.");
}
}

public void anulamatricula (String nanul){
if (super.nome.equals(nanul)){
this.matricula = 0;
} else {
System.out.println("Aluno não encontrado.");
}
}

public void listaralunos (){
// Método que lista os alunos usando a chamada super pro método GET da variável.    
System.out.println("Nome: "+super.nome);
System.out.println("E-mail: "+super.email);
System.out.println("CPF: "+super.cpf);
System.out.println("Data de Nascimento: "+super.data);
System.out.println("Matrícula: "+this.matricula);
System.out.println("CR: "+this.cr); 
}
}
