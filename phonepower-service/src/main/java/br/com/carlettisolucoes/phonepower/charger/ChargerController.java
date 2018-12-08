package br.com.carlettisolucoes.phonepower.charger;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chargers")
@CrossOrigin(origins="*")
public class ChargerController {

	@Autowired
	private ChargerRepository repo;
	
	@GetMapping
	public Iterable<Charger> findAll() {
		return this.repo.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Void> create(@RequestBody Charger charger) {
		this.repo.save(charger);
		return ResponseEntity.created(URI.create("/chargers/"+charger.getId())).build();
	}

}