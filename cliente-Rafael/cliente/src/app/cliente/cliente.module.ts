import { FileUploadModule } from 'primeng/fileupload';
import { InputMaskModule } from 'primeng/inputmask';
import { DropdownModule } from 'primeng/dropdown';
import { TableModule } from 'primeng/table';
import { ButtonModule } from 'primeng/button';
import { InputTextModule } from 'primeng/inputtext';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { ClienteRoutingModule } from './cliente-routing.module';
import { FormularioComponent } from './formulario/formulario.component';
import { TabelaComponent } from './tabela/tabela.component';

@NgModule({
  declarations: [
    FormularioComponent,
    TabelaComponent
  ],
  imports: [
    CommonModule,
    BrowserAnimationsModule,
    ClienteRoutingModule,
    FormsModule,
    DropdownModule,    
    InputMaskModule,
    FileUploadModule,
    TableModule, 
    ButtonModule, 
    InputTextModule
  ]
})
export class ClienteModule { }
