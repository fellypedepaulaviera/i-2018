package br.com.ufg.inf.lista1.exercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * Escreva um programa (linha de comandos) que exibe o conteúdo de arquivo texto, 
 * formato UTF-8, na saída padrão. O único argumento é o nome do arquivo 
 * a ser exibido.
 * 
 * @author Jhordan Gabriel
 */
public class Exercicio3 
{
    public static String lerArquivo(String nomeDoArquivo) throws IOException
    {
        File arquivo = new File(nomeDoArquivo);
        FileInputStream fileInputStream = new FileInputStream(arquivo);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String string = "";
        String texto;

        while ((texto = bufferedReader.readLine()) != null) {
            string = string.concat(texto + " \n");
        }

        bufferedReader.close();
        
        return string;
    }
}
