package com.shivsundar.repositories;

import com.shivsundar.models.db.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
