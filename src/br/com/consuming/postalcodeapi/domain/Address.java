package br.com.consuming.postalcodeapi.domain;

public class Address {
    String cep;
    String logradouro;
    String bairro;
    String localidade;
    String uf;
    String ddd;

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    public String getDdd() {
        return ddd;
    }

    @Override
    public String toString() {
            return "ADDRESS:\n POSTAL CODE (CEP): " + this.cep + "\n PUBLIC PLACE (LOGRADOURO): " + this.logradouro + "\n NEIGHBORHOOD (BAIRRO): " + this.bairro + "\n LOCALITY (LOCALIDADE): " + this.localidade + "\n FEDERAL UNITY (UF): " + this.uf + "\n AREA CODE(DDD): " + ddd;
    }
}
