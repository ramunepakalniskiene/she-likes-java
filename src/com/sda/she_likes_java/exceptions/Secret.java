package com.sda.she_likes_java.exceptions;

import java.time.LocalDate;
import java.util.Objects;

public class Secret {
    private final String ourSecret;
    private LocalDate timestamp;

    public Secret(LocalDate timestamp, String ourSecret) {
        this.timestamp = timestamp;
        this.ourSecret = ourSecret;
    }

    @Override
    public String toString() {
        return "Secret{" +
                "timestamp=" + timestamp +
                ", ourSecret='" + ourSecret + '\'' +
                '}';
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public final String getOurSecret() {
        return ourSecret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Secret secret)) return false;
        return Objects.equals(getTimestamp(), secret.getTimestamp()) && Objects.equals(getOurSecret(), secret.getOurSecret());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTimestamp(), getOurSecret());
    }

}
