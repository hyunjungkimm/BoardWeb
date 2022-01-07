package com.example.board.service;

import com.example.board.domain.Board;
import com.example.board.domain.Search;
import org.springframework.data.domain.Page;

public interface BoardService {

    void insertBoard(Board board);

    void updateBoard(Board board);

    void deleteBoard(Board board);

    Board getBoard(Board board);

    Page<Board> getBoardList(Search search);
}
