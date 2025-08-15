package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable int n) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(0);
        numeros.add(1);
        int soma = 0;
        int a, b, c = 0;
        if (n <= 0) {
            return new ExercicioDificilResponse(0, 0);
        }
        for (int i = 2; i <= n; i++) {
          numeros.add(numeros.get(i - 1) + numeros.get(i - 2));
        }

        for (int numAtual : numeros) {
            soma += numAtual;
        }

        return new ExercicioDificilResponse(numeros.get(n), soma);
    }
}
