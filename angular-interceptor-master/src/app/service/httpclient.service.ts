import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

export class Employee {
  constructor(
    public patient_ID:Number,
    public pat_Name:String,
    public pat_Symptoms:string,
    public v_date:string,
    public last_vdate:string,
    //  public doc_ID:number,
   public ename:String
  ) {}
}
export class Employee2 {
  constructor(
    public patient_ID:Number,
    public pat_Name:String,
    public pat_Symptoms:string,
    public pat_Age:string,
    public v_date:string,
    public last_vdate:string,
    public ename:string,
  ) {}
}
export class Names{
  constructor(
    public name:String,
  ){}
}
export class Login{
  constructor(
    public docUser:String,
    public docPass:String
  ){}
}
@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor(
    private httpClient: HttpClient
  ) {
  }

  getEmployees() {
    return this.httpClient.get<Employee[]>('http://localhost:8086/');
  }

  getNames() {
    return this.httpClient.get<Names[]>('http://localhost:8086/getdoc');
  }

  public deleteEmployee(employee) {
    return this.httpClient.delete<Employee>("http://localhost:8086/pat" + "/"+ employee.patient_ID);
  }

  public createEmployee(employee2:Employee2) {
    return this.httpClient.post<Employee2>("http://localhost:8086/add", employee2);
  }
  public updateEmployees(employee){
    return this.httpClient.put("http://localhost:8086/patupdate/",employee);
  }
  public createUser(login)
  {
    return this.httpClient.post<Login>("http://localhost:8086/genuser",login);
  }
  public getDoc(log)
  {
    return this.httpClient.post<Login>("http://localhost:8086/val",log);
  }
}