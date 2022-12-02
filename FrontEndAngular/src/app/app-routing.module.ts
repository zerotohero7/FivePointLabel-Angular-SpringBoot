import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddCategoryComponent } from './add-category/add-category.component';
import { AddLivreComponent } from './add-livre/add-livre.component';
import { ListeLivreComponent } from './liste-livre/liste-livre.component';

const routes: Routes = [
  {path:'list-livre' , component:ListeLivreComponent},
  {path:'' , redirectTo:'list-livre' , pathMatch: "full"},
  {path:'add-livre' , component: AddLivreComponent },
  {path:'add-category' , component: AddCategoryComponent }

 ]
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
