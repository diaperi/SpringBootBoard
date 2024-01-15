package test.SpringBootBoard.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.SpringBootBoard.board.entity.BoardEntity;
import test.SpringBootBoard.board.entity.CommentEntity;

import java.util.List;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
    // select * from comment_table where board_id=? order by id desc;
    List<CommentEntity> findAllByBoardEntityOrderByIdDesc(BoardEntity boardEntity);
}
