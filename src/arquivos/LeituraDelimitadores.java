package arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LeituraDelimitadores {
    public static void main(String[] args){
//        File arquivo = new File("./teste/alunos.csv");
        try {
            Scanner sc = new Scanner(new File("src/teste/alunos.csv"));
            sc.useDelimiter(",");
            while(sc.hasNext()){
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo nao encontrado");
        }
    }
}
