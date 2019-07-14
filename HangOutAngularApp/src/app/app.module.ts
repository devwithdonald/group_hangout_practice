import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { Routes, RouterModule } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { LoginFormComponent } from './login/login-form/login-form.component';
import { BusinessUserHomePageComponent } from './business-user-home-page/business-user-home-page.component';
import { EventMangagerComponent } from './business-user-home-page/event-mangager/event-mangager.component';
import { SubscribersComponent } from './business-user-home-page/subscribers/subscribers.component';
import { EmployeeManagerComponent } from './business-user-home-page/employee-manager/employee-manager.component';
import { AddBusinessEventComponent } from './business-user-home-page/event-manager/add-business-event/add-business-event.component';
import { BusinessUserVSPEComponent } from './business-user-home-page/event-manager/business-user-vspe/business-user-vspe.component';
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
    EventMangagerComponent,
    SubscribersComponent,
    EmployeeManagerComponent,
    AddBusinessEventComponent,
    BusinessUserVSPEComponent,
    UpdateBusinessEventComponent,
    DiscountComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
