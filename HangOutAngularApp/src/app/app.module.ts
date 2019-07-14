import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { Routes, RouterModule } from '@angular/router';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { LoginFormComponent } from './login/login-form/login-form.component';


import { FormsModule } from '@angular/forms';
import { RegisterComponent } from './register/register.component';
import { BusinessUserHomePageComponent } from './business-user-home-page/business-user-home-page.component';
import { EventManagerComponent } from './event-manager/event-manager.component';
import { SubscribersComponent } from './subscribers/subscribers.component';
import { EmployeeManagerComponent } from './employee-manager/employee-manager.component';
import { AddBusinessEventComponent } from './add-business-event/add-business-event.component';
import { BusinessUserVSPEComponent } from './business-user-vspe/business-user-vspe.component';
// tslint:disable-next-line: max-line-length
import { UpdateBusinessEventComponent } from './update-business-event/update-business-event.component';
import { DiscountComponent } from './subscribers/discount/discount.component';
import { BasicUserAccountInfoComponent } from './basic-user-account-info/basic-user-account-info.component';
import { BasicUserAccountInfoFormComponent } from './basic-user-account-info/basic-user-account-info-form/basic-user-account-info-form.component';
import { RegisterFormComponent } from './register/register-form/register-form.component';



const appRoutes: Routes = [
    { path: '', component: LoginComponent},
    { path: 'BasicUserAccountInfo', component: BasicUserAccountInfoComponent},
    { path: 'register', component: RegisterComponent}
  ];

@NgModule({
    declarations: [
      AppComponent,
      LoginComponent,
      LoginFormComponent,
      BusinessUserHomePageComponent,
      EventManagerComponent,
      SubscribersComponent,
      EmployeeManagerComponent,
      AddBusinessEventComponent,
      BusinessUserVSPEComponent,
      UpdateBusinessEventComponent,
      DiscountComponent,
      BasicUserAccountInfoComponent,
      BasicUserAccountInfoFormComponent,
      RegisterComponent,
      RegisterFormComponent
    ],
    imports: [
      FormsModule,
      BrowserModule,
      AppRoutingModule,
      NgbModule,
      RouterModule.forRoot(appRoutes)
    ],
    providers: [],
    bootstrap: [AppComponent]
  })
  export class AppModule { }
