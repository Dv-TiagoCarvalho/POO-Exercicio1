public class main {
public static void main(String[] args) {
    
    ContaBancaria c1 = new ContaBancaria(1000, "tiago", 500.0);

    System.out.println("Saldo Inicial (c1): " + c1.getSaldo());
    c1.depositar(150.0);

    System.out.println("Após depósito de R$ 150: " + c1.getSaldo());
    boolean ok = c1.sacar(700.0);
    System.out.println("Tentativa de saque R$ 700 " + ( ok ? "sucesso" : "Falha") );

    System.out.println("Saldo Final: " + c1.getSaldo());
    System.out.println(" \n ");


    ContaBancaria c2 = new ContaBancaria(1001, "Amanda", 1000);
    System.out.println("Conta bancaria 1001 ");

    System.out.println("Saldo Inicial (c2): " + c2.getSaldo());
    c2.depositar(300);

    System.out.println("Após depósito de R$ 300: " + c2.getSaldo());
    boolean ok2 = c2.sacar(200.0);
    System.out.println("Tentativa de saque R$ 200 " + ( ok2 ? "sucesso" : "Falha") );

    System.out.println("Saldo Final: " + c2.getSaldo());

}
    
}
