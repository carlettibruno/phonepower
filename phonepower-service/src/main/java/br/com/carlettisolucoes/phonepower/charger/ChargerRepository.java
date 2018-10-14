package br.com.carlettisolucoes.phonepower.charger;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChargerRepository extends CrudRepository<Charger, Long> {

}