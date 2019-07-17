import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';

import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';

import {
  MatButtonModule,
  MatToolbarModule,
  MatMenuModule
} from '@angular/material';

import { NavbarComponent } from './navbar/navbar.component';
import { BuildComponent } from './build/build.component';
import { BuildsComponent } from './builds/builds.component';
import { ProductComponent } from './product/product.component';

const routes: Routes = [
  { path: 'build', component: BuildComponent },
  { path: 'builds', component: BuildsComponent },
  { path: 'products/:type', component: ProductComponent },
];

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    BuildComponent,
    BuildsComponent,
    ProductComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    RouterModule.forRoot(routes),
    MatButtonModule,
    MatToolbarModule,
    MatMenuModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
