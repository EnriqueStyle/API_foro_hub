package foro.hub.api.domain.topico;

import java.time.LocalDateTime;

public record DatosListadoTopico(

        Long id,
        String titulo,
        String mensaje,
        String status,
        LocalDateTime fechaCreacion
) {


    public DatosListadoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getSinRespuesta() ? "sin respuesta" : "con respuesta" , topico.getFechaCreacion());
    }
}
