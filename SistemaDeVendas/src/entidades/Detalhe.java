package entidades;

public class Detalhe {
	private String corPeca;
	private String tamanho;
	private String marca;

	public Detalhe(String corPeca, String tamanho, String marca) {
		this.corPeca = corPeca;
		this.tamanho = tamanho;
		this.marca = marca;
	}

	public String getCorPeca() {
		return corPeca;
	}

	public void setCorPeca(String corPeca) {
		this.corPeca = corPeca;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean compara(Detalhe detalhe) {
		if (corPeca.equals(detalhe.corPeca) && tamanho.equals(detalhe.tamanho) && marca.equals(detalhe.marca)) {
			return true;
		} else {
			return false;
		}

	}
}
