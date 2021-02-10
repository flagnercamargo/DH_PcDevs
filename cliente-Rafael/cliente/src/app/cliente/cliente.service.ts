import { environment } from './../../environments/environment';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {
  

  constructor(private http: HttpClient){}

  listar(){
    return this.http.get(`${environment.url}`+'/cliente');
  }

  buscarById(id: number) {
    return this.http.get(`${environment.url}`+'/cliente/'+id);
  }

  salvar(cliente: any){
    return this.http.post(`${environment.url}`+'/cliente', cliente);
  }

  atualizar(cliente: any) {
    return this.http.put(`${environment.url}`+'/cliente/'+cliente.id, cliente);
  }

  excluir(id: number) {
    return this.http.delete(`${environment.url}`+'/cliente/'+id);
  }

  listarEstados(){
    return this.http.get(`${environment.url}`+'/estado');
  }

  listarCidades(id: number) {
    return this.http.get(`${environment.url}`+'/cidade'+'?estado='+id);
  }
}
