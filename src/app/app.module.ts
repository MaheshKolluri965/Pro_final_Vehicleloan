import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { HttpClientModule } from '@angular/common/http'; 

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './Homepage/header/header.component';
import { FooterComponent } from './Homepage/footer/footer.component';
import { BodyComponent } from './Homepage/body/body.component';
import { ContactusComponent } from './Contact/contactus/contactus.component';
import { AboutusComponent } from './Contact/aboutus/aboutus.component';
import { CalculatorComponent } from './Emi/calculator/calculator.component';
import { LoginComponent } from './Authentication/login/login.component';
import { AdminloginComponent } from './Authentication/adminlogin/adminlogin.component';
import { SignupComponent } from './Authentication/signup/signup.component';

import { EmiService } from './Services/emi.service';
import { RegistrationService } from './Services/registration.service';

import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    BodyComponent,
    ContactusComponent,
    AboutusComponent,
    CalculatorComponent,
    LoginComponent,
    AdminloginComponent,
    SignupComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [
    EmiService,
    RegistrationService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
