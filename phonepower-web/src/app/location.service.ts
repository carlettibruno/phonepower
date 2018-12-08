import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from '../environments/environment';
import { Observable } from 'rxjs';
import { Location } from './location';

@Injectable({
  providedIn: 'root'
})
export class LocationService {

  phonepowerBaseUrl = environment.phonepowerBaseUrl;

  constructor(private http: HttpClient) { }

  save(location: Location): void {
    this.http.post(this.phonepowerBaseUrl + '/chargers', location).subscribe(
            data => {
                console.log("POST Request is successful ", data);
            },
            error => {
                console.log("Error", error);
            }
        );
  }

  find(params: any): Observable<any> {
    return this.http.get(this.phonepowerBaseUrl + '/chargers', params);
  }

}
