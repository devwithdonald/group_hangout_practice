import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-edit-basic-user-account-info-form',
  templateUrl: './edit-basic-user-account-info-form.component.html',
  styleUrls: ['./edit-basic-user-account-info-form.component.css']
})
export class EditBasicUserAccountInfoFormComponent implements OnInit {

  /*
  * TODO clear this and load values on ngOnInit
  * based on the logged in employee
  */
  username = 'userExample';
  password = 'passwordExample';
  firstName = 'firstNameExample';
  lastName = 'lastNameExample';

  // toggle show password
  hidePassword = 'password';

  constructor() { }

  ngOnInit() {
    // should use a service that replicates a BasicUser object to load these values
    // they will appear as placeholders when the user loads the page

    // this.username = basicUser.username;
    // this.password = basicUser.username;
    // this.firstName = basicUser.username;
    // this.lastName = basicUser.username;
  }

  togglePassword() {
    if (this.hidePassword === 'password') {
      this.hidePassword = 'text';
    } else {
      this.hidePassword = 'password';
    }
  }

}
