package foro.hub.api.domain.topico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface TopicoRepository extends JpaRepository<Topico, Long> {

    Page<Topico> findBySinRespuestaTrue(Pageable paginacion);
}
