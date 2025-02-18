package main;

import aparelho.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar("555-1458");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.tocar();
        iphone.exibirPagina("https://github.com/fsampson30");
    }
}