package classes.calculadoraGeometrica;

public class hexagono {
    double lado;

    public hexagono(double lado) {
        this.lado = lado;
    }

    double areaHexagono(){
        return (6*Math.pow(this.lado, 2))/(4*0.577);
    }

    double perimetroHexagono(){
        return this.lado*6;
    }
}
