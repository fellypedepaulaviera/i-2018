package br.com.ufg.inf.lista1.exercicio1;

import java.io.File;
import java.io.IOException;

/**
 *
 * Escreva um programa (linha de comandos) que recebe como único argumento um 
 * nome de arquivo e exibe os 4 primeiros bytes (inteiro de 32 bits) em formato 
 * hexadecimal na saída padrão. 
 * Qual o resultado da execução desse programa 
 * quando o arquivo de entrada é um arquivo .class (bytecodes)?
 * 
 * @author Jhordan Gabriel
 */
public class Exercicio1 
{
    public static String primeiros4HexaDoArquivo(String nomeDoArquivo) throws IOException {

        File arquivo = new File(nomeDoArquivo);
        byte[] bytes = Utils.bytesDoArquivo(arquivo, 4);
        
        String hexa = "";
        
        for (int i=0; i < bytes.length; i++) {
            hexa = hexa.concat(" 0x" + Utils.byteParaHexa(bytes[i]));
        }
        
        return hexa.trim();
    }
}
