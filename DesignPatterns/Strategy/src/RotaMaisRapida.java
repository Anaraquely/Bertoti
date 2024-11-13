public class RotaMaisRapida implements RotaStrategy{
    public String calcularRota(String origem, String destino) {
        return "Calculando a rota mais rápida de " + origem + " para " + destino;
    }

    public int estimarTempo(String origem, String destino) {
        return 30; // Tempo em minutos
    }

    public double calcularCusto(String origem, String destino) {
        return 15.0; // Custo em reais
    }
}
