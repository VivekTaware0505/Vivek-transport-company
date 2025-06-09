import { Component } from '@angular/core';
import { BookingComponent } from "../../MyForm/booking/booking.component";

@Component({
  selector: 'app-hero',
  standalone: true,
  imports: [BookingComponent],
  templateUrl: './hero.component.html',
  styleUrl: './hero.component.css'
})
export class HeroComponent {

}
