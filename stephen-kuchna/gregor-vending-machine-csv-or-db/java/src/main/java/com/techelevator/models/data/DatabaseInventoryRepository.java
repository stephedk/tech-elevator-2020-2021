package com.techelevator.models.data;

import com.techelevator.models.Slot;
import com.techelevator.models.products.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DatabaseInventoryRepository implements InventoryRepository
{
    private JdbcTemplate jdbcTemplate;

    public DatabaseInventoryRepository(DataSource dataSource)
    {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Slot> loadInventory()
    {
        List< Slot > slots = new ArrayList<>();

        String query = "SELECT i.slot_id \n" +
                "    , p.name \n" +
                "    , p.price \n" +
                "    , pt.name as type \n" +
                "    , i.quantity \n" +
                "FROM inventory as i \n" +
                "INNER JOIN product p ON i.product_id = p.product_id \n" +
                "INNER JOIN product_type pt ON p.product_type_id = pt.product_type_id \n" +
                "ORDER BY i.slot_id;";

        SqlRowSet rows = jdbcTemplate.queryForRowSet(query);

        while (rows.next())
        {
            slots.add( createSlot( rows ) );
        }

        return slots;
    }

    private Slot createSlot( SqlRowSet row)
    {
        String slotNumber = row.getString("slot_id");
        String name = row.getString("name");
        BigDecimal price = row.getBigDecimal("price");
        String productType = row.getString("type");
        int quantity = row.getInt("quantity");

        Product product = ProductBuilder.build( name, price, productType);
        return new Slot( slotNumber, product, quantity );
    }
}
