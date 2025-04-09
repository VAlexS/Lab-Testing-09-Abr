package exercise3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    Warrior warrior;

    @BeforeEach
    void createWarrior(){
        warrior = new Warrior(100, 30, 20, 12);
    }

    @Test
    void decrementLife() {

        warrior.decrementLive();

        assertEquals(19, warrior.getLives());

    }

    @Test
    void convertToElf(){

        Elf elf = warrior.convertToElf();

        assertInstanceOf(Elf.class, elf);

    }


}