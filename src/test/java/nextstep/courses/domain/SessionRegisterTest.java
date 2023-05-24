package nextstep.courses.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SessionRegisterTest {

    @Test
    void 강의상태가_모집중일_경우만_저장() {
        SessionRegister sessionRegister = new SessionRegister(new MockSessionRepository());

        sessionRegister.registerSession(1L);
        sessionRegister.registerSession(2L);

        assertThat(sessionRegister.count()).isEqualTo(1);
    }
}
