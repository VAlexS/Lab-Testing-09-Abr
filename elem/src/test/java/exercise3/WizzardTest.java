package exercise3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizzardTest {

    Wizzard wizzard;

    @BeforeEach
    void createWarrior(){
        wizzard = new Wizzard(100, 30, 20, 120);
    }

    @Test
    void decrementLife() {

        wizzard.decrementLive();

        assertEquals(19, wizzard.getLives());

    }

    @Test
    void convertToElf(){

        Elf elf = wizzard.convertToElf();

        assertInstanceOf(Elf.class, elf);

    }


}