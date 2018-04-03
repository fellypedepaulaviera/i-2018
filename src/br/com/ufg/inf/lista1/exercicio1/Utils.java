package br.com.ufg.inf.lista1.exercicio1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Utils 
{
    public static byte[] bytesDoArquivo(File arquivo, int tamanho) throws IOException
    {
        InputStream input = new FileInputStream(arquivo);

        byte[] bytes = new byte[tamanho];

        int c = 0;
        int x = 0;
        while ((c < bytes.length) &&
                ((x = input.read(bytes, c, bytes.length - c)) >= 0)) {
            c += x;
        }

        input.close();
        
        return bytes;
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
