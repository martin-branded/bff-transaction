INSERT INTO product (product_id, name, status, user_id, image_url, price, description, stock)
VALUES (?, ?, ?, ?, ?, ?, ?, ?)
    ON CONFLICT (product_id) DO UPDATE SET
    name = EXCLUDED.name,
                            status = EXCLUDED.status,
                            user_id = EXCLUDED.user_id,
                            image_url = EXCLUDED.image_url,
                            price = EXCLUDED.price,
                            description = EXCLUDED.description,
                            stock = EXCLUDED.stock;