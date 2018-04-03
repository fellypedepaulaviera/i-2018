package i2018;

import br.com.ufg.inf.lista1.exercicio1.Exercicio1;
import br.com.ufg.inf.lista1.exercicio1.Exercicio2;
import br.com.ufg.inf.lista1.exercicio1.Exercicio3;
import br.com.ufg.inf.lista1.exercicio1.Exercicio4;
import java.io.IOException;

/**
 *
 * Main
 * 
 * @author Jhordan Gabriel
 */
public class I2018 
{

    public static void main(String[] args) throws IOException{
        
        /** Exercício 1 */
        System.out.println(Exercicio1.primeiros4HexaDoArquivo("C:\\test\\file.txt"));
        
        /** Exercício 2 */
        System.out.println(Exercicio2.verificaSeEJpg("C:\\test\\file.txt"));
        System.out.println(Exercicio2.verificaSeEJpg("C:\\test\\file.jpg"));
        System.out.println(Exercicio2.verificaSeEJpg("C:\\test\\file1.jpg"));
        
        /** Exercício 3 */
        System.out.println(Exercicio3.lerArquivo("C:\\test\\file.txt"));
        
        /** Exercício 4 */
        Exercicio4.escreverNoArquivo("C:\\test\\file.txt",
                "Inserindo texto em uma nova linha");
    }   
}
