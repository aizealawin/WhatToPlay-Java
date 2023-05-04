package com.example.whattoplay.videogame;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/videogame")
public class VideogameController {
    @GetMapping("/")
    public List<Videogame> getVideogames(){
        return List.of(
                new Videogame(
                        1L,
                        "Don't Starve",
                        "Poster Link",
                        "A game where you don't starve",
                        20
                )
        );
    }
}

