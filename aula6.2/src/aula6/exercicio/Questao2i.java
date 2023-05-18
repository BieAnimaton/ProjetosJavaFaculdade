package aula6.exercicio;

import java.io.FileWriter;

public class Questao2i {

    public void gravarArquivo(String arquivo, char[] dados) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(arquivo);
            writer.write(dados);
            writer.flush();
            //writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                writer.close(); // fecha tanto se der erro, quanto se não der erro
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String args[]) {
        String nomeArquivo = "teste.txt";
        //char[] ch = new char[2];

        //Questao2ii q2 = new Questao2ii();
        //try {
        //    q2.gravarArquivo(nomeArquivo, ch);
        //} catch (Exception e) {
        //    System.out.println(e.getMessage());
        //}
    }
}
