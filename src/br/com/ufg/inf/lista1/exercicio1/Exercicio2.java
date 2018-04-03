package br.com.ufg.inf.lista1.exercicio1;

import java.io.File;
import java.io.IOException;

/**
 *
 * Segundo o portal http://en.wikipedia.org/wiki/Magic_number_%28programming%29 
 * um arquivo JPEG se inicia por um par de bytes específico, assim como termina
 * com outro par de bytes específico. Estes bytes são empregados como 
 * “marcadores” para indicar que o arquivo é um arquivo JPEG. 
 * Escreva um programa (linha de comandos) que recebe como argumento o nome de 
 * um arquivo JPEG e que verifica se esta restrição é satisfeita ou não. 
 * 
 * @author Jhordan Gabriel
 */
public class Exercicio2 
{
    public static boolean verificaSeEJpg(String nomeDoArquivo) throws IOException {

        File arquivo = new File(nomeDoArquivo);
        byte[] bytes = Utils.bytesDoArquivo(arquivo, (int) arquivo.length());
        
        String string = "";
        
        for (int i=0; i < bytes.length; i++) {
            if(i == 0 || i == 1 || i == bytes.length - 1 || i == bytes.length - 2) {
                string = string.concat(" 0x" + Utils.byteParaHexa(bytes[i]));
            }
        }
        
        return (string.trim().equals("0xff 0xd8 0xff 0xd9"));
    }
}
