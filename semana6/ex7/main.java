package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.classes.Cliente;
import com.mycompany.mavenproject3.classes.Produto;
import com.mycompany.mavenproject3.classes.Pedido;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author kfrural
 */
public class Mavenproject3 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Produto 1");
        produto1.setQtd(5);
        produto1.setPreco(10.0);

        Produto produto2 = new Produto();
        produto2.setNome("Produto 2");
        produto2.setQtd(3);
        produto2.setPreco(20.0);
        
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Cliente 1");
        cliente1.produto = produto1; 

        Pedido pedido1 = new Pedido(cliente1);
        pedido1.adicionar(produto1);
        pedido1.adicionar(produto2);

        System.out.println("Total do pedido: " + pedido1.totalPedidos());
        System.out.println("Faturamento do pedido: " + pedido1.faturamento());
        System.out.println("Produto com mais saída: " + pedido1.maisSaida().getNome());
        System.out.println("Produto com menos saída: " + pedido1.menosSaida().getNome());

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);

        Cliente clienteComMaisPedidos = Pedido.clienteMaisPedido(pedidos);
        System.out.println("Cliente com mais pedidos: " + clienteComMaisPedidos.getNome());

        List<Pedido> pedidosParaGastos = new ArrayList<>();
        pedidosParaGastos.add(pedido1);

        Cliente clienteComMaiorGasto = Pedido.gastouMais(pedidosParaGastos);
        System.out.println("Cliente que gastou mais: " + clienteComMaiorGasto.getNome());
    }

}
