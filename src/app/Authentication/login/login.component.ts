import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { LoginService } from 'src/app/Services/login.service';
import { RegisterLogin } from 'src/app/model/RegisterandLogin';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  login: RegisterLogin = new RegisterLogin();

  constructor(private _loginService: LoginService){}

  check: any;

  loginForm(log: NgForm){
    this._loginService.signin(this.login).subscribe({
      next: (data: any) => {
        this.check = data;
        console.log(data);
      },
      error: (error: any) => {
        console.log("Error in authentication: "+  error)
      }
    });

  }

}
