CREATE TABLE t_inventory (
                             id SERIAL PRIMARY KEY, -- or AUTO_INCREMENT for MySQL
                             quantity INT NOT NULL,
                             sku_code VARCHAR(50) NOT NULL UNIQUE
);