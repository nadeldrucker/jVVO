package dev.nadeldrucker.jvvo.Models;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.List;

@ToString
@AllArgsConstructor
public class RoutesResponse {
    @NonNull @SerializedName("Routes") @Getter @Setter private List<Route> routes;
    @NonNull @SerializedName("SessionId") @Getter @Setter private String sessionId;
}
