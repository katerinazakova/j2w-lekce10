package cz.czechitas.java2webapps.lekce10.service;

import cz.czechitas.java2webapps.lekce10.repository.UcitelRepository;
import org.springframework.stereotype.Service;

@Service
public class UcitelService {
  private final UcitelRepository ucitelRepository;

  public UcitelService(UcitelRepository ucitelRepository) {
    this.ucitelRepository = ucitelRepository;
  }
}
