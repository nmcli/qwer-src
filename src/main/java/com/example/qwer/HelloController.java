package com.example.qwer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return """
            <!DOCTYPE html>
            <html lang="en">
            <head>
                <meta charset="UTF-8">
                <title>Hello World</title>
                <style>
                    body {
                        font-family: 'Segoe UI', sans-serif;
                        background: linear-gradient(to right, #74ebd5, #ACB6E5);
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        height: 100vh;
                        margin: 0;
                    }
                    .card {
                        background-color: white;
                        padding: 30px 50px;
                        border-radius: 16px;
                        box-shadow: 0 10px 20px rgba(0,0,0,0.2);
                        text-align: center;
                    }
                    h1 {
                        color: #333;
                    }
                </style>
            </head>
            <body>
                <div class="card">
                    <h1>Hello, JBoss World! 🎉</h1>
                </div>
            </body>
            </html>
        """;
    }
}
