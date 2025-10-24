import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;
import funcionalidades.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {
    public String url;
    public String numero;
    public String nomeMusica;


    public void exibirPagina(String url){
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina(){
        System.out.println("Página atualizada.");
    }

    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String nomeMusica) {
        System.out.println("Música selecionada: " + nomeMusica);
    }

    public void ligar(String numero) {
        System.out.println("Ligando...");
    }

    public void atender() {
        System.out.println("Atendendo...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    //getters
    public String getUrl() {
        return url;
    }
    public String getNumero() {
        return numero;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    //setters
    public void setUrl(String url) {
        this.url = url;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

}
