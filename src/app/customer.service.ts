import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {  Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class CustomerService {
 

  constructor(private http:HttpClient) {
  }
  public url:string="http://localhost:8282/customer"
  
    public fetchCustomer(customerid:string):Observable<any>
    {
       // return this.http.get('${this.url}/customer/${id}');
       
       return this.http.get<any>(this.url+customerid);
    }
   
    
   }

