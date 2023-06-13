package org.zerock.bj2.service;

import org.springframework.transaction.annotation.Transactional;
import org.zerock.bj2.dto.ReplyDTO;

@Transactional
public interface ReplyService {
  
  Long register(ReplyDTO replyDTO);

}
