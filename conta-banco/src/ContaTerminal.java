public class ContaTerminal {
    public static void main(String[] args) {
        //importação e declaração
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        //entrada de informações
        System.out.println("Digite o número da agencia:");
        agencia = scanner.next();
        System.out.println("Digite o número da conta:");
        numero = scanner.nextInt();
        System.out.println("Digite o seu Nome:");
        nomeCliente = scanner.next();
        System.out.println("Digite o saldo da conta:");
        saldo = scanner.nextDouble();

        //saida
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
