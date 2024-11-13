public class RotaMaisCurta implements RotaStrategy{
    public String calcularRota(String origem, String destino) {
        return "Calculando a rota mais curta de " + origem + " para " + destino;
    }

    public int estimarTempo(String origem, String destino) {
        return 40; // Mais curta, porém pode demorar mais
    }

    public double calcularCusto(String origem, String destino) {
        return 10.0; // Custo mais baixo, menos pedágios
    }

}
