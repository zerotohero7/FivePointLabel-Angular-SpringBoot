import { Component, OnInit } from '@angular/core';
import { LivreService } from '../services/livre.service';
import { Router } from '@angular/router';
import { Livre } from '../Model/livre';
import { CategoryService } from '../services/category.service';
import { Category } from '../Model/category';

@Component({
  selector: 'app-add-livre',
  templateUrl: './add-livre.component.html',
  styleUrls: ['./add-livre.component.css']
})
export class AddLivreComponent implements OnInit {

  livre : Livre =  new Livre();
  categories : Category[]= [];

  constructor(private livreService : LivreService , private router:Router, private categoryService : CategoryService ) { }

  ngOnInit(): void {
    this.categoryService.getCategoryList().subscribe(data=>{
      this.categories = data;
    })
  }

  onsubmit(){

      this.livreService.addLivre(this.livre).subscribe(response=>{
        console.log(response);
      },error=>console.log(error))


      this.router.navigate(['/list-livre']);
  }

}
