package testes;

public class Teste4 {
    public static void main(String[] args) {
        // Distância entre as cidades em km
        int distancia = 100;

        // Velocidade do carro em km/h
        int velocidadeCarro = 110;

        // Velocidade do caminhão em km/h
        int velocidadeCaminhao = 80;

        // Tempo adicional do caminhão em minutos para passar em cada pedágio
        int tempoPedagio = 5;

        // Converter tempo adicional do caminhão em horas
        double tempoPedagioHoras = tempoPedagio / 60.0;

        // Calcular a posição do ponto de encontro em km a partir de Ribeirão Preto
        double posicaoEncontro = (velocidadeCarro * distancia) / (velocidadeCarro + velocidadeCaminhao);

        // Calcular o tempo de viagem do carro até o ponto de encontro em horas
        double tempoViagemCarro = posicaoEncontro / velocidadeCarro;

        // Calcular o tempo de viagem do caminhão até o ponto de encontro em horas
        double tempoViagemCaminhao = (distancia - posicaoEncontro) / velocidadeCaminhao + tempoPedagioHoras * 2;

        // Comparar as posições do carro e do caminhão em relação a Ribeirão Preto
        if (posicaoEncontro <= distancia / 2) {
            System.out.println("O carro está mais próximo de Ribeirão Preto.");
        } else {
            System.out.println("O caminhão está mais próximo de Ribeirão Preto.");
        }
    }
}

