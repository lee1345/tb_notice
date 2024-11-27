package com.human.notice.repository;

import com.human.notice.vo.NoticeVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface NoticeDAO {

    static NoticeVO getNoticeById(int id) {
    }

    // 공지사항 목록 조회
    List<NoticeVO> selectAllNotices() throws Exception;

    // 특정 공지사항 조회
    NoticeVO selectNoticeById(int n_idx) throws Exception;

    // 공지사항 추가
    int insertNotice(NoticeVO noticeVO) throws Exception;

    // 공지사항 수정
    int updateNotice(NoticeVO noticeVO) throws Exception;

    // 공지사항 삭제
    int deleteNotice(int n_idx) throws Exception;
}
