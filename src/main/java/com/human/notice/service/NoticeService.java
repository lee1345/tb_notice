package com.human.notice.service;

import com.human.notice.vo.NoticeVO;

import java.util.List;

public interface NoticeService {

    //공지사항 목록 조회
    public List<NoticeVO> getAllNotices() throws Exception;

    //공지사항 상세 조회
    public NoticeVO getNoticeById(int id) throws Exception;
}
