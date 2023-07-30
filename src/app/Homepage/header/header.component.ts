import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {

  constructor(private _route: Router) { }

  goToHome() {
    this._route.navigate(["/"]);
  }

  goToUserSignUp(){
    this._route.navigate(["/signup"]);
  }

  goToUserLogin(){
    this._route.navigate(["/login"]);
  }

  goToAdminLogin(){
    this._route.navigate(["/adminlogin"]);
  }

  goToEmiCal(){
    this._route.navigate(["/cal"]);
  }

  goToAboutUs(){
    this._route.navigate(["/aboutus"])
  }

  goToContactUs(){
    this._route.navigate(["/contactus"]);
  }


}
