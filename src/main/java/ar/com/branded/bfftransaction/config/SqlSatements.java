package ar.com.branded.bfftransaction.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Component
public class SqlSatements {
    static Logger logger = LoggerFactory.getLogger(SqlSatements.class);

    public static String UPSERT_TOKEN_SQL = getSql("upsertToken");
    public static String SELECT_TOKEN_BY_PROFILE_SQL = getSql("selectTokenByProfile");
    public static String UPSERT_PRODUCTS_SQL = getSql("upsertProduct");
    public static String UPSERT_PRODUCTS_DETAILS_SQL = getSql("upsertProductDetails");
    public static String UPDATE_RELATION_USER_TOKEN_SQL = getSql("updateRelationUserToken");

    private static String getSql(String fileName) {
        String pathResource = "src/main/resources/static/querys/";
        String file = fileName+".sql";
        try {
            return Files.readString(Paths.get(pathResource + file));
        }catch (IOException e){
            logger.error("No se encontro el archivo: " + file);
            throw new RuntimeException();
        }
    }
}
