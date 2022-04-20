package com.dio.gftStartWoman.subsistema2.cep;

import com.dio.gftStartWoman.singleton.SingletonEager;

public class cepApi {

    private static cepApi instacia = new cepApi();

    private cepApi() {

        super();
    }

    public static cepApi getInstacia() {
        return instacia;
    }

    public String recuperarCidade( String cep){
        return "Januária";
    }
    public String recuperarEstado( String cep){
        return "MG";
    }
}
