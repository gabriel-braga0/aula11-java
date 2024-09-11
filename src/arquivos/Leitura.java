package arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        File arquivo = new File("C:/curso/teste.txt");
        try {
            Scanner sc = new Scanner(arquivo, StandardCharsets.UTF_8);
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                System.out.println(linha);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado");
        } catch (IOException e) {
            System.err.println("Erro na leitura do arquivo");
        }
    }
}
