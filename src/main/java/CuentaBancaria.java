import java.time.LocalDate;

public abstract class CuentaBancaria {
	private int numeroCuenta;
	private LocalDate fechaApertura;
	private Double saldoCuenta;

	public int getNumeroCuenta() {
		return this.numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public LocalDate getFechaApertura() {
		return this.fechaApertura;
	}

	public void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public Double getSaldoCuenta() {
		return this.saldoCuenta;
	}

	public void setSaldoCuenta(Double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}

	public void mostrarDatosCuentaBancaria() {
		throw new UnsupportedOperationException();
	}
}