INSERT INTO product_details
(product_details_id, product_id, price, size, color, stock, weight, depth, width, height, promotional_price, image_url)
VALUES
    (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
    ON CONFLICT (product_details_id)
DO UPDATE SET
    product_id = EXCLUDED.product_id,
           price = EXCLUDED.price,
           size = EXCLUDED.size,
           color = EXCLUDED.color,
           stock = EXCLUDED.stock,
           weight = EXCLUDED.weight,
           depth = EXCLUDED.depth,
           width = EXCLUDED.width,
           height = EXCLUDED.height,
           promotional_price = EXCLUDED.promotional_price,
           image_url = EXCLUDED.image_url;