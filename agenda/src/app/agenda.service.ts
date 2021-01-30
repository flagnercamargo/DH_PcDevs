import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AgendaService {
  // URL do backend do JSON Server
  urlBD = 'http://localhost:3000/agenda';
  constructor(private http: HttpClient) {}

  listar(){
    return this.http.get(this.urlBD);
  }
  adicionar(contato: any){
    return this.http.post(this.urlBD, contato)
  }  
}
