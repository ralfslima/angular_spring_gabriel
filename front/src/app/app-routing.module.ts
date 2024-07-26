import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CidadeComponent } from './componentes/cidade/cidade.component';
import { PessoaComponent } from './componentes/pessoa/pessoa.component';

const routes: Routes = [
  {path:'', component:CidadeComponent},
  {path:'pessoa', component:PessoaComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
