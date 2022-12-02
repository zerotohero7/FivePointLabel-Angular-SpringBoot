import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Category } from '../Model/category';
import { CategoryService } from '../services/category.service';
import { LivreService } from '../services/livre.service';

@Component({
  selector: 'app-add-category',
  templateUrl: './add-category.component.html',
  styleUrls: ['./add-category.component.css']
})
export class AddCategoryComponent implements OnInit {

  category : Category =  new Category();

  constructor(private categoryService : CategoryService , private router:Router ) { }

  ngOnInit(): void {
  }

  onsubmit(){

      this.categoryService.addCategory(this.category).subscribe(response=>{
        console.log(response);
      },error=>console.log(error))


      this.router.navigate(['/add-livre']);
  }

}
