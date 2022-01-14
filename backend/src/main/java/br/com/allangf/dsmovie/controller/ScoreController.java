package br.com.allangf.dsmovie.controller;

import br.com.allangf.dsmovie.DTO.MovieDTO;
import br.com.allangf.dsmovie.DTO.ScoreDTO;
import br.com.allangf.dsmovie.services.MovieService;
import br.com.allangf.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {


    @Autowired
    private ScoreService service;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO scoreDTO) {
        return service.saveScore(scoreDTO);
    }

}
