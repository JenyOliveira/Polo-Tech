import model.Funcionario;
import model.FuncionarioCLT;
import model.FuncionarioPJ;
import service.*;

public class TesteCalculadoraDeSalario {

    public static void main(String[] args) throws SalarioException, BonusException {


        FuncionarioPJ funcionarioPJ = new FuncionarioPJ();
        funcionarioPJ.setHorasNormais(10);
        funcionarioPJ.setValorHora(100.00);
        funcionarioPJ.setVendas(1001.00);

        FuncionarioCLT funcionarioCLT = new FuncionarioCLT();
        funcionarioCLT.setHorasNormais(40);
        funcionarioCLT.setHorasExtras(2);
        funcionarioCLT.setValorHora(50.00);
        funcionarioCLT.setVendas(500.00);


        System.out.println(calcularSalario(new CalculadoraDeSalarioPJ(), funcionarioPJ));
        System.out.println(calcularSalario(new CalculadoraDeSalarioPF(), funcionarioCLT));


    }

    public static Double calcularSalario(CalculadoraDeSalario calculadoraDeSalario, Funcionario funcionario) throws SalarioException, BonusException {
        return calculadoraDeSalario.calcularSalarioDoDia(funcionario);
    }

}
