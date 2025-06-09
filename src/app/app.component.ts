import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { NavComponent } from "./component/nav/nav.component";
import { HeroComponent } from "./component/hero/hero.component";
import { AboutpageComponent } from "./component/aboutpage/aboutpage.component";
import { FooterComponent } from "./component/footer/footer.component";


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, NavComponent, RouterLink, HeroComponent, AboutpageComponent, FooterComponent,],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'vivekTPangular';
}
