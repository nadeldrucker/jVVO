package dev.nadeldrucker.jvvo.Models;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.Date;
import java.util.List;

@ToString
@AllArgsConstructor
public class POIResponse {
    @NonNull @SerializedName("Pins") @Getter @Setter private List<POI> pins;
    @NonNull @SerializedName("ExpirationTime") @Getter @Setter private Date expirationTime;
}
