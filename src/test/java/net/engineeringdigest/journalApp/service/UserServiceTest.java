package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    @Disabled
    public void testFindByUsername() {
        assertEquals(4,2+2);
        assertNotNull(userRepository.findByUserName("ram"));
    }

    @Test
    @Disabled
    public void testFindUserJournalEntry() {
        User user = userRepository.findByUserName("tanmay");
        assertFalse(user.getJournalEntries().isEmpty());
    }


    @ParameterizedTest
    @CsvSource({
            "12,14,26",
            "25,25,50",
            "1,2,5"
    })
    public void testParamterized(int a, int b,int expect){
        assertEquals(expect,a+b);

    }

    @ParameterizedTest
    @CsvSource({
            "ram","praj","dhano"
    })
    public void parameterizedTestFindByUsername(String username) {
        assertNotNull(userRepository.findByUserName(username));
    }

}
