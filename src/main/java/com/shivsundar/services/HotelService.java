package com.shivsundar.services;

import com.shivsundar.models.db.Hotel;

import java.util.List;

public interface HotelService {
    Hotel saveHotel(Hotel hotel);

    Hotel getHotelByHotelId(Long hotelId);

    List<Hotel> getAllHotels();
}
