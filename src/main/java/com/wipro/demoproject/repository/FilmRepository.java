package com.wipro.demoproject.repository;

import org.springframework.data.repository.CrudRepository;


import com.wipro.demoproject.bean.Film;

public interface FilmRepository extends CrudRepository<Film,String>{


}
