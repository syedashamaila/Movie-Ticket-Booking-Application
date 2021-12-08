package com.cg.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Show")
public class Show {

	int showId;
	LocalDateTime showStartTime;
	LocalDateTime showEndTime;
	String showName;
	Movie movie;
	int screenid;
	int theaterid;
	
	public Show() {
		super();
	}
	
	public Show(int showId, LocalDateTime showStartTime, LocalDateTime showEndTime, String showName, Movie movie,
			int screenid, int theaterid) {
		super();
		this.showId = showId;
		this.showStartTime = showStartTime;
		this.showEndTime = showEndTime;
		this.showName = showName;
		this.movie = movie;
		this.screenid = screenid;
		this.theaterid = theaterid;
	}
	
	public int getShowId() {
		return showId;
	}
	
	public void setShowId(int showId) {
		this.showId = showId;
	}
	
	public LocalDateTime getShowStartTime() {
		return showStartTime;
	}
	
	public void setShowStartTime(LocalDateTime showStartTime) {
		this.showStartTime = showStartTime;
	}
	
	public LocalDateTime getShowEndTime() {
		return showEndTime;
	}
	
	public void setShowEndTime(LocalDateTime showEndTime) {
		this.showEndTime = showEndTime;
	}
	
	public String getShowName() {
		return showName;
	}
	
	public void setShowName(String showName) {
		this.showName = showName;
	}
	
	public Movie getMovie() {
		return movie;
	}
	
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	public int getScreenid() {
		return screenid;
	}
	
	public void setScreenid(int screenid) {
		this.screenid = screenid;
	}
	
	public int getTheaterid() {
		return theaterid;
	}
	
	public void setTheaterid(int theaterid) {
		this.theaterid = theaterid;
	}
	
	@Override
	public String toString() {
		return "Show [showId=" + showId + ", showStartTime=" + showStartTime + ", showEndTime=" + showEndTime
				+ ", showName=" + showName + ", movie=" + movie + ", screenid=" + screenid + ", theaterid=" + theaterid
				+ "]";
	}
	
	
}
