package com.board.example.service;

import com.board.example.Mapper.BoardMapper;
import com.board.example.dao.BoardDao;
import com.board.example.dto.BoardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDao boardDao;


    @Override
    public int remove(Integer bno, String writer) throws Exception {
        return boardDao.deleteBoard();
    }

    @Override
    public List<BoardDto> getBoards(Map map) throws Exception {
        return boardDao.selectAllBoards();
    }

    @Override
    public int writeBoard(BoardDto boardDto) throws Exception {
        return boardDao.insertBoard(boardDto);
    }

    @Override
    public int updateBoard(BoardDto boardDto) throws Exception {
        return boardDao.updateBoard(boardDto);
    }

    @Override
    public BoardDto readBoard(Integer bno) {
        return boardDao.selectBoardByBno(bno);
    }

}
