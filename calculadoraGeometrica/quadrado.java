package classes.calculadoraGeometrica;

public class quadrado {
    double lado;

    public quadrado(double lado) {
        this.lado = lado;
    }

    double areaQuadrado(){
        return Math.pow(this.lado, 2);
    }

    double perimetroQuadrado(){
        return this.lado*4;
    }
}
