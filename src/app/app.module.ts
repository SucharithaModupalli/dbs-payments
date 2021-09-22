import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { customer } from './customer/customer.component';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { receiver } from './receiver';
@NgModule({
  declarations: [
   AppComponent,
   customer,
   receiver
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
