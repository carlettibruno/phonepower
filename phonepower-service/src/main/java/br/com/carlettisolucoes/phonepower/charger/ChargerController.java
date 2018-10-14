package br.com.carlettisolucoes.phonepower.charger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carlettisolucoes.spring.generic.controller.CrudController;

@RestController
@RequestMapping("/chargers")
@EnableAutoConfiguration
public class ChargerController extends CrudController<Charger, Long> {

	@Autowired
	public ChargerController(ChargerService service) {
		super(service);
	}

}
