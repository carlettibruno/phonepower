import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AgmCoreModule } from '@agm/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LocationsComponent } from './locations/locations.component';
import { SignupComponent } from './signup/signup.component';
import { SigninComponent } from './signin/signin.component';
import { RegisterLocationComponent } from './register-location/register-location.component';

@NgModule({
  declarations: [
    AppComponent,
    LocationsComponent,
    SignupComponent,
    SigninComponent,
    RegisterLocationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyCIldb_T-jWPjk24eCdC1HrvwmDZcQVPcg'
    })
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
