package dev.nadeldrucker.jvvo;

import dev.nadeldrucker.jvvo.Models.Coordinate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@AllArgsConstructor
public class GKCoordinate extends Coordinate {

    @Getter @Setter private Double x;
    @Getter @Setter private Double y;

    @Override
    public Optional<GKCoordinate> asGK() {
        return Optional.of(this);
    }

    @Override
    public Optional<WGSCoordinate> asWGS() {
        return GaussKrueger.gk2wgs(this);
    }

}
