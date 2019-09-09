package br.com.airton.ConsumoCep;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;


import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonValue;
import java.util.*;

public class ClienteWS {

	// Autor: Airton Silva
	// 09/09/2019

	// Criando campos que serão retornados no JSON
	private static final Set<String> CAMPOS = new HashSet<String>(
			Arrays.asList("cep", "logradouro", "complemento", "bairro", "localidade", "uf", "unidade", "ibge", "gia"));

	/**
	 * Recupera objeto Endereco pelo CEP
	 * 
	 * @param cep String no formato 00000000
	 * @return instancia de br.com.viacep.Endereco
	 */

	
	
	// método que irá puxar o endereço pelo CEP já intanciando o objeto Endereco
	public static Endereco getEnderecoPorCep(String cep) {

		JsonObject jsonObject = getCepResponse(cep);
		Endereco endereco = null;
		JsonValue erro = jsonObject.get("erro");
		
		//instanciando objeto e posições
        if (erro == null) {
            endereco = new Endereco()
                    .setCep(jsonObject.getString("cep"))
                    .setLogradouro(jsonObject.getString("logradouro"))
                    .setComplemento(jsonObject.getString("complemento"))
                    .setBairro(jsonObject.getString("bairro"))
                    .setLocalidade(jsonObject.getString("localidade"))
                    .setUf(jsonObject.getString("uf"))
                    .setUnidade(jsonObject.getString("unidade"))
                    .setIbge(jsonObject.getString("ibge"))
                    .setGia(jsonObject.getString("gia"));

        }

        return endereco;
    }



	// MÉTODO QUE IRÁ FAZER A CHAMADA PARA A API
	private static JsonObject getCepResponse(String cep) {

		JsonObject responseJO = null;

		try {

			DefaultHttpClient httpclient = new DefaultHttpClient();
			HttpGet httpGet = new HttpGet("https://viacep.com.br/ws/" + cep + "/json");
			HttpResponse response = httpclient.execute(httpGet);

			HttpEntity entity = response.getEntity();

			responseJO = Json.createReader(entity.getContent()).readObject();

		} catch (Exception e) {
			// TODO: handle exception
		}
		return responseJO;

	}

}