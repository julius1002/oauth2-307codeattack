package de.ias.tubs.oauth307attack;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class RedirectAttackController {
    @GetMapping("/home")
    public String home() {
        return "<p>Login Page</p>\n" +
                "<form method='POST' action=\"/redirect\">\n" +
                "    <input placeholder='name' style='display:block;' type=\"text\" name=\"name\">\n" +
                "    <input placeholder='password' style='display:block;' type=\"password\" name=\"password\">\n" +
                "    <button type='submit'>Submit</button>\n" +
                "</form>";
    }

    /*
    change to 302 to fix attack vector
     */
    @PostMapping("/redirect")
    public ResponseEntity<?> redirectAttack(@RequestBody String body) {
        System.out.printf("as got your credentials: %s%n", body);
        return ResponseEntity.status(307).location(URI.create("http://localhost:8080/client/redirect_uri")).build();
    }

    /*
    change to GetMapping to fix attack vector
     */
    @PostMapping("/client/redirect_uri")
    public ResponseEntity<?> redirect(@RequestBody(required = false) String body) {
        System.out.printf("client got your credentials too: %s%n", body);
        return ResponseEntity.ok("<p>Hello, you were redirected to the give uri</p>");
    }
}
