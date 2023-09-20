package entities;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;



public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String numeroTelefone;

    public Iphone(String modelo, String numeroTelefone) {
        this.modelo = modelo;
        this.numeroTelefone = numeroTelefone;
    }

    // Implementações dos métodos das interfaces ReprodutorMusical, AparelhoTelefonico e NavegadorInternet
    @Override
    public void tocar() {
        System.out.println("Tocando música no iPhone " + modelo);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no iPhone " + modelo);
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música '" + musica + "' no iPhone " + modelo);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o iPhone " + modelo);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada no iPhone " + modelo);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no iPhone " + modelo);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página '" + url + "' no navegador do iPhone " + modelo);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador do iPhone " + modelo);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador do iPhone " + modelo);
    }

    public static void main(String[] args) {
        Iphone meuiPhone = new Iphone("iPhone X", "123-456-7890");

        // Teste dos métodos das interfaces ReprodutorMusical
        meuiPhone.tocar();
        meuiPhone.pausar();
        meuiPhone.selecionarMusica("Minha Música Favorita");
        System.out.println();
        

        // Teste dos métodos das interfaces AparelhoTelefonico
        meuiPhone.ligar();
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();
        System.out.println();

        // Teste dos métodos das interfaces NavegadorInternet
        meuiPhone.exibirPagina("https://www.example.com");
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();
        System.out.println();
    }
}