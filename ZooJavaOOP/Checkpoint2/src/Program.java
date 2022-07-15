import entities.Endereco;
import entities.Funcionarios;
import entities.Zoo;

import java.util.Objects;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
        Endereco e1 = new Endereco(1, "155", "Jose paulo", "Campina Grande", "PB");
        Endereco e2 = new Endereco(2, "111", "Josefa Taveira", "Joao Pessoa", "PB");
        Endereco e3 = new Endereco(3, "1131", "Luis moreira Gomes", "Joao Pessoa", "PB");

        Funcionarios f1 = new Funcionarios(1, "Felipe", 12345678, e1);
        Funcionarios f2 = new Funcionarios(2, "Roberto", 12341218, e2);
        Funcionarios f3 = new Funcionarios(3, "Jânia", 13425678, e3);

        Zoo z1;
        z1 = new Zoo(1, "zootopia", 112234);

        z1.addFuncionario(f1);
        z1.addFuncionario(f2);
        z1.addFuncionario(f3);

        z1.operar();

        Scanner sc = new Scanner(System.in);
        String mostrar;

        try {
            System.out.print("Para mostrar os funcionários do zoológico, digite mostrar: ");
            mostrar = sc.nextLine();

//digite a palavra "mostrar" para acessar a relação de funcionários cadastrados no zoológico

            if (Objects.equals(mostrar, "mostrar")) {
                System.out.println("");
                System.out.println("Funcionários:");
                z1.mostrarFuncionarios();
                System.out.println("----------------------");
            } else {
                throw new RuntimeException("Valor não reconhecido");
            }

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finalizando consulta...");
            sc.close();
        }
    }
}
