import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { EmiCalmodel } from '../model/emical.model';

@Injectable({
  providedIn: 'root'
})
export class RoutingServiceService {

  httpBaseUrl:string="http://localhost:9098/rest/api";

  constructor(private _myhttp:HttpClient) { }
  

}
