package dev.vonner.runnerz.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RunRepository {

    private List<Run> runs = new ArrayList<>();

    List<Run> findAll() {
        return runs;
    }

    @PostConstruct
    private void init(){
        runs.add(new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5, Location.OUTDOOR));
        runs.add(new Run(2, "Second Run", LocalDateTime.now().plus(2, ChronoUnit.HOURS), LocalDateTime.now().plus(3, ChronoUnit.HOURS), 5, Location.OUTDOOR));
        runs.add(new Run(3, "Third Run", LocalDateTime.now().plus(4, ChronoUnit.HOURS), LocalDateTime.now().plus(5, ChronoUnit.HOURS), 5, Location.OUTDOOR));
    }

}
