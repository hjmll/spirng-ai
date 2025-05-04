package com.hjm.repository;

import java.util.List;

/**
 * @Author: hjm
 * @Date: 2025/05/04/16:15
 * @Description:
 */
public interface ChatHistoryRepository {
    /**
     * 保存会话记录
     * @param type 业务类型 如chat service pdf
     * @param chatId 会话ID
     */
    void save(String type, String chatId);

    /**
     * 获取会话ID列表
     * @param type
     * @return
     */
    List<String> getChatIds(String type);
}
