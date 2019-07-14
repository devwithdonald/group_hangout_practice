import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { Routes, RouterModule } from '@angular/router';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { LoginFormComponent } from './login/login-form/login-form.component';


import { FormsModule } from '@angular/forms';
import { BusinessUserHomePageComponent } from './business-user-home-page/business-user-home-page.component';
import { EventManagerComponent } from './business-user-home-page/event-manager/event-manager.component';
import { SubscribersComponent } from './business-user-home-page/subscribers/subscribers.component';
import { EmployeeManagerComponent } from './business-user-home-page/employee-manager/employee-manager.component';
import { AddBusinessEventComponent } from './business-user-home-page/event-manager/add-business-event/add-business-event.component';
import { BusinessUserVSPEComponent } from './business-user-home-page/event-manager/business-user-vspe/business-user-vspe.component';
// tslint:disable-next-line: max-line-length
import { UpdateBusinessEventComponent } from './business-user-home-page/event-manager/update-business-event/update-business-event.component';
import { DiscountComponent } from './business-user-home-page/subscribers/discount/discount.component';


const appRoutes: Routes = [
    { path: '', component: LoginComponent}
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
      DiscountComponent
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
