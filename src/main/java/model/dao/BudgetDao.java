package model.dao;

import model.entities.Booking;
import model.entities.Budget;
import utils.exceptions.DAOException;

import java.util.Optional;

/**
 * Created by denglob on 8/18/17.
 */
public interface BudgetDao<T extends Budget> extends GeneralDao<T> {

    Optional<T> findCostByBooking(Booking booking) throws DAOException;

}
