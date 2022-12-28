public class App {
    public static void main(String[] args) {
        Conta p1 = new Conta();

        p1.setNumConta(1111111);
        p1.setNomeDono("Josias");
        p1.abrirConta("CC");
        p1.depositar(100);
        p1.sacar(50);
        p1.fecharConta();
        p1.estadoAtual();


        Conta p2 = new Conta();

        p2.setNomeDono("Joyce");
        p2.setNumConta(222222);
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(650);
        p2.fecharConta();
        p2.estadoAtual();
    }
}
