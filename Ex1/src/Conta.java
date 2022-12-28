public class Conta {

    //Atributos do objeto

    public int numConta; 
    protected String tipoConta;
    private String nomeDono;
    private float saldo;
    private boolean status;

    //Métodos

    public void estadoAtual(){
        System.out.println("Dono da conta : " + this.getNomeDono());
        System.out.println("Conta : " + this.getNumConta());
        System.out.println("Saldo da conta : " + this.getSaldo());
        System.out.println("Tipo da conta : " + this.getTipoConta());
        System.out.println("Status da conta : " + this.getStatus());
    }

    public void abrirConta(String t){
        this.setTipoConta(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50); 
        } else {
           this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada porque ainda há saldo disponivel");
        }else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois você está negativado");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
           
     }
    
    public void depositar(float v){
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso");
        }else{
            System.out.println("Não foi possivel realizar o deposito");
        }
    }

    public void sacar(float v){
        if (this.getStatus()) {
            if (this.getSaldo() >= v ) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso");
            }else{
                System.out.println("Saldo insuficiente para saque");
            }
        }else{
            System.out.println("Impossivel sacar de uma conta que esta desativada");
        }
    }

    public void pagarMensalidade(){
        int v = 0;
        if (this.getTipoConta() == "CC") {
            v = 12;
        } else if (this.getTipoConta() == "CP"){
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso");
        }else{
            System.out.println("Impossivel pagar uma conta fechada");
        }
    }

    //Construtor

    public  Conta() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    //Get and Set

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    public String getNomeDono() {
        return nomeDono;
    }
    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

}


    

