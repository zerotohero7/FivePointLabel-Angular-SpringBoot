import { Component, OnInit } from '@angular/core';
import { Livre } from '../Model/livre';
import { LivreService } from '../services/livre.service';

@Component({
  selector: 'app-liste-livre',
  templateUrl: './liste-livre.component.html',
  styleUrls: ['./liste-livre.component.css']
})
export class ListeLivreComponent implements OnInit {

  constructor(private livreService : LivreService ) { }


  ngOnInit(): void {
    this.getEmployees();
  }

  livres : Livre[] = [];

      getEmployees(){
      this.livreService.getLivreList().subscribe(data=>{
        this.livres = data;
      });
    }

}
