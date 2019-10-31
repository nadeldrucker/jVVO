package dev.nadeldrucker.jvvo.Models;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@ToString
@AllArgsConstructor
public class FindResponse {
    @SerializedName("Points") @Getter @Setter private List<Stop> stops;
    @SerializedName("ExpirationTime") @Getter @Setter private Date expirationTime;
}
