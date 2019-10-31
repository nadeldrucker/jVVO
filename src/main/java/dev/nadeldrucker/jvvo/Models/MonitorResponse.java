package dev.nadeldrucker.jvvo.Models;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.Date;
import java.util.List;

@ToString
@AllArgsConstructor
public class MonitorResponse {
    @NonNull @Getter @Setter @SerializedName("Name") private String stopName;
    @NonNull @Getter @Setter @SerializedName("Place") private String place;
    @NonNull @Getter @Setter @SerializedName("ExpirationTime") private Date expirationTime;
    @NonNull @Getter @Setter @SerializedName("Departures") private List<Departure> departures;
}
