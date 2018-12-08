import { Component, OnInit, Input } from '@angular/core';

import { LocationService } from '../location.service';

import { Location } from '../location';

@Component({
  selector: 'app-register-location',
  templateUrl: './register-location.component.html',
  styleUrls: ['./register-location.component.css']
})
export class RegisterLocationComponent implements OnInit {

  lat: number;
  lng: number;
  location = new Location(null, '', null, null);

  constructor(private locationService: LocationService) {
  }

  ngOnInit() {
    if(window.navigator.geolocation){
        window.navigator.geolocation.getCurrentPosition(position => {
        this.lat = position.coords.latitude;
        this.lng = position.coords.longitude;
      });
    }
  }

  save(): void {
    if(window.navigator.geolocation){
        window.navigator.geolocation.getCurrentPosition(position => {
        this.location.lat = position.coords.latitude;
        this.location.lng = position.coords.longitude;
        this.locationService.save(this.location);
      });
    }
  }

}
