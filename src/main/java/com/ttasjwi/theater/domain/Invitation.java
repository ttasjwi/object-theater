package com.ttasjwi.theater.domain;

import java.time.LocalDateTime;

public class Invitation {

    /**
     * μ΄λ μΌμ
     */
    private LocalDateTime when;

    public Invitation(LocalDateTime when) {
        this.when = when;
    }

    @Override
    public String toString() {
        return "Invitation{" +
                "when=" + when +
                '}';
    }
}
