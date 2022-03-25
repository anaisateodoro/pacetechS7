package projetoSemanaSete;


public class Main {
/**
 *
 * @author Anaísa
 */
public static void main(String[] args) {
     {
        Empregado Empregado;
        Empregado emp = new Empregado("Lady", "Gaga", 1000f);

        System.out.println("O salario do(a) funcionario(a) " + emp.getNome() + " " + emp.getSobrenome()
                + " acrescido de 10% e: " + emp.getcalcular());

     }
}
}
