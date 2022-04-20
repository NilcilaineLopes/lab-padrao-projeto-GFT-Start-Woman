package com.dio.gftStartWoman.subsistema2.cep;

public class CepApi {

    private static CepApi instacia = new CepApi();

    private CepApi() {

        super();
    }

    public static CepApi getInstacia() {
        return instacia;
    }

    public String recuperarCidade( String cep){
        return "Januária";
    }
    public String recuperarEstado( String cep){
        return "MG";
    }
}
