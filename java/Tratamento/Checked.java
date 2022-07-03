package Tratamento;

import java.io.*;

import javax.swing.JOptionPane;

//Imprimir arquivo no console.
public class Checked {
    public static void main(String[] args) {
        String nomeArquivo = "test.txt";
        try {
            imprimirAquivoNoConsole(nomeArquivo);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Revise o nome do arquivo que deseja imprimir!" + e.getCause());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado! Entre em contato com o suporte! " + e.getCause());
        }
    }
    //Imprime dados no de um arquivo no console.
    public static void imprimirAquivoNoConsole(String nomeArquivo) throws IOException {
        File file = new File(nomeArquivo);
        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (line != null);
        bw.flush();
        br.close();
    }
}
