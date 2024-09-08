package folletto.toyproject.domain.comment.repository;

import folletto.toyproject.domain.comment.entity.CommentEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {

    List<CommentEntity> findAllByPostIdOrderByCreatedAtAsc(Long postId);
}
