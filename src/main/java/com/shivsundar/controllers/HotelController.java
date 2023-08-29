package com.shivsundar.controllers;

import com.shivsundar.models.db.Hotel;
import com.shivsundar.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * HotelController containing different function CRUD Operations.
 *
 * @author Shivsundar Bankar
 * @version 1.0
 * @since 2023-08-28
 */
@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @PreAuthorize("hasAuthority('Admin')")
    @PostMapping("/saveHotel")
    public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.saveHotel(hotel));
    }

    /**
     * this will fetch the hotel details internal scope only.
     * @param hotelId
     * @return Hotel
     */
    @PreAuthorize("hasAuthority('SCOPE_internal')")
    @GetMapping("/getHotel/{hotelId}")
    public ResponseEntity<Hotel> getHotelByHotelId(@PathVariable Long hotelId){
        return ResponseEntity.ok(hotelService.getHotelByHotelId(hotelId));
    }


    @PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin') || hasAuthority('Normal')")
    @GetMapping("/getAllHotels")
    public ResponseEntity<List<Hotel>> getHotels(){
        return ResponseEntity.ok(hotelService.getAllHotels());
    }
}
