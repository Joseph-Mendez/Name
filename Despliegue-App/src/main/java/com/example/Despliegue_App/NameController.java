package com.example.Despliegue_App;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NameController {

    @GetMapping("/name")
    public String getName() {
        return "Joseph Mendez";
    }
    public static class NameResponse {
        private String name;

        public NameResponse(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
