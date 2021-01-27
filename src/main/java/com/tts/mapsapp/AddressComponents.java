package com.tts.mapsapp;

import java.util.List;

import lombok.Data;

@Data
public class AddressComponents {
    private String long_name;
    private String short_name;
    private String sublocality; // City
    private String administrative_area_level_1; // State
    List<String> types;
}