//A importancia de R$ 780.000.00 sera dividida entre 3 ganhadores de um concurso.Sendo que da tal qantia total:
//O primeiro ganhador recebera 46%, o segundo 32% e o terceiro recebera o restante.Calcule e imprima a qantia por cada um dos ganhadores



public class exercicio39 {
    public static void main(String[] args) {
        float Total = 780000.00F;

        float primeiroGanhador = Total * 0.46F;
        float segundoGanhador = Total * 0.32F;
        float terceiroGanhador = Total - primeiroGanhador - segundoGanhador;

        System.out.println("O primeiro ganhador receberá: R$ " + primeiroGanhador);
        System.out.println("O segundo ganhador receberá: R$ " + segundoGanhador);
        System.out.println("O terceiro ganhador receberá: R$ " + terceiroGanhador);
    }
}
