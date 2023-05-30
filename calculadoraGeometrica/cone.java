package classes.calculadoraGeometrica;

public class cone {
    double altura;
    double raio;
    double geratriz;

    public cone(double altura, double raio, double geratriz) {
        this.altura = altura;
        this.raio = raio;
        this.geratriz = geratriz;
    }

    double volume(){
        return (1/3)*this.altura*Math.PI*Math.pow(this.raio, 2);
    }

    double areaLateral(){
        return Math.PI * this.raio * this.geratriz;
    }

    double areaSuperficial(){
        return Math.PI * this.raio * (this.geratriz + this.raio);
    }
}
