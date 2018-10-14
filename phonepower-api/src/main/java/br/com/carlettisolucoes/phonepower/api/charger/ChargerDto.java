package br.com.carlettisolucoes.phonepower.api.charger;

import java.io.Serializable;

import br.com.carlettisolucoes.phonepower.api.location.LocationDto;

public class ChargerDto implements Serializable {

	private static final long serialVersionUID = 7274753579165219899L;
	
	private Long id;
	
	private LocationDto location;
	
	private String mainPhotoRef;
	
	private Boolean enable;
	
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocationDto getLocation() {
		return location;
	}

	public void setLocation(LocationDto location) {
		this.location = location;
	}

	public String getMainPhotoRef() {
		return mainPhotoRef;
	}

	public void setMainPhotoRef(String mainPhotoRef) {
		this.mainPhotoRef = mainPhotoRef;
	}

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}