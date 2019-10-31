package dev.nadeldrucker.jvvo.Models;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@ToString
@AllArgsConstructor
public class Diva {
    @NonNull @SerializedName("Number")@Getter @Setter private String number;
    @NonNull @SerializedName("Network")@Getter @Setter private String network;
}
