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

  agenda = []; // array que vai receber todos os registros
  contato: any = {}; //vai receber somente um registro de cada vez
  operacao: boolean = true; // boolean [true, false]

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
  adicionar(){
    this.service.adicionar(this.contato).subscribe(() => {
      this.contato = {}; //limpar os campos
      this.buscar(); // busca no BD e atualiza lista
    });
  }
  inserirOuAtualizar() {
    if (this.operacao == true) { // Se a variável operacao igual a true ele cadastra um novo contato
      this.adicionar();
    } else { // Se não ele atualiza contato existente
      this.atualizar();
      this.operacao = true; // vai dizer para o sistema que agora ela voltar a cadastrar
    }
  }
  editar(cont: any) { // cont é nossa abreviação de contato
    this.contato = {id: cont.id, nome: cont.nome, telefone: cont.telefone};
    this.operacao = false; // dizer para o sistema que agora ele vai atualizar
  }

  atualizar() {
    this.service.atualizar(this.contato).subscribe(() => { // vai passar o valor dos inputs para dentro do serviço de atualizar
      this.contato = {};
      this.buscar();
    },
    () => alert("Não foi atualizar este contato."));
  }
  excluir(id: number) {
    this.service.excluir(id).subscribe(() => {
      this.buscar();
      alert("Item excluído com sucesso!")
    }, 
    () => alert("Não foi possível excliur o item!")  
    );
  }
}

