package test.SpringBootBoard.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.SpringBootBoard.board.entity.BoardFileEntity;


public interface BoardFileRepository extends JpaRepository<BoardFileEntity, Long> {
}
