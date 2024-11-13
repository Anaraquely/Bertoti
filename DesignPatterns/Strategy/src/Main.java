public class Main {
        public static void main(String[] args) {
            SistemaDeNavegacao sistema = new SistemaDeNavegacao(new RotaMaisRapida());
            sistema.calcularEExibirRota("São Paulo", "Rio de Janeiro");

            sistema = new SistemaDeNavegacao(new RotaMaisCurta());
            sistema.calcularEExibirRota("São Paulo", "Rio de Janeiro");

            sistema = new SistemaDeNavegacao(new RotaMenosTrafego());
            sistema.calcularEExibirRota("São Paulo", "Rio de Janeiro");
    }
}