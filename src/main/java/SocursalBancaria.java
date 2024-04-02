import java.util.ArrayList;

public class SocursalBancaria {
	private String codigoSocursal;
	private int codigoPostal;
	private ArrayList<CuentaBancaria> cuentasBancarias = new ArrayList<CuentaBancaria>();

	public String getCodigoSocursal() {
		return this.codigoSocursal;
	}

	public void setCodigoSocursal(String codigoSocursal) {
		this.codigoSocursal = codigoSocursal;
	}

	public int getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
}