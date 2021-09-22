import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {  Observable } from 'rxjs';
import { receiver } from './receiver';
@Injectable({
  providedIn: 'root'
})
export class ReceiverService {
 
  

  constructor(private http:HttpClient) {
  }
  public urll:string="http://localhost:8282/receiver"
    public  fetchReceiver(id:string):Observable<receiver>
    {
      //return this.http.get('${this.url}/receiver/${id}');
      return this.http.get<receiver>(this.urll+"/"+id);
    }
    
   }

