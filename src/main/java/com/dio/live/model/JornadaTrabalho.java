package com.dio.live.model;

import lombok.*;
import org.hibernate.annotations.Entity;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class JornadaTrabalho {
    @Id
    private long id;
    private String descricao;
}
