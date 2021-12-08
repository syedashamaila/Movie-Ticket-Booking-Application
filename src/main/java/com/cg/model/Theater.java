package com.cg.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Theater")
public class Theater {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int theaterId;
	
	@Column(name = "theaterName", length = 20)
	String theaterName;
	
	@Column(name = "theaterCity", length = 20)
	String theaterCity;
	
	@Column(name = "listOfMovies", length = 20)
	List<Movie> listOfMovies;
	
	@Column(name = "listOfScreens", length = 20)
	List<Screen> listOfScreens;
	
	@Column(name = "managerName", length = 20)
	String managerName;
	
	@Column(name = "managerContact", length = 20)
	String managerContact;
	
	@OneToMany(mappedBy = "theater",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Screen screen;
	
	@OneToMany(mappedBy = "theater",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Movie movie;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;
	
	
	
	public Theater() {
		super();
	}
	
	public Theater(int theaterId, String theaterName, String theaterCity, List<Movie> listOfMovies,
			List<Screen> listOfScreens, String managerName, String managerContact) {
		super();
		this.theaterId = theaterId;
		this.theaterName = theaterName;
		this.theaterCity = theaterCity;
		this.listOfMovies = listOfMovies;
		this.listOfScreens = listOfScreens;
		this.managerName = managerName;
		this.managerContact = managerContact;
	}
	
	public int getTheaterId() {
		return theaterId;
	}
	
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	
	public String getTheaterName() {
		return theaterName;
	}
	
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	
	public String getTheaterCity() {
		return theaterCity;
	}
	
	public void setTheaterCity(String theaterCity) {
		this.theaterCity = theaterCity;
	}
	
	public List<Movie> getListOfMovies() {
		return listOfMovies;
	}
	
	public void setListOfMovies(List<Movie> listOfMovies) {
		this.listOfMovies = listOfMovies;
	}
	
	public List<Screen> getListOfScreens() {
		return listOfScreens;
	}
	
	public void setListOfScreens(List<Screen> listOfScreens) {
		this.listOfScreens = listOfScreens;
	}
	
	public String getManagerName() {
		return managerName;
	}
	
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	public String getManagerContact() {
		return managerContact;
	}
	
	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}
	
	@Override
	public String toString() {
		return "Theater [theaterId=" + theaterId + ", theaterName=" + theaterName + ", theaterCity=" + theaterCity
				+ ", listOfMovies=" + listOfMovies + ", listOfScreens=" + listOfScreens + ", managerName=" + managerName
				+ ", managerContact=" + managerContact + "]";
	}
	
	
}
