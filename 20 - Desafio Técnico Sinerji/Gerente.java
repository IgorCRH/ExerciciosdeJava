import java.time.LocalDate;
import java.time.Period;

public class Gerente extends Funcionario
{
    // instance variables - replace the example below with your own
        
    private static final double valorSalario = 20000.0;
    private static final double valorAnoServico = 3000.0;

    public Gerente(String nome, LocalDate dataContratacao) {
        super(nome, "Secretário", dataContratacao, valorSalario);
    }
    
    @Override
    public double calcularSalario(int mes, int ano){
    int anosdeServico = Period.between(dataContratacao, LocalDate.of(ano, mes, 1)).getYears();
    return valorSalario + (anosdeServico * valorAnoServico);
    }
    
    @Override
    public double calcularBeneficio(int mes, int ano){
    return 0;
    }
}
