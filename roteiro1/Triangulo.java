package com.mycompany.mavenproject3.classes;

/**
 *
 * @author kfrural
 */
public class Triangulo {

    private Ponto[] pontos = new Ponto[3];

    public Triangulo() {
        for (int i = 0; i < 3; i++) {
            this.pontos[i] = new Ponto();
        }
    }

   public void copy(Triangulo outra) {
    for (int i = 0; i < 3; i++) {
        Ponto p = outra.getPontos()[i];
        this.pontos[i].copy(p);
    }
}

    public void imprimir() {
        System.out.println("A impressao dos trem\n\n");
        for (Ponto p : this.getPontos()) {
            p.imprimir();
        }
    }

    public boolean isColinear(Ponto p1, Ponto p2, Ponto p3) {
        double a = p1.getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - p1.getY()) + p3.getX() * (p1.getY() - p2.getY());
        return a == 0;//faz a mema coisa
//        if (a == 0) {
//            return true;
//        } else {
//           return false;
//        }
    }

   public double calcularArea() {
       double a = Ponto.distancia(this.pontos[0], this.pontos[1]);
        double b = Ponto.distancia(this.pontos[1], this.pontos[2]);
        double c = Ponto.distancia(this.pontos[2], this.pontos[0]);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    
    public double calcularPerimetro() {
        return Ponto.distancia(this.pontos[0], this.pontos[1]) + Ponto.distancia(this.pontos[1], this.pontos[2]) + Ponto.distancia(this.pontos[2], this.pontos[0]);
    }
    
    public String verificarTipo() {
        double a = Ponto.distancia(this.pontos[0], this.pontos[1]);
        double b = Ponto.distancia(this.pontos[1], this.pontos[2]);
        double c = Ponto.distancia(this.pontos[2], this.pontos[0]);

        if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || b == c || a == c) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    public Ponto[] getPontos() {
        return pontos;
    }

    public void setPontos(Ponto[] pontos) {
        this.pontos = pontos;
    }

}
