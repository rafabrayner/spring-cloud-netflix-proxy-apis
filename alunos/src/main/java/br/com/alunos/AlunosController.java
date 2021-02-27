package br.com.alunos;

import com.google.common.collect.ImmutableMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/alunos")
public class AlunosController {

    private static final Map<Long, String> ALUNOS = ImmutableMap.of(
            1L, "Aluno 1",
            2L, "Aluno 2",
            3L, "Aluno 3",
            4L, "Aluno 4");

    @GetMapping
    public List<String> findAll() {
        return new ArrayList<>(ALUNOS.values());
    }

    @GetMapping(path = "/{id}")
    public String findById(@PathVariable("id") Long id) {
        return ALUNOS.get(id);
    }

}