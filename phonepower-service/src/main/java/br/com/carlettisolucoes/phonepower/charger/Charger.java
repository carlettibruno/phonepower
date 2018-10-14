package br.com.carlettisolucoes.phonepower.charger;

import br.com.carlettisolucoes.phonepower.location.Location;
import br.com.carlettisolucoes.spring.generic.model.CrudModel;

public class Charger implements CrudModel<Long> {

	private static final long serialVersionUID = -221435528199312966L;

	private Long id;
	
	private Location location;
	
	private String mainPhotoRef; //TODO make a service to provide files, photos and more.
	
	private Boolean enable;
	
	private String description; //to provide more specifically about location indoor

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
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