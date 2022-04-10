import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookCartComponent } from './components/book-cart/book-cart.component';
import { ProductItemComponent } from './components/book-cart/product-list/product-item/product-item.component';

const routes: Routes = [
  { path: '', component: BookCartComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
