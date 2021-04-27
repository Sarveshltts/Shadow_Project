import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export class Employee{
  constructor(
    public patient_ID:Number,
    public pat_Name:String,
    public pat_Phone:string,
    public pat_Age:string,
    public pat_Symptoms:string,
  ) {}
}

@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor(
    private httpClient:HttpClient
  ) { 
     }

     getEmployees()
  {
    console.log("test call");
    return this.httpClient.get<Employee[]>('http://localhost:8080/');
  }
  public deleteEmployee(employee:Employee) {
    return this.httpClient.delete<Employee>("http://localhost:8080/pat" + "/"+ employee.patient_ID);
  }
  public createEmployee(employee:Employee) {
    return this.httpClient.post<Employee>("http://localhost:8080/add", employee);
  }
  public updateEmployees(employee:Employee) {
    return this.httpClient.put("http://localhost:8080/patupdate/",employee);
  }
}