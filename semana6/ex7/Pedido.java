package com.mycompany.mavenproject3.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author kfrural
 */
public class Pedido {
    private List <Produto> produto;
    private Cliente cliente;
    
    public Pedido(Cliente cliente){
        this.produto = new ArrayList<>();
        this.cliente = cliente;
    }
    
    public void adicionar(Produto produto){
        this.produto.add(produto);
    }
    
    public void remover(Produto produto){
        this.produto.remove(produto);//aqui o removeIf n seria bom
    }
    
    public double totalPedidos(){
        double total = 0.0;
        for(Produto p1 : produto){
            total += p1.getPreco();
        }
        return total;
    }
    
    public double faturamento(){
        double faturamento = 0.0;
        for(Produto p1 : produto){
            faturamento += p1.getPreco() * p1.getQtd();
        }
        return faturamento;
    }
    
    public Produto maisSaida(){
        Produto maisSaida = null;
        int maiorQtd = 0;
        for(Produto p1: produto){
            if(p1.getQtd() > maiorQtd){
                maiorQtd = p1.getQtd();
                maisSaida = p1;
            }
        }
        return maisSaida;
    }
    
    public Produto menosSaida(){
        Produto menosSaida = null;
        int menorQtd = 999999999;
        for(Produto p1: produto){
            if(p1.getQtd() < menorQtd){
                menorQtd = p1.getQtd();
                menosSaida = p1;
            }
        }
        return menosSaida;
    }
    
    public static Cliente clienteMaisPedido(List <Pedido> pedidos){
        Map<Cliente, Integer> cont = new HashMap<>();
        for(Pedido p1 : pedidos){
            Cliente c1 = p1.getCliente();
            cont.put(c1, cont.getOrDefault(c1, 0) + 1);
        }
        Cliente cMaisPedido = null;
        int maisPedido = 0;
        for(Map.Entry<Cliente, Integer> entry : cont.entrySet()){
            if(entry.getValue() > maisPedido){
                maisPedido = entry.getValue();
                cMaisPedido = entry.getKey();
            }
        }
        return cMaisPedido;
    }
    
    public static Cliente gastouMais(List <Pedido> pedidos){
        Map <Cliente, Double> gasto = new HashMap<>();
        for(Pedido p1: pedidos){
            Cliente c1 = p1.getCliente();
            double gastoAtual = gasto.getOrDefault(c1,0.0);
            gasto.put(c1, gastoAtual + p1.faturamento());
        }
        Cliente cMaiorGasto = null;
        double maisGasto = 0.0;
        for(Map.Entry<Cliente, Double> entry : gasto.entrySet()){
            if(entry.getValue() > maisGasto){
                maisGasto = entry.getValue();
                cMaiorGasto = entry.getKey();
            }
        }
        return cMaiorGasto;
    }
    
    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
}
