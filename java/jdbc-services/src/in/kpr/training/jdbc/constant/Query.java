package in.kpr.training.jdbc.constant;

public class Query {

    // Address queries

	public static final String CREATE_ADDRESS_TABLE = new StringBuilder("CREATE TABLE address (                       ")
																.append("	 PRIMARY KEY (id)                         ")
																.append("   ,id          BIGINT(20)     AUTO_INCREMENT")
																.append("   ,street      VARCHAR(100)                 ")
																.append("   ,city        VARCHAR(15)                  ")
																.append("   ,postal_code INT(11)        NOT NULL      ")
                                                                .append(")                                            ")
																.toString();
    
    public static final String TRUNCATE_ADDRESS_TABLE = new StringBuilder("TRUNCATE TABLE address").toString();
    
    public static final String DROP_ADDRESS_TABLE = new StringBuilder("DROP TABLE address").toString();
    
    public static final String INSERT_ADDRESS_QUERY = new StringBuilder("INSERT INTO address      ")
                                                                .append("VALUES (default, ?, ?, ?)")
                                                                .toString();
    
    public static final String SELECT_ADDRESS_QUERY = new StringBuilder("SELECT street     ")
                                                                .append("      ,city       ")
                                                                .append("      ,postal_code")
                                                                .append("  FROM address    ")
                                                                .append(" WHERE id =       ")
                                                                .toString();
    
    public static final String SELECT_ALL_ADDRESS_QUERY = new StringBuilder("SELECT street      ")
                                                                    .append("      ,city        ") 
                                                                    .append("      ,postal_code ")
                                                                    .append("  FROM address     ")
                                                                    .toString();
    
    public static final String UPDATE_ADDRESS_QUERY = new StringBuilder("UPDATE address         ")
                                                                .append("   SET street = ?      ")
                                                                .append("      ,city = ?        ")
                                                                .append("      ,postal_code= ?  ")
                                                                .append(" WHERE id =            ")
                                                                .toString();
    
    public static final String DELETE_ADDRESS_QUERY = new StringBuilder("DELETE FROM address ")
                                                                .append(" WHERE id =         ")
                                                                .toString();

    // Person queries
    
    public static final String CREATE_PERSON_TABLE = new StringBuilder("CREATE TABLE person (                       ")
                                                               .append("    PRIMARY KEY (id)                        ")
                                                               .append("   ,id           BIGINT(20)   AUTO_INCREMENT")
                                                               .append("   ,name         VARCHAR(50)                ")
                                                               .append("   ,email        VARCHAR(100) UNIQUE        ")
                                                               .append("   ,birth_date   DATE                       ") 
                                                               .append("   ,created_date DATETIME     DEFAULT NOW() ")
                                                               .append("   ,address_id   BIGINT(20)                 ")
                                                               .append("   ,FOREIGN KEY (address_id)                ")
                                                               .append("        REFERENCES address(id)              ")
                                                               .append("        ON DELETE CASCADE                   ")
                                                               .append(")                                           ")
                                                               .toString();

    public static final String TRUNCATE_PERSON_TABLE = new StringBuilder("TRUNCATE TABLE person").toString();

    public static final String DROP_PERSON_TABLE = new StringBuilder("DROP TABLE person").toString();

    public static final String INSERT_PERSON_QUERY = new StringBuilder("INSERT INTO person (name       ")
                                                               .append("                   ,email      ")
                                                               .append("                   ,birth_date ")
                                                               .append("                   ,address_id)")
                                                               .append("VALUES (?, ?, ?, ?)            ")
                                                               .toString();
    
    public static final String SELECT_PERSON_QUERY = new StringBuilder("SELECT name        ")
                                                               .append("      ,email       ")
                                                               .append("      ,birth_date  ")
                                                               .append("      ,created_date")
                                                               .append("      ,address_id  ")
                                                               .append("  FROM person      ") 
                                                               .append(" WHERE id =        ")
                                                               .toString();
    
    public static final String SELECT_ALL_PERSON_QUERY = new StringBuilder("SELECT name        ")
                                                                   .append("      ,email       ")
                                                                   .append("      ,birth_date  ")
                                                                   .append("      ,created_date")
                                                                   .append("      ,address_id  ")
                                                                   .append("  FROM person      ")
                                                                   .toString();
    
    public static final String UPDATE_PERSON_QUERY = new StringBuilder("UPDATE person         ")
                                                               .append("   SET name = ?       ")
                                                               .append("      ,email = ?      ")
                                                               .append("      ,birth_date = ? ")
                                                               .append(" WHERE id =          ")
                                                               .toString();
    
    public static final String DELETE_PERSON_QUERY = new StringBuilder("DELETE FROM person ")
                                                               .append(" WHERE id =        ")
                                                               .toString();

    public static final String SELECT_EMAIL_EXISTS = new StringBuilder("SELECT id       ") 
                                                               .append("  FROM person   ")
                                                               .append(" WHERE email = '")
                                                               .toString(); // and id not equal to given id
    
    public static final String EMAIL_EXISTS_ID = new StringBuilder(" AND id != ").toString();

    public static final String SET_FOREIGN_CHECKS = new StringBuilder("SET FOREIGN_KEY_CHECKS = 0").toString();
}
