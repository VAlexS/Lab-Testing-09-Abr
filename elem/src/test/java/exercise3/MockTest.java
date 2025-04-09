package exercise3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class MockTest {

    @Test
    @DisplayName("Simulacion")
    void mockTestCastRandomSpell(){

        // Mock the SpellLibrary
        SpellLibrary spellLibraryMock = mock(SpellLibrary.class);

        // Stub the getRandomSpell() method
        when(spellLibraryMock.getRandomSpell()).thenReturn("Fireball");


        // Create a Wizard instance with the mock dependency
        Wizzard wizard = new Wizzard(100, 30, 20, spellLibraryMock);

        // Call castRandomSpell() and verify the result
        String result = wizard.castRandomSpell();
        assertEquals("Casting Fireball", result);

        // Verify that getRandomSpell() was called exactly once
        verify(spellLibraryMock, times(1)).getRandomSpell();


    }
}
