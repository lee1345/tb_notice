package com.human.notice.service;

import com.human.notice.repository.NoticeDAO;
import com.human.notice.vo.NoticeVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("NoticeService")
@Transactional(propagation = Propagation.REQUIRED)
public class NoticeServiceImpl {

    // 공지사항 목록 조회
    @Override
    public List<NoticeVO> getAllNotices() throws Exception {

        // DAO를 통해 공지사항 목록을 가져옴
        return NoticeDAO.getNoticeById();
    }

    // 공지사항 상세 조회
    @Override
    public NoticeVO getNoticeById(int id) throws Exception {

        // DAO를 통해 특정 ID에 해당하는 공지사항을 가져옴
        return NoticeDAO.getNoticeById(id);
    }

}
