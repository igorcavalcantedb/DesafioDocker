package com.fullcycle.desafio.docker.pfa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.fullcycle.desafio.docker.pfa.model.Modulo;
import com.fullcycle.desafio.docker.pfa.repository.ModuloRepository;

@Component
public class DataBaseInit implements ApplicationRunner {
	@Autowired
	ModuloRepository moduloRepository;

	private void populateDB() {
		if (moduloRepository.count() == 0) {

			for (int i = 0; i < 10; i++) {
				String nome = "Docker" + i;
				Modulo modulo = new Modulo(nome, i);
				moduloRepository.save(modulo);
			}
		}
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		populateDB();

	}

}
