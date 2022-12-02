import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Livre } from '../Model/livre';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class LivreService {

  constructor(private _http : HttpClient) { }

  baseURL =  "http://localhost:8080/livre";



  addLivre(livre? :Livre) : Observable<Livre>{
      return this._http.post(this.baseURL , livre)
  }

  getLivreList() : Observable<Livre[]>{
    return this._http.get<Livre[]>(this.baseURL);
}




}
