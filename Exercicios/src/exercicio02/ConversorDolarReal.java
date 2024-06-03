package exercicio02;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConversorDolarReal {

	private double dolar;
	static private double cotacao = 5.81;

	public ConversorDolarReal() {
		super();
	}

	public ConversorDolarReal(double dolar) {
		super();
		this.dolar = dolar;
	}

	public double getDolar() {
		return dolar;
	}

	public void setDolar(double dolar) {
		this.dolar = dolar;
	}

	public static double getCotacao() {
		return cotacao;
	}
	
	public Double converter(Double dolar) {
		Double real = (dolar * cotacao);
		return real;

	}
	public BigDecimal arredondar(Double real) {
		BigDecimal valorArredondado = new BigDecimal(real).setScale(2,RoundingMode.HALF_EVEN);
		return valorArredondado;
	}

}
