package Tratamento;

import java.io.*;

import javax.swing.*;

public class ExceptionAula {
    public static void main(String[] args) {
        String nomeArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido");
        imprimirArquivo(nomeArquivo);
    }
    public static void imprimirArquivo(String nomeArquivo) {
        try {
            BufferedReader br = lerArquivo(nomeArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }while(line != null);
            bw.flush();
            br.close();
        } catch (FailOpenFileException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado, por favor entre em contato com o suporte." + e.getMessage());
        }
    }
    public static BufferedReader lerArquivo(String nomeArquivo) throws FailOpenFileException {
        File file = new File(nomeArquivo);
        try {
            return new BufferedReader(new FileReader(nomeArquivo));
        } catch (FileNotFoundException e) {
            throw new FailOpenFileException(file.getName(), file.getPath());
        }
    }
}
class FailOpenFileException extends Exception {
    private String nomeArquivo;
    private String diretorio;
    public FailOpenFileException(String nomeArquivo, String diretorio) {
        super("O arquivo " + nomeArquivo + "não foi encontrado no diretório " + diretorio + ".");
        this.nomeArquivo = nomeArquivo;
        this.diretorio = diretorio;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "FailOpenFileException{" + "nome do arquivo ='" + nomeArquivo + '\'' + ",diretorio ='" + diretorio + '\'' + '}';
    }
}
