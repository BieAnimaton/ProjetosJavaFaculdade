package aula8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.SortedMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Questao2 {
    public static void main(String[] args) {
        SortedMap<Long, Produto> produtos = new TreeMap<>();
        
        try {
            FileReader reader = new FileReader("POO_Aula8_dados2.csv");
            BufferedReader buffer = new BufferedReader(reader);
            String linha = buffer.readLine();
            while (linha != null) {
                StringTokenizer tokens = new StringTokenizer(linha, "|");
                Produto produto =
                        new Produto(
                                Long.parseLong(tokens.nextToken()),
                                tokens.nextToken()
                        );
                produtos.put(produto.getCodigo(), produto);
                linha = buffer.readLine();
            }
            for (Map.Entry<Long, Produto> entry : produtos.entrySet()) {
                Long key = entry.getKey();
                Produto value = entry.getValue();
                //System.out.println(key + " - " + value.getNome());
                System.out.println(value);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
