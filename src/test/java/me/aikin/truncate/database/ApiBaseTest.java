package me.aikin.truncate.database;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
@SpringBootTest
public class ApiBaseTest {

    @Autowired
    private TruncateDatabaseBasicOnMybatisService truncateDatabaseBasicOnMybatisService;

    @Autowired
    private TruncateDatabaseBasicOnHibernateService truncateDatabaseBasicOnHibernateService;

    @BeforeEach
    public void setup() throws Exception {
        truncateDatabaseBasicOnMybatisService.truncate();
        truncateDatabaseBasicOnHibernateService.truncate();
    }


    @Test
    public void should_truncate() {
        assertTrue(true);
    }
}
