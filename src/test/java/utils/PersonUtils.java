package utils;

import one.digitalinnovation.personapi.dto.request.PersonDTO;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    private static final String FIRST_NAME = "Fabio";
    private static final String LAST_NAME = "de Aquino";
    private static final String CPF_NUMBER = "306.737.068-69";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(1982, 4, 2);

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate("02-04-1982")
                .phoneList(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

}
