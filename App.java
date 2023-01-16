public class App {
    public static void main(String[] args) {

        int saldoAtual = 100;
        int valorSolicitado = 40;

        if (valorSolicitado > saldoAtual) {

                System.out.println("Saldo insuficiente o valor solicitado e maior do que o valor disponivel");
            
                System.out.println(" R$ " + valorSolicitado + "  e maior  do que seu saldo em conta  R$ " + saldoAtual);
        } else {
            
            saldoAtual = saldoAtual - valorSolicitado;

                System.out.println("Saque realizado com sucesso  ");

                System.out.println("Seu novo saldo é de R$  " + saldoAtual);
        }

               System.out.println("Seu saldo disponivel  é R$ " + saldoAtual);
    }
}
