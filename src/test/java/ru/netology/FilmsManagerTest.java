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
    public void shouldFindLastFewerThanLimit() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Бладшот 1");
        manager.addFilm("Бладшот 2");
        manager.addFilm("Бладшот 3");

        String[] expected = {"Бладшот 3", "Бладшот 2", "Бладшот 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastEqualToLimit() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Бладшот 1");
        manager.addFilm("Бладшот 2");
        manager.addFilm("Бладшот 3");
        manager.addFilm("Матрица 1");
        manager.addFilm("Матрица 2");
        manager.addFilm("Матрица 3");
        manager.addFilm("Матрица 4");
        manager.addFilm("Миссия невыполнима");
        manager.addFilm("Титаник");
        manager.addFilm("Храброе сердце");

        String[] expected = {"Храброе сердце", "Титаник", "Миссия невыполнима", "Матрица 4", "Матрица 3", "Матрица 2", "Матрица 1", "Бладшот 3", "Бладшот 2", "Бладшот 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastExceedsLimit() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Бладшот 1");
        manager.addFilm("Бладшот 2");
        manager.addFilm("Бладшот 3");
        manager.addFilm("Матрица 1");
        manager.addFilm("Матрица 2");
        manager.addFilm("Матрица 3");
        manager.addFilm("Матрица 4");
        manager.addFilm("Миссия невыполнима");
        manager.addFilm("Титаник");
        manager.addFilm("Храброе сердце");
        manager.addFilm("Криминальное чтиво");

        String[] expected = {"Криминальное чтиво", "Храброе сердце", "Титаник", "Миссия невыполнима", "Матрица 4", "Матрица 3", "Матрица 2", "Матрица 1", "Бладшот 3", "Бладшот 2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
    


