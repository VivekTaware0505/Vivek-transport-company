import { Routes } from '@angular/router';
import { HeroComponent } from './component/hero/hero.component';
import { AboutpageComponent } from './component/aboutpage/aboutpage.component';
import { LoginpageComponent } from './component/loginpage/loginpage.component';
import { AdmindashComponent } from './component/admindash/admindash.component';

export const routes: Routes = [

    {path:"",component:HeroComponent},
    {path:"aboutpage",component:AboutpageComponent},
    {path:"login",component:LoginpageComponent},
    {path:"admin",component:AdmindashComponent},
    

];
