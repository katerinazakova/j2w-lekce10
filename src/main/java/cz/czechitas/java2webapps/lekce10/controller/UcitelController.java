package cz.czechitas.java2webapps.lekce10.controller;

import cz.czechitas.java2webapps.lekce10.service.UcitelService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ucitel")
public class UcitelController {
  private final UcitelService ucitelService;

  public UcitelController(UcitelService ucitelService) {
    this.ucitelService = ucitelService;
  }
}
