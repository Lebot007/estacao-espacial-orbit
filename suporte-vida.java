import java.util.Locale;

class SuporteVida {
    private static final double OXIGENIO_MINIMO = 19.5;
    private static final double OXIGENIO_MAXIMO = 23.5;
    private static final double TEMPERATURA_MINIMA = 18.0;
    private static final double TEMPERATURA_MAXIMA = 27.0;
    private static final double PRESSAO_MINIMA = 95.0;
    private static final double PRESSAO_MAXIMA = 105.0;

    public static String monitorarNiveis(double oxigenio, double temperatura, double pressao) {
        boolean oxigenioSeguro = oxigenio >= OXIGENIO_MINIMO && oxigenio <= OXIGENIO_MAXIMO;
        boolean temperaturaSegura = temperatura >= TEMPERATURA_MINIMA && temperatura <= TEMPERATURA_MAXIMA;
        boolean pressaoSegura = pressao >= PRESSAO_MINIMA && pressao <= PRESSAO_MAXIMA;

        if (oxigenioSeguro && temperaturaSegura && pressaoSegura) {
            return "NIVEIS NOMINAIS";
        }

        StringBuilder alertas = new StringBuilder("ALERTA:");
        if (!oxigenioSeguro) {
            alertas.append(" oxigenio fora do intervalo;");
        }
        if (!temperaturaSegura) {
            alertas.append(" temperatura fora do intervalo;");
        }
        if (!pressaoSegura) {
            alertas.append(" pressao fora do intervalo;");
        }
        return alertas.toString();
    }

    public static void main(String[] args) {
        double oxigenio = 21.0;
        double temperatura = 22.0;
        double pressao = 101.3;

        System.out.printf(
                Locale.US,
                "Leituras: O2=%.1f%%, temperatura=%.1f C, pressao=%.1f kPa%n",
                oxigenio,
                temperatura,
                pressao
        );
        System.out.println(monitorarNiveis(oxigenio, temperatura, pressao));
    }
}
