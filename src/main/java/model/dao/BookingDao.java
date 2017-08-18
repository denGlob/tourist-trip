package model.dao;

import model.entities.Booking;
import utils.exceptions.DAOException;

import java.util.List;

/**
 * Created by denglob on 8/18/17.
 */
public interface BookingDao<T extends Booking> extends GeneralDao<T> {
    List<T> findBookingByUserId(int userId) throws DAOException;
}
