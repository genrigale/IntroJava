package by.epam.composition.task05.entity;

import java.util.List;

/* тур. агентство*/
public class TravelAgency {
	
	List<Tour> tours;	// список предложений/туров

	public TravelAgency(List<Tour> tours) {
		this.tours = tours;
	}

	public List<Tour> getTours() {
		return tours;
	}

	public void setTours(List<Tour> tours) {
		this.tours = tours;
	}

	@Override
	public String toString() {
		return "TravelAgency [tours=" + tours + "]";
	}
	
	/*сортировка туров по длительности(возр)*/
	public void sortToursByDuration() {		
		boolean isSorted = false;
		
		while(!isSorted) {
			isSorted = true;			
			for(int i = 0; i < tours.size() - 1; i++) {
				if(tours.get(i).getDuration() > tours.get(i + 1).getDuration()) {
					isSorted = false;
					Tour temp = tours.get(i);
					tours.set(i, tours.get(i + 1));
					tours.set(i + 1, temp);
				}
			}
		}
	}
	
}
