package dev.kaio.teams;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/teams")
public class TeamController {
    @Autowired
    private TeamService teamService;
    @CrossOrigin("http://localhost:4200")
    @GetMapping
    public ResponseEntity<List<Team>> getAllTeams(){
        return new ResponseEntity<List<Team>>(teamService.allTeams(), HttpStatus.OK);
    }

    @CrossOrigin("http://localhost:4200")
    @GetMapping("/{posicao}")
    public ResponseEntity<Optional<Team>> getOneTeam(@PathVariable int posicao){
        return new ResponseEntity<Optional<Team>>(teamService.teamByPosicao(posicao), HttpStatus.OK);
    }


}
