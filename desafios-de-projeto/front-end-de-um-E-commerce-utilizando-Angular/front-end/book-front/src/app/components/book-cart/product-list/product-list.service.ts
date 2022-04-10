import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Book } from "./model/books.model";
import { Observable, throwError } from 'rxjs';
import { catchError, map, retry } from 'rxjs/operators';


@Injectable()

export class BooksService {

  private url = 'https://apibookstore20220408185052.azurewebsites.net/api/bookstore';  // URL to web api

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  }

  constructor(private http: HttpClient) { }

  getBooks() {
    return this.http.get(this.url)
  }

}
