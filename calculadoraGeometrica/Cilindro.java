package classes.calculadoraGeometrica;

public class Cilindro {
    double raio;
    double altura;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    double volume(){return Math.PI*Math.pow(this.raio, 2)*this.altura;}

    double area(){
        return 2*Math.PI*this.raio*this.altura+2*Math.PI*Math.pow(this.raio, 2);
    }
}
