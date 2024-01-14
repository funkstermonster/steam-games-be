package com.ownedsteamgames.backend;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class OkHttpService {

    private final OkHttpClient client = new OkHttpClient();
    private final String steamApiUrl = "https://api.steampowered.com/IPlayerService/GetOwnedGames/v0001/?key=94059F539FF10D000724EE157CD15377&steamid=76561199223679280&format=json&include_appinfo=true";
    public String getOwnedGamesFromSteam() throws IOException {
        Request request = new Request.Builder()
                .url(steamApiUrl)
                .build();

        try(Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
}
