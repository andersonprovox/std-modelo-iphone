package browser;

public class NavegadorInternet implements iPhone{

    private void exibirPagina(String url){
        System.out.println("https://" + url);
        adicionarNovaAba();
    }
    private void adicionarNovaAba(){
        System.out.println("Aba adicionada");
    }
    private void atualizarPagina(){}
}
