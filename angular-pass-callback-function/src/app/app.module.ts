import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {AllCountriesComponent} from './all-countries/all-countries.component';
import {CountryTableComponent} from './country-table/country-table.component';
import {FavouriteCountriesComponent} from './favourite-countries/favourite-countries.component';

@NgModule({
  declarations: [
    AppComponent,
    AllCountriesComponent,
    CountryTableComponent,
    FavouriteCountriesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
