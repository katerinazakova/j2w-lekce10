package cz.czechitas.java2webapps.lekce10.controller;

import cz.czechitas.java2webapps.lekce10.service.RodicService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rodic")
public class RodicController {
  private final RodicService rodicService;

  public RodicController(RodicService rodicService) {
    this.rodicService = rodicService;
  }
}
