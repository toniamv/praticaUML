package edu.modelagemIphone;

public abstract class ReprodutorMusical {
    private int volume;

    public ReprodutorMusical(){
        volume = 50;
    }

    public abstract void selecionarMusica(String musica);
    public abstract void pausarMusica();
    public abstract void avancarMusica();
    public abstract void voltarMusica();
    public abstract void acessarAlbum(String album);
    public abstract void acessarArtista(String artista);
    public void aumentarVolume(){
        volume++;
    };
    public void diminuirVolume(){
        volume--;
    };
}
