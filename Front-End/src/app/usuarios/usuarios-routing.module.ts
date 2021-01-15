import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UsuariosFormComponent } from './usuarios-form/usuarios-form.component';

const routes: Routes = [
  { path: 'usuarios-form', component: UsuariosFormComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class UsuariosRoutingModule { }
