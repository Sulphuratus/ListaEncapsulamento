package br.edu.iftm.encapsulamento.classes.testes;

import br.edu.iftm.encapsulamento.classes.Cliente;

public class TesteCliente {

    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Ulisses Roberto da Silva", 
        "Av. das Oficinas, 450, Centro, Curitiba", "12345678910", 36);
        Cliente cliente2 = new Cliente("Helena Amélia Fonseca", 
        "Rua dos Namorados, 694, Sta. Felicidade, Curitiba", "987654321000", 29);

        System.out.println("\nCliente 1 - Nome: " + cliente1.getNome() 
        + "\nEndereço: " + cliente1.getEndereco());

        System.out.println("\nCliente 2 - Nome: " + cliente2.getNome() 
        + "\nEndereço: " + cliente2.getEndereco() );


        System.out.println(cliente1.validaCPF(cliente1.getCPF()));
        cliente2.validaCPF(cliente2.getCPF());
    }
}