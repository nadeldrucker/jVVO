package dev.nadeldrucker.jvvo.Models;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.Date;
import java.util.List;

@ToString
@AllArgsConstructor
public class LinesResponse {
    @NonNull @SerializedName("Lines") @Getter @Setter private List<Line> lines;
    @NonNull @SerializedName("ExpirationTime") @Getter @Setter private Date expirationTime;
}
