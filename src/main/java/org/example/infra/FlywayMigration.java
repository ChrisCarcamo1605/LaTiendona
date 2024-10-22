package org.example.infra;

import org.flywaydb.core.Flyway;

public class FlywayMigration {
    Flyway flyway = Flyway.configure()
            .dataSource("jdbc:mysql://localhost:3306/LaTiendonaDb", "root", "1234")
            .locations("classpath:db/migration") // Cambia esto si tus migraciones están en otra ubicación
            .load();

    public void migrate() {
        try{ flyway.migrate();
          }
        catch (Exception e)
        {e.printStackTrace();}


    }
}
