public class ContaBancaria {

    private int numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(int numeroConta, String titular, double saldo){

        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;    
    }

        public int getNumeroConta(){
        return numeroConta;
        
        }

       public void setNumeroConta( int novoNumeroConta){
        this.numeroConta = novoNumeroConta;
       }

       public String getTitular(){
        return titular;
        }

      public void setTitular( String novoTitular){
        this.titular = novoTitular;
      }

      public double getSaldo(){  
        return saldo;
      }

      public void depositar(double valor){

        if (valor>0) {

            this.saldo+= valor;      
        }
      }

      public boolean sacar(double valor){
      if (valor>0 && this.saldo >= valor) {
         this.saldo -= valor;
        return true;
 
      } else 

      return false; 

      }

      }


