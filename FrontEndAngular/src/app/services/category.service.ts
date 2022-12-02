import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Category } from '../Model/category';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  constructor(private _http : HttpClient) { }

  baseURL =  "http://localhost:8080/category";



  addCategory(Category? :Category) : Observable<Category>{
      return this._http.post(this.baseURL , Category)
  }


getCategoryList() : Observable<Category[]>{
  return this._http.get<Category[]>(this.baseURL);
}






}
