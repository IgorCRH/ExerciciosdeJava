import java.util.Date;
import java.util.Scanner;

public class Funcionario extends Pessoa
{
private double salario;
private String cargo, dep;

public double getSalario (){
return salario;    
}

public String getCargo (){
return cargo;    
}

public void setSalario (double salario) 
{
this.salario = salario;   
}

public void setDep (String dep) 
{
this.dep = dep;   
}

public void setCargo (String cargo) 
{
this.cargo = cargo;   
}

public String getDepartamento (){
return dep;    
}

public Funcionario (String nome, String email, int cpf, String data){
// Método da classe Funcionario usado para implementar o super para resgatar
// os atributos da classe que ela é herdeira    
super(nome,email,cpf,data);
}

public void cadfunc (){
Scanner leitura = new Scanner (System.in);
System.out.println("Entre com o nome do funcionário: ");
super.nome = leitura.next();
System.out.println("Entre com o email do funcionário: ");
super.email = leitura.next();
System.out.println("Entre com o CPF do funcionário: ");
super.cpf = leitura.nextInt();
System.out.println("Entre com a data de nascimento do funcionário: ");
super.data = leitura.next();
System.out.println("Entre com o cargo do funcionário");
this.cargo = leitura.next();
System.out.println("Entre com o departamento do funcionário");
this.dep = leitura.next();
System.out.println("Entre com o salário do funcionário");
this.salario = leitura.nextDouble();
}

public void atualizafunc (String natt){
String nomenov, datanov, cargonov, depnov, emailnov;
int cpfnov;
   
Scanner leitura = new Scanner (System.in);

if (super.nome.equals(natt)){
System.out.println("Entre com o nome novo: ");
nomenov = leitura.next();
System.out.println("Entre com o email novo: ");
emailnov = leitura.next();
System.out.println("Entre com o CPF novo: ");
cpfnov = leitura.nextInt();
System.out.println("Entre com a data de nascimento nova: ");
datanov = leitura.next();
System.out.println("Entre com o cargo novo: ");
cargonov = leitura.next();
   
super.nome = nomenov;
super.email = emailnov;
super.cpf = cpfnov;
super.data = datanov;
this.cargo = cargonov;
} else {
System.out.println("Funcionário não encontrado.");
}
}

public void listarfunc (){
// Método que lista os alunos usando a chamada super pro método GET da variável.    
System.out.println("Nome: "+super.nome);
System.out.println("E-mail: "+super.email);
System.out.println("CPF: "+super.cpf);
System.out.println("Data de Nascimento: "+super.data);
System.out.println("Cargo: "+this.cargo);
System.out.println("Departamento: "+this.dep);
System.out.println("Salário: "+this.salario); 
}

public void reajuste (double valor){
String nreaj;
Scanner leitura = new Scanner (System.in);

System.out.println("Entre com o nome do funcionário a receber reajuste: ");
nreaj = leitura.next();

if (super.nome.equals(nreaj)){
this.salario += valor;
} else {
System.out.println("Funcionário não encontrado.");
}
}
}
