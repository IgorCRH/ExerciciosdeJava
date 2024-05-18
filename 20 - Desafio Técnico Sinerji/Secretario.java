import java.time.LocalDate;
import java.time.Period;

public class Secretario extends Funcionario
{
    
    private static final double valorSalario = 7000.0;
    private static final double valorAnoServico = 1000.0;
    private static final double beneficioPercentual = 0.20;

    public Secretario(String nome, LocalDate dataContratacao) {
        super(nome, "Secretário", dataContratacao, valorSalario);
    }
    
    @Override
    public double calcularSalario(int mes, int ano){
    int anosdeServico = Period.between(dataContratacao, LocalDate.of(ano, mes, 1)).getYears();
    return valorSalario + (anosdeServico * valorAnoServico);
    }
    
    @Override
    public double calcularBeneficio(int mes, int ano){
    return valorSalario * beneficioPercentual;
    }
}
