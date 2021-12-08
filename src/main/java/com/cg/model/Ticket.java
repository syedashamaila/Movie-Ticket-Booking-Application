package com.cg.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Ticket")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int ticketId;
	
	@Column(name = "noOfSeats")
	int noOfSeats;
	
	@Column(name = "seatNo")
	List<Seat> seatNo;
	
	@Column(name = "bookingRef")
	TicketBooking bookingRef;
	
	@Column(name = "ticketStatus")
	boolean ticketStatus;
	
	@OneToMany(mappedBy = "ticket", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Seat seat;
	
	public Ticket() {
		super();
	}

	
	public Ticket(int ticketId, int noOfSeats, List<Seat> seatNo, TicketBooking bookingRef, boolean ticketStatus) {
		super();
		this.ticketId = ticketId;
		this.noOfSeats = noOfSeats;
		this.seatNo = seatNo;
		this.bookingRef = bookingRef;
		this.ticketStatus = ticketStatus;
	}


	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public List<Seat> getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(List<Seat> seatNo) {
		this.seatNo = seatNo;
	}

	public TicketBooking getBookingRef() {
		return bookingRef;
	}

	public void setBookingRef(TicketBooking bookingRef) {
		this.bookingRef = bookingRef;
	}

	public boolean isTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}


	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", noOfSeats=" + noOfSeats + ", seatNo=" + seatNo + ", bookingRef="
				+ bookingRef + ", ticketStatus=" + ticketStatus + "]";
	}
	
	
	
}
