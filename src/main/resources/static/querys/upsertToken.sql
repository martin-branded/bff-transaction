INSERT INTO profile_token_tiendanube (token_tiendanube, user_id)
VALUES (?, ?)
    ON CONFLICT (user_id)
DO UPDATE SET
    token_tiendanube = EXCLUDED.token_tiendanube,
           user_id = EXCLUDED.user_id;