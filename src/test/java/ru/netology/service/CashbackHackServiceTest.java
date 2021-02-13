package ru.netology.service;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldRemain() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldRemain1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }
  
}