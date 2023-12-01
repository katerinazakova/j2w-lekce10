package cz.czechitas.java2webapps.lekce10.service;

import cz.czechitas.java2webapps.lekce10.entity.Student;
import cz.czechitas.java2webapps.lekce10.entity.Trida;
import cz.czechitas.java2webapps.lekce10.repository.TridaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TridaService {
    private final TridaRepository tridaRepository;

    public TridaService(TridaRepository tridaRepository) {
        this.tridaRepository = tridaRepository;
    }

    public List<Trida> findAll() {
        return tridaRepository.findAll();
    }

    public Trida findById(int id) {
        return tridaRepository.findById(id).get();
    }

    public List<Student> getStudents(int id) {
        return tridaRepository.findById(id).get().getStudenti();
    }
}
