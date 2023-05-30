package classes.calculadoraGeometrica;

public class cubo {
    double aresta;

    public cubo(double aresta) {
        this.aresta = aresta;
    }

    double volumeCubo(){
        return Math.pow(this.aresta, 3);
    }

    double areaSuperficial(){
        return 6* (this.aresta*this.aresta);
    }
}
