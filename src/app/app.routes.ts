import { Routes } from '@angular/router';
import { HeroComponent } from './component/hero/hero.component';
import { AboutpageComponent } from './component/aboutpage/aboutpage.component';

export const routes: Routes = [

    {path:"",component:HeroComponent},
    {path:"aboutpage",component:AboutpageComponent},
    

];
