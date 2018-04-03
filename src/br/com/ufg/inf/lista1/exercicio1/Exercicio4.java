package br.com.ufg.inf.lista1.exercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *
 * Escreva um programa (linha de comandos) cujo primeiro argumento é o nome 
 * de um arquivo e cujo segundo argumento é uma sequência de caracteres. 
 * Quando executado, a sequência de caracteres fornecida como o segundo 
 * argumento é persistida no arquivo cujo nome é fornecido como primeiro argumento.
 * O texto deve ser persistido no formato UTF-8.
 * 
 * @author Jhordan Gabriel
 */
public class Exercicio4 
{
    public static void escreverNoArquivo(String nomeDoArquivo, String escrita) throws IOException
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
        
        string = string.concat(escrita + " \n");

        FileOutputStream fileOutputStream = new FileOutputStream(arquivo);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
        
        Writer writer = new BufferedWriter(outputStreamWriter);

        writer.write(string);
        writer.close();

        bufferedReader.close();
    }
}
