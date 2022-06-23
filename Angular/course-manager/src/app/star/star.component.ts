import { Component, OnChanges, Input} from '@angular/core'

@Component({
  selector: 'app-star',
  templateUrl: './star.component.html'
})
export class starComponent implements OnChanges{
  @Input()
  rating: number = 0;
  starWidth;
  constructor (starWidth: number){
    this.starWidth = starWidth;
  }
  ngOnChanges(): void {
    this.starWidth = this.rating * 94/5;
  }
}
