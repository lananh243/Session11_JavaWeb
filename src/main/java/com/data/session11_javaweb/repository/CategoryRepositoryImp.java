package com.data.session11_javaweb.repository;

import com.data.session11_javaweb.connection.ConnectionDB;
import com.data.session11_javaweb.dto.CategoryDTO;
import com.data.session11_javaweb.model.Category;
import org.springframework.stereotype.Repository;

import javax.validation.Valid;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Category> findAll() {
       Connection conn = null;
       CallableStatement callSt = null;
       List<Category> categoryList = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call find_all_category()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Category category = new Category();
                category.setId(rs.getInt("id"));
                category.setCategoryName(rs.getString("categoryName"));
                category.setStatus(rs.getBoolean("status"));
                categoryList.add(category);
            }
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn);
        }
        return categoryList;
    }

    @Override
    public void save(@Valid CategoryDTO category) {
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call add_category(?)}");
            callSt.setString(1, category.getCategoryName());
            callSt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn);
        }
    }

    @Override
    public boolean update(Category category) {
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call update_category(?, ?)}");
            callSt.setInt(1, category.getId());
            callSt.setString(2, category.getCategoryName());
            callSt.execute();
            return true;

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn);
        }
        return false;
    }

    @Override
    public boolean delete(int categoryId) {
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call delete_category(?)}");
            callSt.setInt(1, categoryId);
            callSt.execute();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn);
        }
        return false;
    }
}
