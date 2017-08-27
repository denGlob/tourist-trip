package model.dao.impl;

import model.dao.BookingDao;
import model.entities.Booking;
import utils.exceptions.DAOException;

import java.util.List;

/**
 * Created by denglob on 8/27/17.
 */
public class ConcreteBookingDao implements BookingDao<Booking>{

    @Override
    public List<Booking> findAll() throws DAOException {
        return null;
    }

    @Override
    public List<Booking> findBookingByUserId(int userId) throws DAOException {
        return null;
    }

    @Override
    public Booking findById(int id) throws DAOException {
        return null;
    }

    @Override
    public void create(Booking booking) throws DAOException {

    }

    @Override
    public Boolean update(Booking booking) throws DAOException {
        return null;
    }
}
