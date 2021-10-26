package br.edu.iftm.encapsulamento.classes;

public class Cliente {

    private String nome;
    private String endereco;
    private String CPF;
    private int idade;
    
    // Método Construtor apenas para praticar a aplicação desta forma
    public Cliente (String CPF){ 
        this.CPF = CPF;
    }

    public Cliente(String nome, String endereco, String CPF, int idade){
        this(CPF); // Chamada deste atributo de um outro método construtor 
        this.endereco = endereco;
        this.nome = nome;
        this.idade = idade;
    }

    public boolean validaCPF(String CPF){
        if (this.CPF.length() == 11){
            System.out.println("CPF Válido!");
            return true;
        }else{
            System.out.println("CPF inválido!");
            return false;
        }
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getCPF (){
        return CPF;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}