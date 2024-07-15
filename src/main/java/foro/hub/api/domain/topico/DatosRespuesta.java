package foro.hub.api.domain.topico;

import java.time.LocalDateTime;

public record DatosRespuesta(

        Long id,
        String titulo,
        String mensaje,
        String autor,
        Curso curso,
        LocalDateTime fechaCreacion
) {
}
