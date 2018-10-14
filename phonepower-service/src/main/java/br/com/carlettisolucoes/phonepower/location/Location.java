package br.com.carlettisolucoes.phonepower.location;

import br.com.carlettisolucoes.spring.generic.model.CrudModel;

public class Location implements CrudModel<Long> {

	private static final long serialVersionUID = -1096776150268619545L;

	private Long id;
	
	private Double lat;
	
	private Double lng;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLng() {
		return lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}

}