import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { RegistrationService } from 'src/app/Services/registration.service';
import { RegisterLogin } from 'src/app/model/RegisterandLogin';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {

  registration: RegisterLogin = new RegisterLogin();

  constructor(private _registerService: RegistrationService){}

  signup:any

  register(reg: NgForm){
    this._registerService.registerUser(this.registration).subscribe({
      next: (data: any) => {
        this.signup = data;
        console.log(data);
      },
      error: (error: any) => {
        console.error("Error in Registration: ", error);
      }
    });
  }

}
