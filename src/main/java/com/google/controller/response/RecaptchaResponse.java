package com.google.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecaptchaResponse {
    Boolean success;
    String challege_ts;
    String hostname;
    Double score;
    String action;
}
