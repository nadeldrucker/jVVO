package dev.nadeldrucker.jvvo.Models;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@ToString
@AllArgsConstructor
public class Platform {
    @NonNull @SerializedName("Name") @Getter @Setter private String name;
    @NonNull @SerializedName("Type") @Getter @Setter private String type;
}
