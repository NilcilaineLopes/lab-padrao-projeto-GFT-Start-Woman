package com.dio.gftStartWoman.strategy;

public class Robo {
    private Comportamento compotamentto;

    public void setCompotamentto(Comportamento strategy) {
        this.compotamentto = strategy;
    }

    public void mover(){
        compotamentto.mover();
    }
}
