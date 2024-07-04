/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gerenciador;

import Classes.Hospede;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 14626232639
 */
public class GerenciadorHospedes {
    private List<Hospede> hospedes = new ArrayList<>();
    
    public void addHospede(Hospede hospede){
        hospedes.add(hospede);
    }
}
