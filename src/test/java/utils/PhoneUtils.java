package utils;

import one.digitalinnovation.personapi.dto.request.PhoneDTO;
import one.digitalinnovation.personapi.enums.PhoneType;
import one.digitalinnovation.personapi.model.Phone;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "1195992-9260";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .phoneType(PhoneType.MOBILE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .phoneType(PHONE_TYPE)
                .build();
    }
}
