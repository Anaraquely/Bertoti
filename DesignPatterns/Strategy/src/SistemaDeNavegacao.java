public class SistemaDeNavegacao {
    private RotaStrategy rotaStrategy;

    public SistemaDeNavegacao(RotaStrategy rotaStrategy) {
        this.rotaStrategy = rotaStrategy;
    }

    public void calcularEExibirRota(String origem, String destino) {
        System.out.println(rotaStrategy.calcularRota(origem, destino));
        System.out.println("Tempo estimado: " + rotaStrategy.estimarTempo(origem, destino) + " minutos");
        System.out.println("Custo da viagem: R$" + rotaStrategy.calcularCusto(origem, destino));
    }
}
