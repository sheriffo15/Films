package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {


    @Test

    public void shouldAdd() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Бладшот 1");
        manager.addFilm("Бладшот 2");
        manager.addFilm("Бладшот 3");

        String[] expected = {"Бладшот 1", "Бладшот 2", "Бладшот 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Бладшот 1");
        manager.addFilm("Бладшот 2");
        manager.addFilm("Бладшот 3");

        String[] expected = {"Бладшот 3", "Бладшот 2", "Бладшот 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
    


