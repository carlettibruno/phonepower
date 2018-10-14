package br.com.carlettisolucoes.phonepower.charger;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.carlettisolucoes.spring.generic.service.CrudService;

public class ChargerService extends CrudService<Charger, Long> {

	@Autowired
	public ChargerService(ChargerRepository repo) {
		super(repo);
	}
	
}