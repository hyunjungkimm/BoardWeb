package com.example.board.persisitence;

import com.example.board.domain.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<Board,Long>,
        QuerydslPredicateExecutor<Board> {
    //글 목록 검색
    @Query("SELECT b FROM Board b")
    Page<Board> getBoardList(Pageable page);
}
