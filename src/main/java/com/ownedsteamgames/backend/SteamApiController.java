package com.ownedsteamgames.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class SteamApiController {
        @Autowired
        private OkHttpService okHttpService;
    @GetMapping("/steam")
    public String getOwnedGames() {
        try {
            return okHttpService.getOwnedGamesFromSteam();
        } catch (IOException e) {
            return "Error fetching data.";
        }
    }

    @GetMapping("/a")
    public ResponseEntity<String> a() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

}
