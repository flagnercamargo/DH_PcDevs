import { AgendaService } from './../agenda.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-painel-agenda',
  templateUrl: './painel-agenda.component.html',
  styleUrls: ['./painel-agenda.component.css']
})
export class PainelAgendaComponent implements OnInit {

  nome = 'Zé Agenda';

  // Abaixo é declarado um Array com 3 registros para simular uma entrada de dados
  // agenda = [
  //   {id: 1, nome: 'Flagner', telefone: '(41) 988709294'},
  //   {id: 2, nome: 'Rafael', telefone: '(42) 988709295'},
  //   {id: 3, nome: 'Ian', telefone: '(43) 988709296'},
  //   {id: 4, nome: 'Maria', telefone: '(44) 988709297'}
  // ];

  agenda = [];  

  // Ctrl + space para ele fazer o import automático do AgendaService
  constructor(private service: AgendaService) {}

  ngOnInit(): void {
    this.buscar();
  }

  buscar(){
    this.service.
    listar().
    subscribe(resposta => this.agenda = <any>resposta);
  }

}
