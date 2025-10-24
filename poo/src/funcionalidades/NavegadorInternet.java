package funcionalidades;
public interface NavegadorInternet {

    public String getUrl();

    public void setUrl(String url);

    public void exibirPagina(String url);

    public void adicionarNovaAba();

    public void atualizarPagina();
}
