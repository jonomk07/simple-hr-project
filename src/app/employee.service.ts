import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private http: HttpClient) { }

  getEmployees(): Observable<object> {
    // access HttpClient
    // Import HttpClientModule and inject it into the constructor in the app.module.ts
    return this.http.get("http://localhost:8080/employees");
  }

}
