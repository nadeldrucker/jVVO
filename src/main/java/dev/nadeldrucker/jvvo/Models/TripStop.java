package dev.nadeldrucker.jvvo.Models;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.google.gson.annotations.SerializedName;
import dev.nadeldrucker.jvvo.Connection;
import dev.nadeldrucker.jvvo.Endpoint;
import dev.nadeldrucker.jvvo.Result;
import dev.nadeldrucker.jvvo.Tools.SAP;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@ToString
@AllArgsConstructor
public class TripStop implements Comparable<TripStop> {

    @SerializedName("Id") @Getter @Setter private String id;
    @SerializedName("Place") @Getter @Setter private String place;
    @SerializedName("Name") @Getter @Setter private String name;
    @SerializedName("Position") @Getter @Setter private Position position;
    @SerializedName("Platform") @Getter @Setter private Platform platform;
    @SerializedName("Time") @Getter @Setter private Date time;

    @Override
    public int compareTo(TripStop o) {
        return o.getId().compareTo(id);
    }

    public enum Position {
        @SerializedName("Previous") Previous("Previous"),
        @SerializedName("Current") Current("Current"),
        @SerializedName("Next") Next("Next");

        private final String rawValue;

        Position(String s) {
            rawValue = s;
        }

        public String getValue() {
            return rawValue;
        }
    }

    public static void getById(
            String tripId,
            String stopId,
            Date time,
            RequestQueue queue,
            Response.Listener<Result<TripsResponse>> listener
    ) {
        Map<String, Object> data = new HashMap<>();
        data.put("tripid", tripId);
        data.put("stopid", stopId);
        data.put("time", SAP.fromDate(time));
        Connection.post(Endpoint.trip, data, listener, TripsResponse.class, queue);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
