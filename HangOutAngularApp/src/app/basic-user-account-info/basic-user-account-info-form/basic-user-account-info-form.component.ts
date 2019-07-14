import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-basic-user-account-info-form',
  templateUrl: './basic-user-account-info-form.component.html',
  styleUrls: ['./basic-user-account-info-form.component.css']
})
export class BasicUserAccountInfoFormComponent implements OnInit {

  basicUserUsername: string;
  basicUserPassword: string;
  basicUserFirstName: string;
  basicUserLastName: string;

  constructor() { }

  ngOnInit() {
  }

}
