public class Carro {
    
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double velocidadeAtual;

    
    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidadeAtual = 0.0;
    }

    
    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadeAtual += incremento;
        }
    }

    
    public void frear(double decremento) {
        if (decremento > 0) {
            velocidadeAtual -= decremento;
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0; // não pode ser menor que zero
            }
        }
    }


    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }


    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }
}
