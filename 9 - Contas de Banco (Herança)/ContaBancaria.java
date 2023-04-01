import java.util.Scanner;

public class ContaBancaria
{
protected String cliente;
protected int numconta;
protected float saldo;

public String getCliente (){
return cliente;    
}

public int getNumConta (){
return numconta;    
}

public float getSaldo (){
return saldo;    
}

public ContaBancaria (String cliente, int numconta, float saldo){
this.cliente = cliente;
this.numconta = numconta;
this.saldo = saldo;    
}  
}
