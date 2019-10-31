package dev.nadeldrucker.jvvo;

import dev.nadeldrucker.jvvo.Models.Coordinate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@AllArgsConstructor
public class WGSCoordinate extends Coordinate {

    @Getter @Setter private Double latitude;
    @Getter @Setter private Double longitude;

    @Override
    public Optional<GKCoordinate> asGK() {
        return GaussKrueger.wgs2gk(this);
    }

    @Override
    public Optional<WGSCoordinate> asWGS() {
        return Optional.of(this);
    }

}
