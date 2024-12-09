package com.board.example.service;

import com.board.example.dto.BoardDto;

import java.util.List;
import java.util.Map;

public interface BoardService {
    int remove(Integer bno, String writer) throws Exception;
    List<BoardDto> getBoards(Map map) throws Exception;
    int writeBoard(BoardDto boardDto) throws Exception;
    int updateBoard(BoardDto boardDto) throws Exception;
    BoardDto readBoard(Integer bno) throws Exception;
}
