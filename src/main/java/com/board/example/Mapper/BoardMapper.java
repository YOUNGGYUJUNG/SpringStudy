package com.board.example.Mapper;

import com.board.example.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BoardMapper {
    List<BoardDto> selectAllBoards();
    List<BoardDto> selectPage(Map map);
    int deleteAll();
    int count();

    int insertBoard(BoardDto board);
    int updateBoard(BoardDto board);
    int deleteBoard(BoardDto board);
    int increaseViewCount(Integer bno);

    int searchResultCount(SearchCondition sc);
    List<BoardDto> searchSelectPage(SearchCondition sc)
    BoardDto selectBoardByBno(Integer bno);
}
