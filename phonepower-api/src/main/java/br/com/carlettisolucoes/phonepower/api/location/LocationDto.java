package br.com.carlettisolucoes.phonepower.api.location;

import java.io.Serializable;

public class LocationDto implements Serializable {

	private static final long serialVersionUID = 2701714958576223623L;

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