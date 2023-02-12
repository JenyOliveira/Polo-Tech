import model.Salario;
import service.RegrasSalarioLiquido;
import service.RegrasAlternativasSalarioLiquido;
import service.SalarioLiquido;

public class TesteCalculadodaDeSalario extends SalarioLiquido {

    public static void main(String[] args) {


        RegrasSalarioLiquido regrasSalarioLiquido = new RegrasSalarioLiquido();
        SalarioLiquido salarioLiquido = new SalarioLiquido();
        RegrasAlternativasSalarioLiquido regrasAlternativasSalarioLiquido = new RegrasAlternativasSalarioLiquido();

        System.out.print("Salário líquido: R$ " );
        System.out.println(salarioLiquido.calcular(1500.00, 300.00, 500.00));

        System.out.print("Salário líquido: R$ " );
        System.out.println(regrasSalarioLiquido.calcular(1800.00, 200.00, 600.00));

        System.out.print("Salário líquido: R$ " );
        System.out.println(regrasAlternativasSalarioLiquido.calcular(2000.00, 400.00, 700.00));
    }
}
