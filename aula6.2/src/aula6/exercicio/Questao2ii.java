package aula6.exercicio;

import java.io.FileWriter;

public class Questao2ii {

    public void gravarArquivo(String arquivo, char[] dados) throws Exception {
        FileWriter writer = new FileWriter(arquivo);
        writer.write(dados);
        writer.flush();
        writer.close();
    }

    public static void main(String args[]) {
        String nomeArquivo = "teste.txt";

        Questao2ii q2 = new Questao2ii();
        try {
            q2.gravarArquivo(nomeArquivo, new char[100]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
