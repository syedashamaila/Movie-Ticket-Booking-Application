package com.cg.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TicketBooking")
public class TicketBooking {

	int ticketId;
	int showId;
	LocalDate bookingDate;
	int transactionId;
	String transationMode;
	String transationStatus;
	double totalCost;
	Ticket ticket;
	
	public TicketBooking() {
		super();
	}

	public TicketBooking(int ticketId, int showId, LocalDate bookingDate, int transactionId, String transationMode,
			String transationStatus, double totalCost, Ticket ticket) {
		super();
		this.ticketId = ticketId;
		this.showId = showId;
		this.bookingDate = bookingDate;
		this.transactionId = transactionId;
		this.transationMode = transationMode;
		this.transationStatus = transationStatus;
		this.totalCost = totalCost;
		this.ticket = ticket;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransationMode() {
		return transationMode;
	}

	public void setTransationMode(String transationMode) {
		this.transationMode = transationMode;
	}

	public String getTransationStatus() {
		return transationStatus;
	}

	public void setTransationStatus(String transationStatus) {
		this.transationStatus = transationStatus;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "TicketBooking [ticketId=" + ticketId + ", showId=" + showId + ", bookingDate=" + bookingDate
				+ ", transactionId=" + transactionId + ", transationMode=" + transationMode + ", transationStatus="
				+ transationStatus + ", totalCost=" + totalCost + ", ticket=" + ticket + "]";
	}
	
	
	
	
}
