package dev.kaio.teams;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {
    @Autowired
    private TeamsRepository teamsRepository;
    public List<Team> allTeams(){
        return teamsRepository.findAll();
    }

    public Optional<Team> oneTeam(ObjectId id){
        return teamsRepository.findById(id);
    }

    public Optional<Team> teamByPosicao(int posicao){
        return teamsRepository.findTeamByPosicao(posicao);
    }
}
