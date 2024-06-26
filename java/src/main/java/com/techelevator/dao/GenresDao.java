package com.techelevator.dao;

import com.techelevator.model.Genres;

import java.util.List;

public interface GenresDao {

    List<Genres> getAllGenres();

    int getGenreIdByGenreName(String name);

    String getGenreNameById(int id);
}
