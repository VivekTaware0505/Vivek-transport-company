import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-booking',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './booking.component.html',
  styleUrl: './booking.component.css'
})
export class BookingComponent {

  url = "http://localhost:8080/book";



constructor(public http:HttpClient){

}


  formsubmit(data:any){
    console.log("submited.....");
    console.log(data);
    console.log(data.value);



    this.http.post(this.url, data.value).subscribe(
      {
        next: (res:any)=>{

          console.log(res);
          if(res){
            alert("Booking sucsfully...")
          }
          

        }
      }
    )
    
    
    
  }

}
