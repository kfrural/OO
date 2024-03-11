package com.mycompany.mavenproject3.classes;

import java.util.HashMap;

/**
 *
 * @author kfrural
 */
public class AgendaTelefonica {
    private String nome;
    private String telefone;
    
    public AgendaTelefonica(){
        this.nome = "";
        this.telefone = "";
    }
    
    public AgendaTelefonica(AgendaTelefonica outra){
        this.nome = outra.getNome();
        this.telefone = outra.getTelefone();
    }
    
    public void copy(AgendaTelefonica outra){
        this.nome = outra.getNome();
        this.telefone = outra.getTelefone();
    }
    
    private HashMap<String, String> agenda = new HashMap<>();

    public void adicionarContato(String nome, String telefone) {
        agenda.put(nome, telefone);
    }

    public void removerContato(String nome) {
        agenda.remove(nome);
    }

    public String buscarTelefone(String nome) {
        return agenda.getOrDefault(nome, "Contato não encontrado.");
    }

    public void imprimirContatos() {
        for (String nome : agenda.keySet()) {
            System.out.println(nome + ": " + agenda.get(nome));
        }
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public HashMap<String, String> getAgenda() {
        return agenda;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setAgenda(HashMap<String, String> agenda) {
        this.agenda = agenda;
    }
    
    
}
