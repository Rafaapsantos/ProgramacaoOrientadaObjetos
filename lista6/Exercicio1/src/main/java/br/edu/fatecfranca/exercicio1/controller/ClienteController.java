package br.edu.fatecfranca.exercicio1.controller;

import br.edu.fatecfranca.exercicio1.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

public class ClienteController {
    //simular um banco de dados contendo os clientes
    private static final Map<Long, Cliente> clientes = new HashMap<>();
    static {
        clientes.put(1L, new Cliente(1L, "Maria", "maria123@", "123456789"));
        clientes.put(2L, new Cliente(2L, "Jose", "jose123@", "987654321"));
        clientes.put(3L, new Cliente(3L, "Rafaela", "rafa123@", "547896321"));
    }

    @GetMapping("/clientes/{id}")
    public Cliente findById(@PathVariable Long id) {
        Cliente cliente = clientes.get(id);
        if (cliente != null) {
            return cliente;
        }else {
            return new Cliente(0L, "Cliente não encontrado", "email não encontrado", "telefone não encontrado");
        }
    }

    @GetMapping("/clientes")
    public Map<Long, Cliente> findAll() {
        return clientes;
    }

    @PostMapping("/clientes")
    public Cliente add(@RequestBody Cliente cliente) {
        clientes.put(cliente.getId(), cliente);
        return cliente;
    }

    @PutMapping("/clientes/{id}")
    public String update(@PathVariable Long id, @RequestBody Cliente cliente) {
        Cliente clienteExistente = clientes.get(id);
        if (clienteExistente != null) {
            clienteExistente.setNome(cliente.getNome());
            clienteExistente.setEmail(cliente.getEmail());
            clienteExistente.setTelefone(cliente.getTelefone());
            clientes.put(cliente.getId(), clienteExistente);
            return "Cliente atualizado com sucesso";
        }else {
            return "Cliente não existe";
        }
    }
    @DeleteMapping("/clientes/{id}")
    public String delete(@PathVariable Long id) {
        Cliente cliente = clientes.remove(id);
        if (cliente != null) {
            return "Removido com sucesso";
        }else {
            return "produto não foi encontrado";
        }
    }

}
