package calls;

public class AparelhoTelefonico implements iPhone {
    private void ligar(String numero){
        System.out.println("Ligando para: " + numero);
    }
    private void atender(){}
    private void iniciarCorrreioVoz(){}

    public AparelhoTelefonico() {
    }
}
