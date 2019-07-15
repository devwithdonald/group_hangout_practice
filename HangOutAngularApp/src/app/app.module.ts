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
import { DiscountComponent } from './discount/discount.component';
import { BasicUserAccountInfoComponent } from './basic-user-account-info/basic-user-account-info.component';
// tslint:disable-next-line: max-line-length
import { BasicUserAccountInfoFormComponent } from './basic-user-account-info/basic-user-account-info-form/basic-user-account-info-form.component';
import { RegisterFormComponent } from './register/register-form/register-form.component';
// tslint:disable-next-line: max-line-length
import { BusinessUserCurrentEventViewComponent } from './business-user-home-page/business-user-current-event-view/business-user-current-event-view.component';
// tslint:disable-next-line: max-line-length
import { BusinessUserLoyalSubscribersViewComponent } from './business-user-home-page/business-user-loyal-subscribers-view/business-user-loyal-subscribers-view.component';
import { EditBasicUserAccountInfoComponent } from './edit-basic-user-account-info/edit-basic-user-account-info.component';
// tslint:disable-next-line: max-line-length
import { EditBasicUserAccountInfoFormComponent } from './edit-basic-user-account-info/edit-basic-user-account-info-form/edit-basic-user-account-info-form.component';
import { BasicUserPrivateEventsComponent } from './basic-user-private-events/basic-user-private-events.component';
// tslint:disable-next-line: max-line-length
import { BasicUserPrivateEventsTableComponent } from './basic-user-private-events/basic-user-private-events-table/basic-user-private-events-table.component';
// tslint:disable-next-line: max-line-length
import { BasicUserPrivateEventsAddEventButtonComponent } from './basic-user-private-events/basic-user-private-events-add-event-button/basic-user-private-events-add-event-button.component';
// tslint:disable-next-line: max-line-length
import { BasicUserPrivateEventsUpdateEventButtonComponent } from './basic-user-private-events/basic-user-private-events-update-event-button/basic-user-private-events-update-event-button.component';
import { UpdateBusinessEventFormComponent } from './update-business-event/update-business-event-form/update-business-event-form.component';
import { BasicUserUpdateEventComponent } from './basic-user-update-event/basic-user-update-event.component';
import { BasicUserUpdateEventFormComponent } from './basic-user-update-event/basic-user-update-event-form/basic-user-update-event-form.component';


const appRoutes: Routes = [
    { path: '', component: LoginComponent},
    { path: 'BasicUser/ViewAccountInfo', component: BasicUserAccountInfoComponent},
    { path: 'register', component: RegisterComponent},
    { path: 'BasicUser/EditAccountInfo', component: EditBasicUserAccountInfoComponent},
    { path: 'BasicUser/PrivateEvents', component: BasicUserPrivateEventsComponent},
    { path: 'BusinessUser/BusinessUserEventManager', component: EventManagerComponent},
    { path: 'BusinessUser/BusinessUserEventManager/BusinessUserUpdateBusinessEvent', component: UpdateBusinessEventComponent},
    { path: 'BusinessUser/HomePage', component: BusinessUserHomePageComponent},
    { path: 'BasicUser/PrivateEvents/UpdateEvent', component: BasicUserUpdateEventComponent}

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
      RegisterFormComponent,
      BusinessUserCurrentEventViewComponent,
      BusinessUserLoyalSubscribersViewComponent,
      EditBasicUserAccountInfoComponent,
      EditBasicUserAccountInfoFormComponent,
      BasicUserPrivateEventsComponent,
      BasicUserPrivateEventsTableComponent,
      BasicUserPrivateEventsAddEventButtonComponent,
      BasicUserPrivateEventsUpdateEventButtonComponent,
      UpdateBusinessEventFormComponent,
      BasicUserUpdateEventComponent,
      BasicUserUpdateEventFormComponent

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
