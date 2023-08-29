package com.shivsundar.models.db;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "hotel_data")
@Builder
public class Hotel {
    @Id
    private Long hotelId;

    private String hotelName;

    private String location;
}
