package br.com.professores;

import com.google.common.collect.ImmutableMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/professores")
public class ProfessoresController {

    private static final Map<Long, String> PROFESSORES = ImmutableMap.of(
            1L, "Professor 1",
            2L, "Professor 2",
            3L, "Professor 3",
            4L, "Professor 4");

    @GetMapping
    public List<String> findAll() {
        return new ArrayList<>(PROFESSORES.values());
    }

    @GetMapping(path = "/{id}")
    public String findById(@PathVariable("id") Long id) {
        return PROFESSORES.get(id);
    }

}