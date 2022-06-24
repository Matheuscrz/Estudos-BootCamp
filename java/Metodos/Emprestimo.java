package Metodos;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Emprestimo {
    public static void calcula(double valor, int parcelas, double juros) {
        double valorParcela = valor/parcelas;
        double valorJuros = valorParcela*juros;
        double valorPago = valorJuros + valorParcela;
        double valorTotal = valorPago * parcelas;
        DecimalFormat decimalFormat = (DecimalFormat)NumberFormat.getCurrencyInstance();
        decimalFormat.setMinimumFractionDigits(2);
        String valorRequerido = decimalFormat.format(valor);
        String valorMensal = decimalFormat.format(valorPago);
        String total = decimalFormat.format(valorTotal);
        System.out.println("Valor solicitado: " + valorRequerido);
        System.out.println("Número de parcelas: " + parcelas);
        System.out.println("Juros ao mês : " + juros);
        System.out.println("Valor das Parcelas: " + valorMensal);
        System.out.println("Valor total pago: " + total);
    }
}
