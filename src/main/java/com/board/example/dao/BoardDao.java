package com.board.example.dao;

import com.board.example.Mapper.BoardMapper;
import com.board.example.dto.BoardDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardDao implements BoardMapper {
    @Autowired
    private SqlSession sqlSession;
    private String namespace = "com.board.example.dao.BoardMapper";

    @Override
    public List<BoardDto> selectAllBoards() {
        return sqlSession.selectList(namespace+".selectAll");
    }

    @Override
    public int insertBoard(BoardDto board) {
        return sqlSession.insert(namespace+".insertBoard");
    }

    @Override
    public int updateBoard(BoardDto board) {
        return sqlSession.update(namespace+".updateBoard");
    }

    @Override
    public int deleteBoard(Integer bno, String writer) {
        Map map = new HashMap();
        map.put("bno", bno);
        map.put("writer", writer);
        return sqlSession.delete(namespace+".deleteBoard", map);
    }

    @Override
    public BoardDto selectBoardByBno(Integer bno) {
        return sqlSession.selectOne(namespace+".selectBoardByBno", bno);
    }
}
