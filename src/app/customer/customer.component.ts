import { Component, OnInit } from '@angular/core';
import { FormControl,FormGroup } from '@angular/forms';
import { CustomerService } from '../customer.service';
import { receiver } from '../receiver';
import { ReceiverService } from '../receiver.service';


@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class customer implements OnInit {
  
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
  receiver: receiver | undefined;
  customerid: any;
  accountholdername: any;
  creditbalance: any;
  overdraft: any;
  constructor(private customerservice:CustomerService, private receiverservice:ReceiverService) {
  
   }

  ngOnInit(): void {
  }
  fetchCustomer(event:any){
    if(event.target.value.length == 14) {
      let cu = this.customerform.controls['customerid'].value
      this.customerservice.fetchCustomer(cu)
        .subscribe( res =>{
          this.customerid = res.customerid
          this.customerform.setValue({accountholdername: res.accountholdername, creditbalance: res.creditbalance, 
            overdraft: res.overdraft});
    }
  ,
  
  function fetchReceiver(event:any) => {
    this.receiverservice.fetchReceiver(this.customerform.value.bic)
    .subscribe((res: { bic: any; Instname: any; }) =>{
      this.receiver = new receiver(res.bic,res.Instname)
      console.log(res.bic)
      console.log(res.Instname)
  }),
  }

    const collectData = () =>
{

console.warn(this.customerform.value);
}
}
 

 

}

