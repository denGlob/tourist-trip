package model.dao.impl;

import model.dao.BudgetDao;
import model.entities.Booking;
import model.entities.Budget;
import utils.exceptions.DAOException;

import java.util.List;
import java.util.Optional;

/**
 * Created by denglob on 8/27/17.
 */
public class ConcreteBudgetDao implements BudgetDao<Budget> {
    @Override
    public List<Budget> findAll() throws DAOException {
        return null;
    }

    @Override
    public Budget findById(int id) throws DAOException {
        return null;
    }

    @Override
    public Optional<Budget> findCostByBooking(Booking booking) throws DAOException {
        return null;
    }

    @Override
    public void create(Budget budget) throws DAOException {

    }

    @Override
    public Boolean update(Budget budget) throws DAOException {
        return null;
    }
}
