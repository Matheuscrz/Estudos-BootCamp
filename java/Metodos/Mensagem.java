package Metodos;

public class Mensagem {
    public static void textoMensagem(int hora) {
       if (hora >= 5 && hora <= 12){
        mensagemBomdia();
       }
       if (hora >= 13 && hora <= 17) {
        mensagemBoaTarde();
       }
       if (hora >= 18 && hora <= 24 || hora >= 0 && hora <= 4) {
        mensagemBoaNoite();
       }
    }
    public static void mensagemBomdia(){
        System.out.println("Bom dia");
    }
    public static void mensagemBoaTarde(){
        System.out.println("Boa Tarde");
    }
    public static void mensagemBoaNoite(){
        System.out.println("Boa Noite");
    }
}
