package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilmRepositoryTest {

    FilmItem film1 = new FilmItem(1, "Бладшот", "боевик");
    FilmItem film2 = new FilmItem(2, "Вперёд", "мультфильм");
    FilmItem film3 = new FilmItem(3, "Отель Белград", "комедия");
    FilmItem film4 = new FilmItem(4, "Джентльмены", "боевик");
    FilmItem film5 = new FilmItem(5, "Человек-невидимка", "ужасы");
    FilmItem film6 = new FilmItem(6, "Тролли. Мировой тур", "мультфильм");
    FilmItem film7 = new FilmItem(7, "Номер один", "комедия");
    FilmItem film8 = new FilmItem(8, "Большой Куш", "фантастика");
    FilmItem film9 = new FilmItem(9, "Карты, деньги, два ствола", "детский");
    FilmItem film10 = new FilmItem(10, "Рок-н-рольщик", "приключения");
    FilmItem film11 = new FilmItem(11, "Довод", "документальный");
    FilmItem film12 = new FilmItem(12, "Темный рыцарь", "детский");
    FilmItem film13 = new FilmItem(13, "Начало", "путешествия");
    FilmItem film14 = new FilmItem(14, "Интерстеллар", "документальный");




    @Test
    public void ShouldAddFilms() {
        FilmRepository films = new FilmRepository(14);

        films.save(film1);
        films.save(film2);
        films.save(film3);
        films.save(film4);
        films.save(film5);
        films.save(film6);
        films.save(film7);
        films.save(film8);
        films.save(film9);
        films.save(film10);
        films.save(film11);
        films.save(film12);
        films.save(film13);
        films.save(film14);

        FilmItem[] actual = films.findAll();
        FilmItem[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11, film12,film13, film14};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldReverseFilms() {
        FilmRepository films = new FilmRepository();

        films.save(film1);
        films.save(film2);
        films.save(film3);
        films.save(film4);
        films.save(film5);
        films.save(film6);
        films.save(film7);
        films.save(film8);
        films.save(film9);
        films.save(film10);
        films.save(film11);
        films.save(film12);
        films.save(film13);
        films.save(film14);

        FilmItem[] actual = films.findLast();
        FilmItem[] expected = {film14, film13,film12, film11, film10, film9, film8, film7, film6, film5};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldAddFilmsLimit() {
        FilmRepository films = new FilmRepository(5);

        films.save(film1);
        films.save(film2);
        films.save(film3);
        films.save(film4);
        films.save(film5);
        films.save(film6);
        films.save(film7);
        films.save(film8);
        films.save(film9);
        films.save(film10);
        films.save(film11);
        films.save(film12);
        films.save(film13);
        films.save(film14);

        FilmItem[] actual = films.findLast();
        FilmItem[] expected = {film14, film13, film12, film11, film10};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldAddAboveLimit() {
        FilmRepository films = new FilmRepository(15);

        films.save(film1);
        films.save(film2);
        films.save(film3);
        films.save(film4);
        films.save(film5);
        films.save(film6);
        films.save(film7);
        films.save(film8);
        films.save(film9);
        films.save(film10);
        films.save(film11);
        films.save(film12);
        films.save(film13);
        films.save(film14);

        FilmItem[] actual = films.findLast();
        FilmItem[] expected = {film14, film13,film12, film11, film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldDeleteFilm() {
        FilmRepository films = new FilmRepository();

        films.save(film10);
        films.save(film11);
        films.save(film12);
        films.save(film13);
        films.save(film14);

        films.remove(11);

        FilmItem[] actual = films.findAll();
        FilmItem[] expected = {film10, film12, film13, film14};

        assertArrayEquals(expected, actual);
    }

}