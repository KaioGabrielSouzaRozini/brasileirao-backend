package dev.kaio.teams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "teams")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team {

    @Id
    private ObjectId id;

    private int posicao;
    private int pontos;
    private Object time;
    private int jogos;
    private int vitorias;
    private int empates;
    private int derrotas;
    private int gols_pro;
    private int gols_contra;
    private int saldo_gols;
    private int aproveitamento;
    private int variacao_posicao;
    private List<String> ultimos_jogos;

}
