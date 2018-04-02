package br.com.ufg.inf.lista1.exercicio1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

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

        int tamanho = 4;
        
        File arquivo = new File(nomeDoArquivo);
        InputStream input = new FileInputStream(arquivo);

        byte[] bytes = new byte[tamanho];

        int c = 0;
        int x = 0;
        while ((c < bytes.length) &&
                ((x = input.read(bytes, c, bytes.length - c)) >= 0)) {
            c += x;
        }

        input.close();
        
        String hexa = "";
        
        for (int i=0; i < bytes.length; i++) {
            hexa = hexa.concat(" 0x" + byteParaHexa(bytes[i]));
        }
        
        return hexa;
    }
    
    public static String byteParaHexa(byte bt) 
    {
        StringBuilder builder = new StringBuilder();
        builder.append(paraHexaChar((bt >>> 4) & 0x0F));
        builder.append(paraHexaChar(bt & 0x0F));

        return builder.toString();
    }
    
    public static char paraHexaChar(int i) {
        if ((0 <= i) && (i <= 9)) {
            return (char) ('0' + i);
        } else {
            return (char) ('a' + (i - 10));
        }
    }
}
