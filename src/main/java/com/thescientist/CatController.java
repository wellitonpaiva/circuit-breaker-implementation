package com.thescientist;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller
public class CatController {

    @Get("/whereIsMyCat")
    @Produces(MediaType.TEXT_PLAIN)
    public String whereIsMyCat() {
        return Math.random() > 0.5 ? "Meow!" : ".....";
    }
}
