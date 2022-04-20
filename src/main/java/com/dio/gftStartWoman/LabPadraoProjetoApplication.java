package com.dio.gftStartWoman;

import com.dio.gftStartWoman.singleton.SingletonEager;
import com.dio.gftStartWoman.singleton.SingletonLazy;
import com.dio.gftStartWoman.singleton.SingletonLazyHolder;
import com.dio.gftStartWoman.strategy.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LabPadraoProjetoApplication {

	// Teste relacionados so Designer  Pattern
	// Singleton

	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstacia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstacia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstacia();
		System.out.println(eager);
		eager = SingletonEager.getInstacia();
		System.out.println(eager);

		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstacia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstacia();
		System.out.println(lazyHolder);

		// Strategy

		Comportamento agressivo = new ComportamentoAgressivo();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();

		Robo robo = new Robo();
		robo.setCompotamentto(agressivo);

		robo.mover();
		robo.mover();

		robo.setCompotamentto(defensivo);

		robo.mover();
		robo.mover();

		robo.setCompotamentto(normal);

		robo.mover();
		robo.mover();
	}

}
