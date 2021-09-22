import { Component } from '@angular/core';
import { FormControl,FormGroup } from '@angular/forms';
import { customer} from './customer/customer.component';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
   title='customer';
    customerform= new FormGroup({
      bookingdate:new FormControl(''),
      customerid:new FormControl(''),
      accountholdername:new FormControl(''),
      creditbalance:new FormControl(''),
      overdraft:new FormControl(''),
      amount:new FormControl(''),
      addtransferfee: new FormControl(''),
      BIC: new FormControl(''),
      Instname: new FormControl(''),
      code: new FormControl(''),
      Account_no: new FormControl(''),
      type:new FormControl(''),
    })
 collectData()
 {

  console.warn(this.customerform.value);
 }


}
