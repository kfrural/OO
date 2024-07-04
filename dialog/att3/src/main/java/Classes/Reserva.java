/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author 14626232639
 */
public class Reserva {
    private int id;
    private Quarto quarto;
    private Hospede hospede;
    private String chekin;
    private String chekout;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public String getChekin() {
        return chekin;
    }

    public void setChekin(String chekin) {
        this.chekin = chekin;
    }

    public String getChekout() {
        return chekout;
    }

    public void setChekout(String chekout) {
        this.chekout = chekout;
    }
    
    
}
