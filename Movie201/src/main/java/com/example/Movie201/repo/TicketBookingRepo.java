package com.example.Movie201.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Movie201.entity.TicketBooking;

public interface TicketBookingRepo extends JpaRepository<TicketBooking, Long> {

//	TicketBooking getTicketBookingByTBid(Long TBid);
}
