package dev.nadeldrucker.jvvo.Models;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.List;

@ToString
@AllArgsConstructor
public class RouteChangeResponse {
    @NonNull @Getter @Setter @SerializedName("Lines") private List<RouteChange.Line> lines;
    @NonNull @Getter @Setter @SerializedName("Changes") private List<RouteChange> changes;
}
