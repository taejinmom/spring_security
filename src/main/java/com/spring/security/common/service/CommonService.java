package com.spring.security.common.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * packageName    : com.spring.security.common
 * fileName       : service
 * author         : Administrator
 * date           : 2024-09-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-20        Administrator       최초 생성
 */
public interface CommonService {
    public String generateUUID(String systemType);
    public String encoded(String value);
    public boolean decoded(String mainValue, String chkValue);
    public String getLocalDateTimeStr(String format);

}
