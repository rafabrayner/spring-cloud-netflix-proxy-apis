package br.com.instituicoes;

import com.google.common.collect.ImmutableMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/instituicoes")
public class InstituicoesController {

    private static final Map<Long, String> INSTITUICOES = ImmutableMap.of(
            1L, "Instituição 1",
            2L, "Instituição 2",
            3L, "Instituição 3",
            4L, "Instituição 4");

    @GetMapping
    public List<String> findAll() {
        return new ArrayList<>(INSTITUICOES.values());
    }

    @GetMapping(path = "/{id}")
    public String findById(@PathVariable("id") Long id) {
        return INSTITUICOES.get(id);
    }

}