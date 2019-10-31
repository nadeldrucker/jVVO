package dev.nadeldrucker.jvvo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@AllArgsConstructor
public class Result<T> {
    @Getter @Setter private Optional<T> response;
    @Getter @Setter private Optional<DVBError> error;
}
