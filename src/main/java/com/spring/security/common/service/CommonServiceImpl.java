package com.spring.security.common.service;

import com.fasterxml.uuid.Generators;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.nio.ByteBuffer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

/**
 * packageName    : com.spring.security.common.service
 * fileName       : CommonServiceImpl
 * author         : Administrator
 * date           : 2024-09-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-20        Administrator       최초 생성
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class CommonServiceImpl implements CommonService {
    private final PasswordEncoder encoder;

    /**
     * 타입별로 UUID를 만들어 리턴
     * @param systemType
     * @return
     */
    @Override
    public String generateUUID(String systemType) {
        UUID uuid;
        //  RFC 4122 version 4 방식으로 생성된 UUID를 반환
        uuid = Generators.randomBasedGenerator().generate();

        // URL에 포함될 수 있는 Base64 문자열로 변환
        ByteBuffer uuidBytes = ByteBuffer.wrap(new byte[16]);
        uuidBytes.putLong(uuid.getMostSignificantBits());
        uuidBytes.putLong(uuid.getLeastSignificantBits());
        String returnValue = systemType.concat(Generators.timeBasedGenerator().generate().toString().replaceAll("-", "").toUpperCase());
        log.info("generateUUID!! ... " + returnValue );
        return returnValue;
    }

    @Override
    public String encoded(String value) {
        return encoder.encode(value);
    }

    @Override
    public boolean decoded(String chkValue, String oldValue) {
        log.info("... Start Encoding!! ");
        log.info("checkValue : " + chkValue);
        log.info("oldValue   : " + oldValue);
        return encoder.matches(chkValue, oldValue);
    }

    // 현재 시간을 원하는 포맷형식으로 String 반환
    @Override
    public String getLocalDateTimeStr(String format) {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(format));
    }

}
