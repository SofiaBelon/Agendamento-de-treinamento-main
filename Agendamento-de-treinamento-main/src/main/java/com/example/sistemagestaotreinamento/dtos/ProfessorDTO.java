package com.example.sistemagestaotreinamento.dtos;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfessorDTO {
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String celular;
    private Set<AgendamentoDTO> agendamentos;
}
