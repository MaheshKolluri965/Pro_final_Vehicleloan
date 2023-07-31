import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { LoginService } from 'src/app/Services/login.service';
import { RegisterLogin } from 'src/app/model/RegisterandLogin';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent {
  login: RegisterLogin = new RegisterLogin();

  constructor(private _loginService: LoginService){}

  check: any;

  adminloginForm(log: NgForm){
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
