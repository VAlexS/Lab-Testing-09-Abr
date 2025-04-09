package exercise3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElfTest {

    Elf elf;

    @BeforeEach
    void createWarrior(){
        elf = new Elf(100, 30, 20, 120);
    }

    @Test
    void decrementLife() {

        elf.decrementLive();

        assertEquals(19, elf.getLives());

    }

}