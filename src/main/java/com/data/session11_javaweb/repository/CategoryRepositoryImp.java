package com.data.session11_javaweb.repository;

import com.data.session11_javaweb.connection.ConnectionDB;
import com.data.session11_javaweb.model.Category;
import org.springframework.stereotype.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
@Repository
public class CategoryRepositoryImp implements CategoryRepository {
    @Override
    public Category findByCategoryName(String categoryName) {
        Connection conn = null;
        CallableStatement callSt = null;
        Category category = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call add_category(?)}");
            callSt.setString(1, categoryName);

            ResultSet rs = callSt.executeQuery();
            if (rs.next()) {
                category = new Category();
                category.setId(rs.getInt("id"));
                category.setCategoryName(rs.getString("categoryName"));
                category.setStatus(rs.getBoolean("status"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn);
        }
        return category;
    }
}
