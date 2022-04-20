package com.dio.gftStartWoman.facade;

import com.dio.gftStartWoman.subsistema1.crm.CrmService;
import com.dio.gftStartWoman.subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstacia().recuperarCidade(cep);
        String estado = CepApi.getInstacia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
