package arquivos;

import java.io.File;
import java.util.Scanner;

public class LeituraDirArq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome do arquivo: ");
        String nomeArquivo = sc.nextLine();
        File f = new File(nomeArquivo);
        if (f.exists()) {

            if (f.isFile()) {
                System.out.printf("\nArquivo %s existe - tamanho: %d bytes", f.getName(), f.length());
            } else {
                System.out.println("Pasta:");
                for (File t : f.listFiles()) {
                    System.out.println(t.getName());
                }
            }
        } else {
            System.out.println("Arquivo nao existe");
        }
        sc.close();
    }
}
