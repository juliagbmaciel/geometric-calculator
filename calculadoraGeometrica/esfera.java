package classes.calculadoraGeometrica;

public class esfera {
    double raio;

    public esfera(double raio) {
        this.raio = raio;
    }

    double volume(){
        return (4*Math.PI*Math.pow(this.raio, 3))/3;
    }

    double area(){
        return 4*Math.PI*Math.pow(this.raio, 2);
    }
}
