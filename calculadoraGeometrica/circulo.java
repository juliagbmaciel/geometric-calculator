package classes.calculadoraGeometrica;

public class circulo {
    double raio;

    public circulo(double raio) {
        this.raio = raio;
    }

    double areaCirculo(){
        return Math.pow(this.raio, 2)*Math.PI;
    }

    double perimetroCirculo(){
        return 2 * Math.PI* this.raio;
    }
}
