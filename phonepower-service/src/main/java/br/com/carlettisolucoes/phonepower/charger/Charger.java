package br.com.carlettisolucoes.phonepower.charger;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Charger implements Serializable {

	private static final long serialVersionUID = -221435528199312966L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@SequenceGenerator(name="seq", initialValue=1, allocationSize=100, sequenceName="charger_seq")
	private Long id;
	
	private Double lat;
	
	private Double lng;
	
	private String mainPhotoRef; //TODO make a service to provide files, photos and more.
	
	private Boolean enable;
	
	private String description; //to provide more specifically about location indoor

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