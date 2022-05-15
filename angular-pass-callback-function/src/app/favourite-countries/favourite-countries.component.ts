import { Component, OnInit } from '@angular/core';
import {CountryService} from "../services/country.service";
import {Observable} from "rxjs";
import {Country} from "../model/country";

@Component({
  selector: 'app-favourite-countries',
  templateUrl: './favourite-countries.component.html',
  styleUrls: ['./favourite-countries.component.css']
})
export class FavouriteCountriesComponent implements OnInit {

  constructor(public countryService: CountryService) { }

  ngOnInit(): void {
  }

  getRequest():Observable<Country[]>{
    return this.countryService.getFavouritesCountries();
  }
}
