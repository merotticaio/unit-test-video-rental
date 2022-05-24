package com.github.merotti.caio.services;

import com.github.merotti.caio.entities.Rental;
import com.github.merotti.caio.entities.User;
import com.github.merotti.caio.entities.Video;

import java.util.Date;

import static com.github.merotti.caio.utils.DateUtils.*;

class RentalService {

    public Rental rentVideo(User user, Video video) {
        Rental rental = new Rental();
        rental.setVideo(video);
        rental.setUser(user);
        rental.setRentalDate(new Date());
        rental.setValue(video.getRentalPrice());

        Date deliveryDate = new Date();
        deliveryDate = addDays(deliveryDate, 1);
        rental.setReturnDate(deliveryDate);

        return rental;
    }

}
