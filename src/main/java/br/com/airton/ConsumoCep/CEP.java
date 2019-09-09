package br.com.airton.ConsumoCep;

public class CEP {
	
	  // propriedades do CEP
    public String CEP;
    public String Logradouro;
    public String Complemento;
    public String Bairro;
    public String Localidade;
    public String Uf;
    public String Ibge;
    public String Gia;
   
    
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getLogradouro() {
		return Logradouro;
	}
	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}
	public String getComplemento() {
		return Complemento;
	}
	public void setComplemento(String complemento) {
		Complemento = complemento;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public String getLocalidade() {
		return Localidade;
	}
	public void setLocalidade(String localidade) {
		Localidade = localidade;
	}
	public String getUf() {
		return Uf;
	}
	public void setUf(String uf) {
		Uf = uf;
	}
	public String getIbge() {
		return Ibge;
	}
	public void setIbge(String ibge) {
		Ibge = ibge;
	}
	public String getGia() {
		return Gia;
	}
	public void setGia(String gia) {
		Gia = gia;
	}
	
	@Override
	public String toString() {
		return "CEP [CEP=" + CEP + ", Logradouro=" + Logradouro + ", Complemento=" + Complemento + ", Bairro=" + Bairro
				+ ", Localidade=" + Localidade + ", Uf=" + Uf + ", Ibge=" + Ibge + ", Gia=" + Gia + "]";
	}


}
