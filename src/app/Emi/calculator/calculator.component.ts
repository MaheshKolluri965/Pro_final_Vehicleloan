import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { EmiService } from 'src/app/Services/emi.service';
import { EmiCalmodel } from 'src/app/model/emical.model';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent {

  emiRequest: EmiCalmodel = new EmiCalmodel();

  constructor(private _emiService: EmiService) { }

  public emi_int_amout = 0;
  public emi_total_amount = 0;

  public emi = 0;

  calculateEMI(emiFrom: NgForm): void {
    this._emiService.emiCalculator(this.emiRequest).subscribe({
      next: (data: any) => {
        this.emi = data.emipm,
          this.emi_int_amout = data.roiAmount,
          this.emi_total_amount = data.totalPayment,
          console.log(data);
      },
      error: (error: any) => {
        console.error("Error in Calculating EMI: ", error);
      }
    });
  }

  resetForm(emiForm: any) {
    emiForm.resetForm();

    this.emi_int_amout = 0;
    this.emi_total_amount = 0;
    this.emi = 0;

  }


}
