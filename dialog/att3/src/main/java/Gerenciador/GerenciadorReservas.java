/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gerenciador;

import Classes.Reserva;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 14626232639
 */
public class GerenciadorReservas {
    private List<Reserva> reservas = new ArrayList<>();
    
    public void addReserva(Reserva reserva){
        reservas.add(reserva);
    }
    public void exibirReservas(){
        for(Reserva reserva : reservas){
            reserva.toString();
        }
    }
}
