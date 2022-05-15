import {Component, Input, OnInit} from '@angular/core';
import {CountryService} from "../services/country.service";
import {Country} from "../model/country";
import {Observable} from "rxjs";

@Component({
  selector: 'app-country-table',
  templateUrl: './country-table.component.html',
  styleUrls: ['./country-table.component.css']
})
export class CountryTableComponent implements OnInit {

  countries: Country[] = [];
  @Input() request: () => Observable<Country[]> = this.countryService.getAllCountries.bind(this.countryService);

  constructor(private countryService: CountryService) {
  }

  ngOnInit(): void {
    this.request().subscribe(data => {
      this.countries = data;
      // any other operations
    }, error => console.log(error));
  }

}
