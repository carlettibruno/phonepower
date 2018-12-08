import { Component, OnInit } from '@angular/core';
import { LocationService } from '../location.service';

@Component({
  selector: 'app-locations',
  templateUrl: './locations.component.html',
  styleUrls: ['./locations.component.css']
})
export class LocationsComponent implements OnInit {

  lat: number;
  lng: number;
  locations: any;

  constructor(private locationService: LocationService) {
  }

  ngOnInit() {
    if(window.navigator.geolocation){
        window.navigator.geolocation.getCurrentPosition(position => {
        this.lat = position.coords.latitude;
        this.lng = position.coords.longitude;
      });
    }

    this.locationService.find({}).subscribe(list => {
      this.locations = list;
    });
  }

}
