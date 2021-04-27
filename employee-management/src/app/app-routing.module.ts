import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddEmployeeComponent } from './add-employee/add-employee.component';

import { EmployeeComponent } from './employee/employee.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { AuthGuardService } from './service/authguard.service';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';

const routes: Routes = [
  { path:'', component: EmployeeComponent,canActivate:[AuthGuardService]},
  { path: 'add',component: AddEmployeeComponent,canActivate:[AuthGuardService]},
  { path:'login',component: LoginComponent},
  { path:'logout',component: LogoutComponent,canActivate:[AuthGuardService]},
  { path:'patupdate/:id',component: UpdateEmployeeComponent,canActivate:[AuthGuardService]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
}
)
export class AppRoutingModule { }
