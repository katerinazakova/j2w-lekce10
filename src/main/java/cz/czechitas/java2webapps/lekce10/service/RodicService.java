package cz.czechitas.java2webapps.lekce10.service;

import cz.czechitas.java2webapps.lekce10.repository.RodicRepository;
import org.springframework.stereotype.Service;

@Service
public class RodicService {
  private final RodicRepository rodicRepository;

  public RodicService(RodicRepository rodicRepository) {
    this.rodicRepository = rodicRepository;
  }
}
