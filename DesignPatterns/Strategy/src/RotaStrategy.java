    public interface RotaStrategy {
    String calcularRota(String origem, String destino);
    int estimarTempo(String origem, String destino); // Estimativa de tempo em minutos
    double calcularCusto(String origem, String destino); // Custo da viagem
}
