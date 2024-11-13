public class RotaMenosTrafego implements RotaStrategy {
    public String calcularRota(String origem, String destino) {
        return "Calculando a rota com menos tráfego de " + origem + " para " + destino;
    }

    public int estimarTempo(String origem, String destino) {
        return 50; // Pode ser mais longa, mas com menos tráfego
    }

    public double calcularCusto(String origem, String destino) {
        return 12.0; // Custo moderado
    }
}
