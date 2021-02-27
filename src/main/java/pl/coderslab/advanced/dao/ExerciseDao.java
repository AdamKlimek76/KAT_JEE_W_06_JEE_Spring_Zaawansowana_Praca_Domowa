package pl.coderslab.advanced.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExerciseDao extends AbstractDao {
    @Override
    protected Model newFromResultSet(ResultSet rs) throws SQLException {
        return null;
    }

    @Override
    protected String getLoadAllQuery() {
        return null;
    }

    @Override
    protected String getLoadByIdQuery() {
        return null;
    }

    @Override
    protected PreparedStatement saveNewStatement(Connection con, Model item) throws SQLException {
        return null;
    }

    @Override
    protected PreparedStatement updateExistingStatement(Connection con, Model item) throws SQLException {
        return null;
    }

    @Override
    protected PreparedStatement deleteStatement(Connection con, Model item) throws SQLException {
        return null;
    }
}
