import { Component, OnInit } from '@angular/core';
import { Course } from './course';

@Component({
  selector: 'app-course-list',
  templateUrl: './course-list.component.html'
})
export class CourseListComponent implements OnInit{
  courses: Course[] = [];
  ngOnInit(): void {
    this.courses = [
      {
        id : 1505,
        name: 'Angular: Forms',
        imageUrl: '/assets/images/forms.png',
        price: 99.99,
        code: 'XPS-8796',
        duration: 120,
        rating: 5.5,
        releaseDate: 'November, 2, 2020'
      },
      {
        id : 1506,
        name: 'Angular: HTTP',
        imageUrl: '/assets/images/http.png',
        price: 44.99,
        code: 'LKL-1094',
        duration: 80,
        rating: 5.5,
        releaseDate: 'December, 4, 2020'
      }
    ]
  }

}
