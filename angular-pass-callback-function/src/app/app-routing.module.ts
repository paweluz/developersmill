import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {FavouriteCountriesComponent} from "./favourite-countries/favourite-countries.component";
import {AllCountriesComponent} from "./all-countries/all-countries.component";

const routes: Routes = [
  {path: 'favourites', component: FavouriteCountriesComponent},
  {path: 'all', component: AllCountriesComponent},
  {path: '', redirectTo: 'all', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
