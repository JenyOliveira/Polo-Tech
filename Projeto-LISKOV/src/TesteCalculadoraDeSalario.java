import model.Funcionario;
import model.FuncionarioCLT;
import model.FuncionarioPJ;
import service.CalculadoraDeSalario;
import service.CalculadoraDeSalarioPF;
import service.CalculadoraDeSalarioPJ;
import service.SalarioException;

public class TesteCalculadoraDeSalario {

    public static void main(String[] args) throws SalarioException {


        FuncionarioPJ funcionarioPJ = new FuncionarioPJ();
        funcionarioPJ.setHorasNormais(10);
        funcionarioPJ.setValorHora(100.00);

        FuncionarioCLT funcionarioCLT = new FuncionarioCLT();
        funcionarioCLT.setHorasNormais(40);
        funcionarioCLT.setHorasExtras(2);
        funcionarioCLT.setValorHora(50.00);


        System.out.println(calcularSalario(new CalculadoraDeSalarioPJ(), funcionarioPJ));
        System.out.println(calcularSalario(new CalculadoraDeSalarioPF(), funcionarioCLT));


    }

    public static Double calcularSalario(CalculadoraDeSalario calculadoraDeSalario, Funcionario funcionario) throws SalarioException {
        return calculadoraDeSalario.calcularSalarioDoDia(funcionario);
    }

}
