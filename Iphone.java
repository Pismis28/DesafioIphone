package main.java.DesafioIphone;

public class Iphone implements Navegador, ReprodutorMusical, AparelhoTelefonico {


    @Override
    public void ligar() {
        System.out.println("Ligando");

    }

    @Override
    public void desligar() {
        System.out.println("Desligando");

    }

    @Override
    public void atender() {
        System.out.println("Atendendo");

    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando a gravacao");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina");

    }

    @Override
    public void abrirNovaAba() {
        System.out.println("Abrindo nova aba!");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");

    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando pagina");

    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica selecionada");

    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");

    }

    @Override
    public void proximaMusica() {

    }

    @Override
    public void voltarMusica() {

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada");

    }

    @Override
    public void selecionarAlbum() {
        System.out.println("Album selecionado");

    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.abrirNovaAba();
        iphone.atender();
        iphone.atualizarPagina();
        iphone.desligar();
        iphone.fecharPagina();
        iphone.abrirNovaAba();
        iphone.ligar();
        iphone.iniciarCorrerioVoz();
        iphone.exibirPagina();
        iphone.proximaMusica();
        iphone.selecionarAlbum();
        iphone.tocar();
        iphone.voltarMusica();
    }
}
