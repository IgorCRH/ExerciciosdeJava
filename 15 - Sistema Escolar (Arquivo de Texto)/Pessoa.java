import java.util.Date;
import java.util.Scanner;

public class Pessoa
{
protected String nome, email, data; // protected para o acesso ser possível em outras classes
protected int cpf;

public String getNome (){
return nome;    
}

public String getEmail (){
return email;    
}

public int getCpf (){
return cpf;    
}

public String getData (){
return data;    
}

public Pessoa (String nome, String email, int cpf, String data) 
{ // Método da classe Pessoa na qual usaremos o objeto super nas outras
this.nome = nome;
this.email = email;
this.cpf = cpf;
this.data = data;   
}
}
