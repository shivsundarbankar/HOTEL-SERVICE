package com.shivsundar.services.implementations;

import com.shivsundar.exceptions.ResultNotFoundException;
import com.shivsundar.models.db.Hotel;
import com.shivsundar.repositories.HotelRepository;
import com.shivsundar.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel getHotelByHotelId(Long hotelId) {
        return hotelRepository.findById(hotelId)
                .orElseThrow(ResultNotFoundException::new);

    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }
}
