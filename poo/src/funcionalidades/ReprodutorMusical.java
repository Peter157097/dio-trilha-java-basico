package funcionalidades;
public interface ReprodutorMusical {

    public void setNomeMusica(String nomeMusica);

    public String getNomeMusica();

    public void tocar();

    public void pausar();

    public void selecionarMusica(String nomeMusica);
}
