import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class agendaService {
  // URL do backend do JSON Server
  urlBD = 'http://localhost:3000/agenda';
  constructor(private http: HttpClient) {}

  listar(){
    return this.http.get(this.urlBD);
  }
  adicionar(contato: any){
    return this.http.post(this.urlBD, contato)
  }
  atualizar(contato: any){
    return this.http.put(this.urlBD + '/' + contato.id, contato);
  }
  excluir(id: number){
    return this.http.delete(this.urlBD + '/' + id);
  }
}
