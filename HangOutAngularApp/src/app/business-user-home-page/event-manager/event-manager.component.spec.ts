import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EventMangagerComponent } from './event-mangager.component';

describe('EventMangagerComponent', () => {
  let component: EventMangagerComponent;
  let fixture: ComponentFixture<EventMangagerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EventMangagerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EventMangagerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
