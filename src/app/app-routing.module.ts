import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { BodyComponent } from './Homepage/body/body.component';
import { ContactusComponent } from './Contact/contactus/contactus.component';
import { AboutusComponent } from './Contact/aboutus/aboutus.component';
import { CalculatorComponent } from './Emi/calculator/calculator.component';
import { LoginComponent } from './Authentication/login/login.component';
import { AdminloginComponent } from './Authentication/adminlogin/adminlogin.component';
import { SignupComponent } from './Authentication/signup/signup.component';

const routes: Routes = [
  {path:'', component:BodyComponent},
  {path:'contactus', component:ContactusComponent},
  {path:'aboutus', component:AboutusComponent},
  {path:'cal', component:CalculatorComponent},
  {path:'login', component:LoginComponent},
  {path:'adminlogin', component:AdminloginComponent},
  {path:'signup', component:SignupComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
