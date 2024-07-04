/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gerenciador;

import Classes.Quarto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 14626232639
 */
public class GerenciadorQuartos {
    private List<Quarto> quartos = new ArrayList<>();
    
    public void addQuarto(Quarto quarto){
        quartos.add(quarto);
    }
    public void exibirQuartos(){
        for(Quarto quarto: quartos){
            quarto.toString();
        }
    }
}
