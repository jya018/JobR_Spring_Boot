package com.capstone.JobR.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.capstone.JobR.board.BoardVO;

@Mapper
public interface IBoardMapper {
	//게시글 등록 기능
	int insert(BoardVO board);
	
	//게시글 목록 조회 기능 getArticleList
	List<BoardVO> getBoardList(String boardSort);
	
	//게시글 상세 조회 기능
	BoardVO getBoard(int boardNum);
	
	//게시글 수정 기능 update
	int update(int boardNum, BoardVO board);
	
	//게시글 삭제 기능 delete
	int delete(int boardNum);
	
	//게시글 조회수 처리
	int viewCnt(int boardNum);
	
	//메인 화면에서 모든 게시글 검색
	List<BoardVO> getSearchList(@Param("option") String option, @Param("keywords") String keywords);
	
	//각 카테고리내에서 검색
	List<BoardVO> getboardSearchList(@Param("boardSort") String boardSort,@Param("option") String option, @Param("keywords") String keywords);
	
	//모든 게시글 조회
	List<BoardVO> getAll();
	
	//모든 게시글 좋아요 순으로 조회
	List<BoardVO> getGoodBoard();

}
