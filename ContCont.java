import java.util.Scanner;
import Modelo.ContaBancaria;

public class ContCont {
      public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria contaBancaria = new ContaBancaria(null, 0, 0);
        int op;

        System.out.println(" Criando uma Conta no UnaBank:");
        System.out.println("Por favor informe o nome:");
        String nome = scanner.nextLine();
        contaBancaria.setNome(nome);

        System.out.println("Por favor informe o numero da conta:");
        int numeroconta= scanner.nextInt();
        contaBancaria.setNumeroconta(numeroconta);

        System.out.println("Por favor informe o saldo inicial:");
        double saldo= scanner.nextDouble();
        contaBancaria.setSaldo(saldo);

        System.out.println("sua conta foi criada com sucesso ;p;\n");
      
        do{
            System.out.println("BEM VINDO AO BANCO");
            System.out.println("ESCOLHA UMA OPERAÇÂO");
            System.out.println(1+"Depositar ");
            System.out.println("2.Sacar ");
            System.out.println("3. Obter saldo disponivel");
            System.out.println("0. Sair");
            op =scanner.nextInt();

            switch (op) {

                case '1':
                System.out.println(contaBancaria.getNome() + ", Informe o valor de deposito:");
                System.out.println();
                    double valorDeposito = scanner.nextDouble();
                    contaBancaria.depositar(valorDeposito);
                    break;
                case '2':
                    System.out.println(contaBancaria.getNome() + ", Informe o valor do saque:");
                    double valorSaque = scanner.nextDouble();
                    contaBancaria.sacar(valorSaque);
                    break;
                case '3':                    
                    System.out.println("O saldo da conta numero " + contaBancaria.getNumeroconta() + " valor disponível: R$ " + contaBancaria.getSaldo());
                    break;

            
                case '4':
                System.out.println("***SAINDO DO BANCO***");
                System.out.println("............VOLTE SEMPRE............");
                System.out.println();                    
                break;
            }if(op!='1' && op!='2' && op!='3'){
                System.out.println("*OPÇÃO INVÁLIDA*");

            }
            scanner.close();
        } 
         while (op !=0);
    }
}