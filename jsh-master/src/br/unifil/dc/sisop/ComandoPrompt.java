package br.unifil.dc.sisop;

import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Write a description of class ComandoPrompt here.
 *
 * @author Ricardo Inacio Alvares e Silva
 * @version 180823
 */
public class ComandoPrompt {
    
    public ComandoPrompt(String comando) {
        nome = comando;
        argumentos = comando.split(" ");

        // ESCREVA AQUI SEU CODIGO PARA ESTRUTURAR O COMANDO RECEBIDO DO PROMPT.

    }
    
    /**
     * Método acessor get para o nome do comando.
     * 
     * @return o nome do comando, exatamente como foi entrado.
     */
    public String getNome() { 

        return nome;
    }
    
    /**
     * Método acessor get para os argumentos que seguram ao nome do comando.
     * 
     * @return Lista de argumentos do comando, protegida contra modificações externas.
     */
    public List<String> getArgumentos() {

        return Collections.unmodifiableList(Arrays.asList(argumentos));
    }
    
    private final String nome;
    private final String[] argumentos;
}
