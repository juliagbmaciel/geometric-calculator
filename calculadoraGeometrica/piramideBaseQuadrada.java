package classes.calculadoraGeometrica;

public class piramideBaseQuadrada {
    double altura;
    double lado;

    public piramideBaseQuadrada(double altura, double lado) {
        this.altura = altura;
        this.lado = lado;
    }

    double volume(){
        return (this.altura*Math.pow(this.lado, 2));
    }

    double area(){
        return (Math.pow(this.lado, 2)+2*this.lado*(Math.sqrt(Math.pow(this.lado, 2)/4 + Math.pow(this.altura, 2))));
    }
}
