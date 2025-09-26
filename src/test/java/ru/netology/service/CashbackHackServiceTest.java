package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnAmountToBoundaryWhenAmountIsLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnZeroWhenAmountIsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldReturnAmountToNextBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2501;
        int actual = service.remain(amount);
        int expected = 499;
        assertEquals(actual, expected);
    }

}
