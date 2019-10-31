package dev.nadeldrucker.jvvo.Models;

import dev.nadeldrucker.jvvo.GKCoordinate;
import dev.nadeldrucker.jvvo.WGSCoordinate;
import lombok.ToString;

import java.util.Optional;

@ToString
public abstract class Coordinate {
    abstract public Optional<GKCoordinate> asGK();
    abstract public Optional<WGSCoordinate> asWGS();
}
