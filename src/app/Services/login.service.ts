import { Injectable } from '@angular/core';
import { RegisterLogin } from '../model/RegisterandLogin';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  httpBaseUrl:string="http://localhost:9098/rest/api";

  constructor(private _loginServicehttp: HttpClient) { }

  signin(sign: RegisterLogin){
    return this._loginServicehttp.post(this.httpBaseUrl+"/login", sign);
  }
}
