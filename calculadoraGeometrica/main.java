package classes.calculadoraGeometrica;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Bem vindo a claculadora geométrica!!");
            System.out.println("Escolha a forma geometrica que deseja calcular hoje: ");

            System.out.println(
                    """ 
                    [1] Cilindro
                    [2] Circulo
                    [3] Cone
                    [4] Cubo
                    [5] Esfera
                    [6] Hexágono
                    [7] Paralelepípedo
                    [8] Piramide de Base quadrada
                    [9] Quadrado
                    [10] Retângulo
                    [11] Triângulo equilátero
                    """);
            int op = sc.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.println("Digite o valor do raio do cilindro: ");
                    double raio = sc.nextDouble();
                    System.out.println("Digite o valor da altura do cilindro: ");
                    double altura = sc.nextDouble();
                    Cilindro cilindro = new Cilindro(raio, altura);
                    double volume = cilindro.volume();
                    double area = cilindro.area();
                    System.out.printf("Volume do cilindro: %.2f\n", volume);
                    System.out.printf("Área do cilindro: %.2f\n\n", area);
                }
                case 2 -> {
                    System.out.println("Digite o valor do raio do circulo: ");
                    double raioc = sc.nextDouble();
                    circulo circle = new circulo(raioc);
                    System.out.printf("Área do circulo: %.2f\n", circle.perimetroCirculo());
                    System.out.printf("Perímetro do circulo: %.2f\n\n", circle.areaCirculo());
                }
                case 3 -> {
                    System.out.println("Digite o valor da altura do cone: ");
                    double altc = sc.nextDouble();
                    System.out.println("Digite o valor da geratriz do cone: ");
                    double geratriz = sc.nextDouble();
                    System.out.println("Digite o valor do raio do cone: ");
                    double raiocone = sc.nextDouble();
                    cone conee = new cone(altc, geratriz, raiocone);
                    System.out.printf("Volume do cone: %.2f\n", conee.volume());
                    System.out.printf("Área lateral do cone: %.2f\n", conee.areaLateral());
                    System.out.printf("Área superficial do cone: %.2f\n\n", conee.areaSuperficial());
                }
                case 4 -> {
                    System.out.println("Digite o valor da aresta do cubo");
                    double aresta = sc.nextDouble();
                    cubo cuubo = new cubo(aresta);
                    System.out.printf("Volume do cubo: %.2f\n", cuubo.volumeCubo());
                    System.out.printf("Área superfícial do cubo: %.2f\n\n", cuubo.areaSuperficial());
                }
                case 5 -> {
                    System.out.println("Digite o valor do raio da esfera: ");
                    double raioe = sc.nextDouble();
                    esfera esfeera = new esfera(raioe);
                    System.out.printf("Volume da esfera: %.2f\n\n", esfeera.volume());
                }
                case 6 -> {
                    System.out.println("Digite o valor do lado do hexágono: ");
                    double lado = sc.nextDouble();
                    hexagono hex = new hexagono(lado);
                    System.out.printf("Área do hexágono: %.2f\n", hex.areaHexagono());
                    System.out.printf("Perímetro do hexágono: %.2f\n\n", hex.perimetroHexagono());
                }
                case 7 -> {
                    System.out.println("Digite o valor da altura do paralelepipedo: ");
                    double alt = sc.nextDouble();
                    System.out.println("Digite o valor da largura do paralelepipedo: ");
                    double larg = sc.nextDouble();
                    System.out.println("Digite o valor do comprimento do paralelepipedo: ");
                    double comp = sc.nextDouble();
                    paralelepipedo pa = new paralelepipedo(alt, larg, comp);
                    System.out.printf("Volume: %.2f\n", pa.volume());
                    System.out.printf("Área superficial: %.2f\n\n", pa.areaSuperficial());
                }
                case 8 -> {
                    System.out.println("Digite o valor da altura da pirâmide: ");
                    double altp = sc.nextDouble();
                    System.out.println("Digite o valor do lado da pirâmide: ");
                    double ladop = sc.nextDouble();
                    piramideBaseQuadrada pi = new piramideBaseQuadrada(altp, ladop);
                    System.out.printf("Volume: %.2f\n", pi.volume());
                    System.out.printf("Área: %.2f\n\n", pi.area());
                }
                case 9 -> {
                    System.out.println("Digite o valor do lado do quadrado: ");
                    double ladoq = sc.nextDouble();
                    quadrado q = new quadrado(ladoq);
                    System.out.printf("Área do quadrado %.2f\n", q.areaQuadrado());
                    System.out.printf("Perímetro do quadrado %.2f\n\n", q.perimetroQuadrado());
                }
                case 10 -> {
                    System.out.println("Digite o valor da base do retângulo: ");
                    double base = sc.nextDouble();
                    System.out.println("Digite o valor da altura do retângulo: ");
                    double altr = sc.nextDouble();
                    retangulo r = new retangulo(base, altr);
                    System.out.printf("Área do retângulo: %.2f\n", r.areaRetangulo());
                    System.out.printf("Perímetro do retângulo: %.2f\n\n", r.perimetroRetangulo());
                }
                case 11 -> {
                    System.out.println("Digite o valor do lado do triângulo: ");
                    double ladot = sc.nextDouble();
                    trianguloEquilatero t = new trianguloEquilatero(ladot);
                    System.out.printf("Área do triângulo: %.2f\n", t.areaTriangulo());
                    System.out.printf("Perímetro do triângulo: %.2f\n\n", t.perimetroTriangulo());
                }
            }
        }
    }
}
